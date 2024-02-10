package org.example;

public class App {
    public static void main(String[] args) {

        Util util = new Util();
        boolean result = util.isAllPositiveNumbers("-4", "79");
        System.out.println("Are all positive numbers: " + result);
    }
}
