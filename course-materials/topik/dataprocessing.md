# 1. Принципы модульной архитектуры

## 1.1. Разделение ответственности (Separation of Concerns)
  
 В современных информационных системах критически важно разделять различные аспекты приложения на независимые модули:

| Модуль	| Ответственность |	Примеры |
| ------ | ----- | -----|
|Бизнес-логика	|Алгоритмы обработки данных, правила предметной области|	DataProcessor.processData()|
|Доступ к данным	|Работа с хранилищами, преобразование форматов	|FileUtils.readNumbersFromFile()|
|Пользовательский интерфейс|	Взаимодействие с пользователем, отображение данных|	ConsoleApp, WindowApp|

## 1.2. Преимущества модульного подхода

Снижение связанности (low coupling) — модули слабо зависят друг от друга

Высокая связность (high cohesion) — каждый модуль выполняет одну четкую задачу

Легкость поддержки — можно модифицировать один модуль, не затрагивая другие

Упрощенное тестирование — модули можно тестировать изолированно

# 2. Конвейерная обработка данных (Data Pipeline)

## 2.1. Концепция конвейера

Конвейер — это последовательность обработчиков данных, где выход одного обработчика становится входом для следующего.

```text
[ИСТОЧНИК]
↓
┌───────────────┐
│   СТРОКИ      │  ← Универсальный интерфейс
│   (String[])  │     между компонентами
└───────────────┘
↓
┌─────────────────────┐
│   ПАРСИНГ           │  ← String[] → List<Double>
│   (String → Double) │
└─────────────────────┘
↓
┌───────────────┐
│   ДАННЫЕ      │  ← Объекты для обработки
│   (List<Double>)│
└───────────────┘
↓
┌─────────────────────┐
│   ОБРАБОТКА         │  ← Бизнес-логика
│   (Бизнес-правила)  │
└─────────────────────┘
↓
┌─────────────────────┐
│   ФОРМАТИРОВАНИЕ    │  ← List<Double> → String[]
│   (Double → String) │
└─────────────────────┘
↓
[ПРИЕМНИК]
```

2.2. Универсальность строкового представления

String[] - это независимость от источника — файлы, консоль, TextArea, сетевые запросы. 
и возможность использовать форматы с разныеми разделителями и кодировками.


Примеры источников данных:

```java
// Из файла
String[] lines = Files.readAllLines(path).toArray(new String[0]);

// Из консоли (Scanner)
List<String> input = new ArrayList<>();
while (scanner.hasNextLine()) {
input.add(scanner.nextLine());
}
String[] lines = input.toArray(new String[0]);

// Из JavaFX TextArea
String[] lines = textArea.getText().split("\n");

// Из веб-запроса
String[] lines = httpResponse.body().split("\n");
```

# 3. Преобразования типов данных в Java

## 3.1. Иерархия представлений данных
   ```text
   Пользовательский ввод
   ↓
   Строки (String)
   ↓
   Обертки (Double)
   ↓
   Примитивы (double)
   ```
   
## 3.2. Преобразования
 
- **String ↔ Double** 
   
```  java
   // Парсинг с обработкой ошибок
   public static Double safeParse(String str) {
   try {
   return Double.parseDouble(str.trim());
   } catch (NumberFormatException | NullPointerException e) {
   return null; // или выбрасывать исключение
   }
   }
  ```


```java
// Форматирование
public static String formatNumber(Double value, int decimals) {
return String.format("%." + decimals + "f", value);
}
```

- **Массивы ↔ Коллекции**

| Направление |	Код	| Примечания |
| ----- | ---- | ----|
|Массив → List |	List<String> list = Arrays.asList(array); |	Фиксированный размер |
|Массив → ArrayList |	ArrayList<String> list = new ArrayList<>(Arrays.asList(array));|	Изменяемый размер |
|List → Массив	| String[] array = list.toArray(new String[0]);|	Современный идиом |
|List → Массив (типизированный)|	String[] array = list.toArray(new String[list.size()]);	|Старый подход |

- **Примитивы ↔ Обертки (Автораспаковка)**

```java
// Автоупаковка (autoboxing)
double primitive = 10.5;
Double wrapper = primitive; // Автоматически

// Автораспаковка (unboxing)
Double wrapper = 20.5;
double primitive = wrapper; // Автоматически

// Явные преобразования
double d1 = wrapper.doubleValue();
Double d2 = Double.valueOf(primitive);
3.3. Паттерны обработки коллекций
Императивный стиль (традиционный):
java
List<Double> result = new ArrayList<>();
for (Double num : input) {
if (num != null && num > 0) {
result.add(num * 2);
}
}
Декларативный стиль (Stream API):
java
List<Double> result = input.stream()
.filter(Objects::nonNull)
.filter(n -> n > 0)
.map(n -> n * 2)
.collect(Collectors.toList());
```

4. Обработка ошибок и исключений
   4.1. Типичные ошибки при обработке данных
   Ошибка	Причина	Способ обработки
   NumberFormatException	Некорректный формат числа	try-catch, валидация
   NullPointerException	Отсутствие значения	Проверка на null
   IndexOutOfBoundsException	Выход за границы массива	Проверка индексов
   IOException	Проблемы с файловой системой	Обработка исключений ввода-вывода
   4.2. Стратегии обработки
   Восстановление — пропуск некорректных данных с логированием

Замена — использование значений по умолчанию

Прерывание — остановка обработки при критической ошибке

Уведомление — информирование пользователя о проблеме

Пример устойчивого парсера:

```java
public List<Double> parseResilient(String[] lines) {
List<Double> numbers = new ArrayList<>();
int errorCount = 0;

    for (int i = 0; i < lines.length; i++) {
        String line = lines[i].trim();
        if (line.isEmpty()) {
            continue; // Пропуск пустых строк
        }
        
        try {
            numbers.add(Double.parseDouble(line));
        } catch (NumberFormatException e) {
            errorCount++;
            System.err.printf("Ошибка в строке %d: '%s' (пропущено)%n", 
                i + 1, line);
        }
    }
    
    if (errorCount > 0) {
        System.err.printf("Всего пропущено строк: %d%n", errorCount);
    }
    
    return numbers;
}```