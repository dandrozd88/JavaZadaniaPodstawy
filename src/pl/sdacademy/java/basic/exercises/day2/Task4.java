package pl.sdacademy.java.basic.exercises.day2;

public class Task4 {
    public static void main(String[] args) {
        String input = "Alama,kota.akot,maAle";
        System.out.println(replaceCharacters(input));
    }

    public static String replaceCharacters(String input) {
        if (StringValidator.isValid(input)) {
//            return input
//                    .replace(",", "-STOP-")
//                    .replace(".", "-STOP-");
            return input.replaceAll("[,.]","-STOP-");
        }
        return input;
    }
}
