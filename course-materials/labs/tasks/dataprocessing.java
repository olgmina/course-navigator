/**
 * ВАРИАНТ 1: Перемещает все отрицательные числа в начало списка,
 * сохраняя их исходный относительный порядок,
 * а остальные числа — в конец.
 * { 9, -1, 3, 7, -5, -7, 1, 3, -3, 2 } → { -1, -5, -7, -3, 9, 3, 7, 1, 3, 2 }
 */
public static void processVariant1(List<Integer> list) {
    // Реализация без дополнительных списков
}

/**
 * ВАРИАНТ 2: Возвращает числа, которые остаются на своих местах
 * при сортировке исходного списка по возрастанию.
 * { 3, 1, 3, 7, 7, 5, 9, 9, 15, 12, 10 } → { 3, 7, 9, 9, 12 }
 */
public static List<Integer> processVariant2(List<Integer> list) {
    List<Integer> result = new ArrayList<>();
    // Реализация
    return result;
}

/**
 * ВАРИАНТ 3: Удаляет подряд идущие одинаковые числа,
 * оставляя только первое вхождение.
 * { 2, 11, 11, 11, 2, 3, 2, 2, 6, 6 } → { 2, 11, 2, 3, 2, 6 }
 */
public static List<Integer> processVariant3(List<Integer> list) {
    List<Integer> result = new ArrayList<>();
    // Реализация
    return result;
}

/**
 * ВАРИАНТ 4: Возвращает отсортированный по возрастанию список,
 * состоящий из элементов двух исходных списков.
 * ({ 3, 9, 2, 7 }, { 8, 3, 5 }) → { 2, 3, 3, 5, 7, 8, 9 }
 */
public static List<Integer> processVariant4(List<Integer> list1, List<Integer> list2) {
    List<Integer> result = new ArrayList<>();
    // Реализация без использования Collections.sort()
    return result;
}

/**
 * ВАРИАНТ 5: Возвращает числа, встречающиеся в списке n или более раз
 * (по одному разу в результате).
 * ({ 7, 2, 3, 2, 2, 6, 5, 7, 8, 8, 3 }, 2) → { 7, 2, 3, 8 }
 */
public static List<Integer> processVariant5(List<Integer> list, int n) {
    List<Integer> result = new ArrayList<>();
    // Реализация
    return result;
}

/**
 * ВАРИАНТ 6: Возвращает элементы первого списка,
 * которых нет во втором списке.
 * ({ 4, 5, 2, 1, 7, 5, 2 }, { 5, 1, 8, 9 }) → { 4, 2, 7, 2 }
 */
public static List<Integer> processVariant6(List<Integer> list1, List<Integer> list2) {
    List<Integer> result = new ArrayList<>();
    // Реализация
    return result;
}

/**
 * ВАРИАНТ 7: Возвращает элементы, которые есть только в одном из списков
 * (но не в обоих одновременно).
 * ({ 2, 3, 7, 0, 8 }, { -1, 3, 7, -5, -8 }) → { 2, 0, 8, -1, -5, -8 }
 */
public static List<Integer> processVariant7(List<Integer> list1, List<Integer> list2) {
    List<Integer> result = new ArrayList<>();
    // Реализация
    return result;
}

/**
 * ВАРИАНТ 8: Сортирует только положительные элементы,
 * оставляя отрицательные и нули на своих местах.
 * { 9, -1, 3, 7, -5, -7, 1, 3 } → { 1, -1, 3, 3, -5, -7, 7, 9 }
 */
public static void processVariant8(List<Integer> list) {
    // Реализация без дополнительных списков
}

/**
 * ВАРИАНТ 9: Разворачивает последовательность между первым максимальным
 * и последним минимальным элементом.
 * { 2, 11, 8, 11, 2, 3, 2, 6, 7, 2 } → { 2, 11, 7, 6, 2, 3, 2, 11, 8, 2 }
 */
public static void processVariant9(List<Integer> list) {
    // Реализация
}

