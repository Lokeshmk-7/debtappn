package com.debtapp;

import java.util.Scanner;

/**
 * Hello world!
 */
public final class App {

    /**
     * Maximum months in a year.
     */
    public static final int MONTHS_IN_A_YEAR = 12;

    /**
     * Constant for conversion to percentage.
     */
    public static final int FOR_PRECENTAGE_CONVERSION = 100;

    private App() {
    }

    public static double calclateMonthlyInterest(double debtValue, double interestRate) {
        return (debtValue * interestRate) / (MONTHS_IN_A_YEAR * FOR_PRECENTAGE_CONVERSION);
    }

    public static double calculateOverallDebt(double debtValue, double monthlyRate, int paybackDuration) {
        return debtValue + monthlyRate * paybackDuration;
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter debt value (in Euros): ");
        double debtValue = scanner.nextDouble();

        System.out.println("Enter interest rate (in Percentage): ");
        double interestRate = scanner.nextDouble();

        System.out.println("Enter payback duration (in Months): ");
        int paybackDuration = scanner.nextInt();

        double monthlyInterest = calclateMonthlyInterest(debtValue, interestRate);
        double overallDebt = calculateOverallDebt(debtValue, monthlyInterest, paybackDuration);

        System.out.println("\nMonthly interest: " + monthlyInterest);
        System.out.println("\nOverall debt: " + overallDebt + " Euros");

    }
}
