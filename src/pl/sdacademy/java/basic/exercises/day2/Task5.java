package pl.sdacademy.java.basic.exercises.day2;

public class Task5 {
    public static void main(String[] args) {
String input = "Ala ma kota";
char letter = 'a';
        System.out.println(countCharactersInInput(input, letter));
    }
    public static int countCharactersInInput (String input, char letter){
        int numberofChar = 0;
        if (StringValidator.isValid(input)) {
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == letter) {
                    numberofChar++;
                }
            }
        }
        return numberofChar;
    }
}
