package pl.sdacademy.java.basic.exercises.day2;

public class Task13 {
    public static void main(String[] args) {
        int[] inputs = {12, 7, 19};
        System.out.println(getMinValue(inputs));
        System.out.println(getMaxValue(inputs));
        System.out.println(sum(inputs));
    }

    private static int getMinValue(int[] inputs) {
        int minValue = inputs[0];
        for (int elements : inputs) {
            if (elements < minValue) {
                minValue = elements;
            }
        }
        return minValue;
    }

    private static int getMaxValue(int[] inputs) {
        int maxValue = inputs[0];
        for (int elements : inputs) {
            if (elements > maxValue) {
                maxValue = elements;
            }
        }
        return maxValue;
    }

    private static int sum(int[] inputs) {
        int sum = 0;
        for (int elements : inputs) {
            sum += elements;
        }
        return sum;
    }
}

