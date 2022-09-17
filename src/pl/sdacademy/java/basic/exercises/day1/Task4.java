package pl.sdacademy.java.basic.exercises.day1;

import java.util.Scanner;

public class Task4 {
    private static final float BMI_MIN_RANGE = 15.5F;
    private static final float BMI_MAX_RANGE = 24.9F;
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        float weight = getWeightInKilograms();
        int height = getHeightInCentymiters();
        float bmi = calculateBMI(weight, height);
        displayIfBMIIsOptimal(bmi);

    }


    public static float getWeightInKilograms() {
        System.out.print("Please insert weight in kg: ");
        return scanner.nextFloat();
    }

    public static int getHeightInCentymiters() {
        System.out.print("Please insert height in cm: ");
        return scanner.nextInt();

    }

    public static float calculateBMI(float weight, int height) {
        float heightInMeter = height / 100F;
        return weight / (heightInMeter * heightInMeter);
    }

    public static void displayIfBMIIsOptimal(float bmi) {
        if (BMI_MIN_RANGE >= 15.5 && BMI_MAX_RANGE <= 24.9) {
            System.out.println("BMI is correct " + bmi);
        } else {
            System.out.println("BMI is not correct " + bmi);
        }
    }
}
