package org.example.works.slideshow;

import java.io.File;
import java.io.FilenameFilter;
import java.util.NoSuchElementException;

public class ImageCollection implements Aggregate {
    private File[] files;

    public ImageCollection(File directory) {
        // Получаем все  файлы с заданным расширением
        this.files =


    }

    public Iterator getIterator() {
        return new ImageFileIterator();
    }

    // Метод для получения файла по индексу (для навигации)
    public File getFile(int index) {

    }

    public int size() {
        return files.length;
    }

    // Внутренний класс итератора
    private class ImageFileIterator implements Iterator {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {

        }

        @Override
        public Object next() {
             // Возвращать объект File
        }

        @Override
        public Object preview() {
            // Возвращать объект File
        }

        // Дополнительные методы для навигации
        public boolean haspreview() {

        }


        public void reset() {

        }

        public int getCurrentIndex() {

        }
    }
}

