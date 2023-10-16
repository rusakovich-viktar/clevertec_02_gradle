package org.example;

import java.util.Scanner;
import org.example.service.StringUtils;
import org.example.service.StringUtilsImpl;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("Введите строку для проверки (для выхода введите 'exit' или 'q'): ");
                String input = scanner.nextLine();

                if (input.equalsIgnoreCase("exit") || input.equalsIgnoreCase("q")) {
                    System.out.println("Программа завершена.");
                    break;
                }
                validateAndPrintResult(input);
            }
        }
    }

    private static void validateAndPrintResult(String input) {
        StringUtils utils = new StringUtilsImpl();

        if (utils.isPositiveNumber(input)) {
            System.out.println("Введенное значение является положительным числом.");
        } else {
            System.out.println("Введенное значение не является положительным числом.");
        }
    }
}
