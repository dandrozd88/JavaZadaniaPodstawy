package pl.sdacademy.java.basic.exercises.day2;

public class Task14 {
    public static void main(String[] args) {
        int[] inputs = {12, -7, 19, -5};
        int lenghtNegativeArray = countHowManyNegatives(inputs);
        if (lenghtNegativeArray > 0) {
            int[] result = makeArrayWithNegatives(inputs, lenghtNegativeArray);
            for (int elements : result) {
                System.out.println(elements);
            }
        }
    }

    private static int[] makeArrayWithNegatives(int[] inputs, int lenghtNegativeArray) {
        int[] array = new int[lenghtNegativeArray];
        for (int i = 0, j = 0; i < inputs.length; i++) {
            if (inputs[i] < 0) {
                array[j++] = inputs[i];
            }
        }
        return array;
    }

    private static int countHowManyNegatives(int[] inputs) {
        int count = 0;
        for (int elements : inputs) {
            if (elements < 0) {
                count++;
            }
        }
        return count;
    }
}