/**
 * ВАРИАНТ 10: Находит подпоследовательность подряд идущих чисел
 * с максимальной суммой.
 * { -2, 1, -3, 4, -1, 2, 1, -5, 4 } → { 4, -1, 2, 1 }
 */
public static List<Integer> processVariant10(List<Integer> list) {
    List<Integer> result = new ArrayList<>();
    // Реализация в один проход
    return result;
}

/**
 * ВАРИАНТ 11: Находит самую длинную строго возрастающую подпоследовательность
 * (не обязательно подряд идущих чисел).
 * { 10, 22, 9, 33, 21, 50, 41, 60, 80 } → { 10, 22, 33, 50, 60, 80 }
 */
public static List<Integer> processVariant11(List<Integer> list) {
    List<Integer> result = new ArrayList<>();
    // Реализация (динамическое программирование)
    return result;
}

/**
 * ВАРИАНТ 12: Находит максимальную по длине симметричную подпоследовательность
 * (палиндром из чисел).
 * { 1, 2, 3, 2, 1, 4, 5, 4, 1 } → { 1, 2, 3, 2, 1 }
 */
public static List<Integer> processVariant12(List<Integer> list) {
    List<Integer> result = new ArrayList<>();
    // Реализация
    return result;
}

/**
 * ВАРИАНТ 13: Переставляет элементы так, чтобы положительные и отрицательные
 * числа чередовались. Если одного знака больше, оставляет их в конце.
 * { -1, 2, -3, 4, 5, 6, -7, 8, 9 } → { -1, 2, -3, 4, -7, 5, 6, 8, 9 }
 */
public static void processVariant13(List<Integer> list) {
    // Реализация без дополнительных списков
}

/**
 * ВАРИАНТ 14: Заменяет последовательные целые числа диапазоном [start-end]
 * в виде строк (возвращает List<Object> с Integer и String).
 * { 1, 2, 3, 5, 6, 7, 9, 11, 12, 13 } → [1-3, 5-7, 9, 11-13]
 */
public static List<Object> processVariant14(List<Integer> list) {
    List<Object> result = new ArrayList<>();
    // Реализация
    return result;
}

/**
 * ВАРИАНТ 15: Находит все уникальные комбинации из 3 чисел,
 * сумма которых равна заданному значению target.
 * ({ -1, 0, 1, 2, -1, -4 }, 0) → [[-1, -1, 2], [-1, 0, 1]]
 */
public static List<List<Integer>> processVariant15(List<Integer> list, int target) {
    List<List<Integer>> result = new ArrayList<>();
    // Реализация
    return result;
}

/**
 * ВАРИАНТ 16: Выполняет циклический сдвиг списка на k позиций вправо.
 * Если k < 0 - сдвиг влево. Не использует дополнительный список.
 * { 1, 2, 3, 4, 5, 6, 7 } с k=3 → { 5, 6, 7, 1, 2, 3, 4 }
 */
public static void processVariant16(List<Integer> list, int k) {
    // Реализация без дополнительных списков
}

/**
 * ВАРИАНТ 17: Находит наибольшее произведение двух чисел в списке.
 * Возвращает пару чисел и их произведение.
 * { 1, 10, 2, 6, 5, 3 } → [10, 6, 60]
 */
public static List<Integer> processVariant17(List<Integer> list) {
    List<Integer> result = new ArrayList<>();
    // Реализация
    return result;
}

/**
 * ВАРИАНТ 18: Группирует числа по сумме цифр и возвращает группу
 * с максимальным количеством элементов.
 * { 12, 21, 34, 43, 55, 123, 456 } → [12, 21, 123] (сумма цифр=3)
 */
public static List<Integer> processVariant18(List<Integer> list) {
    List<Integer> result = new ArrayList<>();
    // Реализация
    return result;
}

/**
 * ВАРИАНТ 19: Находит числа, которые больше среднего арифметического
 * всех элементов списка, и возвращает их в порядке убывания.
 * { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 } → [10, 9, 8, 7, 6] (среднее=5.5)
 */
public static List<Integer> processVariant19(List<Integer> list) {
    List<Integer> result = new ArrayList<>();
    // Реализация
    return result;
}

