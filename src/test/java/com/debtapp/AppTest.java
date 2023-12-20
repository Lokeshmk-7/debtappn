package com.debtapp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
class AppTest {

    public static final int DEBT = 1000;
    public static final int MONTHS_IN_A_YEAR = 12;
    public static final double MONTHLY_INTEREST = 10.0;
    public static final double OVERALL_DEBT = 1120.0;

    /**
     * Rigorous Test.
     */

    @Test
    public void testcalclateMonthlyInterest() {
        double monthlyInterest = App.calclateMonthlyInterest(DEBT, MONTHS_IN_A_YEAR);
        assertEquals(MONTHLY_INTEREST, monthlyInterest);
    }

    @Test
    public void testcalculateOverallDebt() {
        double overallDebt = App.calculateOverallDebt(DEBT, MONTHLY_INTEREST, MONTHS_IN_A_YEAR);
        assertEquals(OVERALL_DEBT, overallDebt);
    }
}
