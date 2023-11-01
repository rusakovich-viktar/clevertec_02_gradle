package org.example.service;

/**
 * Реализация интерфейса StringUtils для работы с числами и строками.
 */
public class StringUtils {

    /**
     * Проверяет, является ли переданная строка положительным числом.
     *
     * @param str Строка для проверки.
     * @return true, если строка представляет собой положительное число, иначе false.
     */
    public boolean isPositiveNumber(String str) {
        if (str == null || str.trim().isEmpty()) {
            return false;
        }
        try {
            double number = Double.parseDouble(str.replace(",", "."));
            return !(number <= 0);
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
