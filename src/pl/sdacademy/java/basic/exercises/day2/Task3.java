package pl.sdacademy.java.basic.exercises.day2;

public class Task3 {
    public static void main(String[] args) {
        String input = "Ala ma kota";

        String word = "ma";
        System.out.println("Word: " + word);
        System.out.println("Result: " + getPosition(input, word));

        word = "psa";
        System.out.println("Word: " + word);
        System.out.println("Result: " + getPosition(input, word));

        word = null;
        System.out.println("Word: " + word);
        System.out.println("Result: " + getPosition(input, word));
    }

    public static int getPosition(String input, String word) {
        if (StringValidator.isValid(input) && StringValidator.isValid(word)) {
            return input.indexOf(word);
        }
        return -1;
    }
}
