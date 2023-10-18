package org.example;

import org.example.service.StringUtils;
import org.example.service.StringUtilsImpl;

public class Util {

    /**
     * Проверяет, являются ли все переданные строки положительными числами.
     *
     * @param str Массив строк для проверки.
     * @return true, если все строки являются положительными числами, в противном случае - false.
     */
    public boolean isAllPositiveNumbers(String... str) {
        StringUtils utils = new StringUtilsImpl();
        for (String s : str) {
            if (!utils.isPositiveNumber(s)) {
                return false;
            }
        }
        return true;
    }
}