/**
 * ВАРИАНТ 20: Преобразует список в "зигзагообразный" порядок:
 * a[0] < a[1] > a[2] < a[3] > a[4] ...
 * { 4, 3, 7, 8, 6, 2, 1 } → { 3, 7, 4, 8, 2, 6, 1 }
 */
public static void processVariant20(List<Integer> list) {
    // Реализация без сортировки
}

/**
 * ВАРИАНТ 21: Находит самый частый элемент (моду). Если несколько,
 * возвращает наименьший.
 * { 1, 3, 2, 1, 4, 1, 3, 2, 3, 3 } → 3
 */
public static Integer processVariant21(List<Integer> list) {
    // Реализация
    return 0;
}

/**
 * ВАРИАНТ 22: Разделяет список на два: четные и нечетные числа,
 * сохраняя относительный порядок в каждой группе.
 * { 1, 2, 3, 4, 5, 6, 7, 8 } → { 2, 4, 6, 8, 1, 3, 5, 7 }
 */
public static void processVariant22(List<Integer> list) {
    // Реализация без дополнительных списков
}

/**
 * ВАРИАНТ 23: Находит "лидера" - элемент, который встречается
 * более чем n/2 раз. Если нет - возвращает null.
 * { 2, 2, 1, 1, 1, 2, 2 } → 2
 */
public static Integer processVariant23(List<Integer> list) {
    // Реализация за O(n) времени и O(1) дополнительной памяти
    return null;
}

/**
 * ВАРИАНТ 24: Удаляет все дубликаты из списка, оставляя только
 * первое вхождение каждого элемента.
 * { 1, 2, 3, 1, 2, 4, 5, 4 } → { 1, 2, 3, 4, 5 }
 */
public static List<Integer> processVariant24(List<Integer> list) {
    List<Integer> result = new ArrayList<>();
    // Реализация без использования Set
    return result;
}

/**
 * ВАРИАНТ 25: Находит пропущенные числа в диапазоне от min до max.
 * { 4, 7, 1, 9, 3 } → [2, 5, 6, 8] (диапазон 1-9)
 */
public static List<Integer> processVariant25(List<Integer> list) {
    List<Integer> result = new ArrayList<>();
    // Реализация
    return result;
}

/**
 * ВАРИАНТ 26: Проверяет, можно ли разделить список на две группы
 * с одинаковой суммой (задача о разделе).
 * { 1, 5, 11, 5 } → true (группы: [1, 5, 5] и [11])
 */
public static boolean processVariant26(List<Integer> list) {
    // Реализация
    return false;
}

/**
 * ВАРИАНТ 27: Находит максимальную разность между двумя элементами,
 * где меньший элемент стоит перед большим (максимальная прибыль).
 * { 7, 1, 5, 3, 6, 4 } → 5 (покупка по 1, продажа по 6)
 */
public static int processVariant27(List<Integer> list) {
    // Реализация
    return 0;
}

/**
 * ВАРИАНТ 28: Сортирует список по частоте встречаемости элементов
 * (от наиболее частых к наименее частым). При равенстве частот
 * сохраняет порядок появления.
 * { 2, 3, 2, 4, 5, 12, 2, 3, 3, 3, 12 } → { 3, 3, 3, 3, 2, 2, 2, 12, 12, 4, 5 }
 */
public static void processVariant28(List<Integer> list) {
    // Реализация
}

/**
 * ВАРИАНТ 29: Находит самую длинную подпоследовательность,
 * состоящую из одинаковых элементов.
 * { 1, 2, 2, 3, 3, 3, 2, 2, 1, 1, 1, 1 } → [1, 1, 1, 1]
 */
public static List<Integer> processVariant29(List<Integer> list) {
    List<Integer> result = new ArrayList<>();
    // Реализация
    return result;
}

/**
 * ВАРИАНТ 30: Переворачивает список задом наперёд без использования
 * дополнительного списка или стандартных методов разворота.
 * { 1, 2, 3, 4, 5 } → { 5, 4, 3, 2, 1 }
 */
public static void processVariant30(List<Integer> list) {
    // Реализация без Collections.reverse()
}
