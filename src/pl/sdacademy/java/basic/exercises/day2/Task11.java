package pl.sdacademy.java.basic.exercises.day2;

public class Task11 {
    public static void main(String[] args) {
        String input = "kajak";
        System.out.println(isPalindrom(input));
    }

    public static boolean isPalindrom(String input) {
        if (StringValidator.isValid(input)) {
            String backword = new StringBuilder(input)
                    .reverse()
                    .toString();


            return input.equalsIgnoreCase(backword);

        }
        return false;
    }
}
