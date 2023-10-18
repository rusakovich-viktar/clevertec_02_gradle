package org.example;

import java.util.Scanner;
import org.example.service.StringUtils;
import org.example.service.StringUtilsImpl;

/**
 * Главный класс приложения для проверки, является ли введенное значение положительным числом.
 * Ввод осуществляется с клавиатуры.
 */
public class Main {
    /**
     * Основной метод приложения, запускающий взаимодействие с пользователем для проверки чисел.
     *
     * @param args Параметры командной строки (не используются).
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("Введите строку для проверки (для выхода введите 'exit' или 'q'): ");
                String input = scanner.nextLine();

                if ("exit".equalsIgnoreCase(input) || "q".equalsIgnoreCase(input)) {
                    System.out.println("Программа завершена.");
                    break;
                }
                validateAndPrintResult(input);
            }
        }
    }

    /**
     * Метод для проверки и вывода результата проверки числа.
     *
     * @param input Введенная строка для проверки.
     */
    private static void validateAndPrintResult(String input) {
        StringUtils utils = new StringUtilsImpl();

        if (utils.isPositiveNumber(input)) {
            System.out.println("Введенное значение является положительным числом.");
        } else {
            System.out.println("Введенное значение не является положительным числом.");
        }
    }
}
