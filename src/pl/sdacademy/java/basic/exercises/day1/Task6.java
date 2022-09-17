package pl.sdacademy.java.basic.exercises.day1;

public class Task6 {
    public static void main(String[] args) {
        printMultiplicationTable(6, 2, 5);
    }

    public static void printMultiplicationTable(int multiplier, int minMultiplicand, int maxMultiplicand) {
        int sum = 0;
        while (minMultiplicand <= maxMultiplicand) {
            sum = multiplier * minMultiplicand;
            System.out.println(multiplier + " x " + minMultiplicand + " = " + sum);
            minMultiplicand++;

        }
    }
}

//        int sum = 0;
//        for (int i = 1; i <= 4; i++){
//            sum = 5 * i;
//            System.out.println("5 x " + i + " = " + sum);
//        }
//        int sum = 0;
//        for (int i = minMultiplicand; i <= maxMultiplicand; i++) {
//            sum = multiplier * i;
//            System.out.println(multiplier + " x " + i + " = " + sum);