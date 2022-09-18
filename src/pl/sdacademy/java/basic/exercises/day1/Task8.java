package pl.sdacademy.java.basic.exercises.day1;

public class Task8 {
    public static void main(String[] args) {
        boolean primeNumber = isPrimeNumber(73);
        System.out.println(primeNumber);
    }

    private static boolean isPrimeNumber(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i < number/2; i++) {
            System.out.println("here: " + i );
            if (number % 2 == 0) {
                return false;
            }

        }
        return true;
    }
}
