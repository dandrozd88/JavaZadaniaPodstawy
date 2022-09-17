package pl.sdacademy.java.basic.exercises.day1;

public class Task5 {
    public static void main(String[] args) {
        int firstDigit = 4;
        int secondDigit = 11;
        int sum = sumOfTheSequance(firstDigit, secondDigit);
        System.out.println(" Sum: " + sum);

    }

    private static int sumOfTheSequance(int firstDigit, int secondDigit) {
        int sum = 0;
        for (int i = firstDigit; i <= secondDigit; i++){
            sum += i;
        }

//        while(firstDigit<=secondDigit){
//            sum+= firstDigit;
//            firstDigit++;
//        }
//        int i = firstDigit;
//        do{
//            sum+= i;
//            i++;
//
//        }while(i<=secondDigit);
            return sum;
    }
}
