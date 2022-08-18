package pl.sdacademy.unit.test.advance.exercises.task1;

public class Calculator {
    public static int multiply(int firstDigit, int secondDigit) {
        return firstDigit * secondDigit;
    }

    public static int divide(int firstDigit, int secondDigit) {
        if(secondDigit == 0) {
            throw new IllegalArgumentException("Nie dziel przez zero!");
        }
        return firstDigit / secondDigit;
    }
}
