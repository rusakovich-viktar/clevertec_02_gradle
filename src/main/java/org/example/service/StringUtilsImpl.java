package org.example.service;

/**
 * Реализация интерфейса StringUtils для работы с числами и строками.
 */
public class StringUtilsImpl implements StringUtils {

    /**
     * Проверяет, является ли переданная строка положительным числом.
     *
     * @param str Строка для проверки.
     * @return true, если строка представляет собой положительное число, иначе false.
     */
    @Override
    public boolean isPositiveNumber(String str) {
        if (str == null || str.trim().isEmpty()) {
            return false;
        }
        try {
            double number = Double.parseDouble(str.replace(",", "."));
            if (number <= 0) {
                return false;
            }
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}