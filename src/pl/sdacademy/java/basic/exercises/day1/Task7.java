package pl.sdacademy.java.basic.exercises.day1;

import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {
        float number1 = getFirstNumber();
        char sign = getartmeticSign();
        float number2 = getSecondNumber();
        float sum = calculateTwoNumbers(number1, sign, number2);
        System.out.println(sum);

    }

    private static float getSecondNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj drugą liczbę: ");
        return scanner.nextFloat();
    }

    private static char getartmeticSign() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj znak + - / *: ");
        char c = scanner.next().charAt(0);
        return c;
    }

    private static float getFirstNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj pierwszą liczbę: ");
        return scanner.nextFloat();
    }

    public static float calculateTwoNumbers(float number1, char sign, float number2) {
        if (sign == '+') {
            return number1 + number2;
        } else if (sign == '-') {
            return number1 - number2;
        } else if (sign == '*') {
            return number1 * number2;
        } else if (sign == '/') {
            return number1 / number2;
        } else {
            String s = "Operator not exist";
            return Float.parseFloat(s);
        }
    }
}