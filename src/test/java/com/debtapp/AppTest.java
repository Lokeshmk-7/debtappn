package com.debtapp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
class AppTest {
    /**
     * Rigorous Test.
     */
    @Test
    void testApp() {
        assertEquals(1, 1);
    }

    @Test
    public void testcalclateMonthlyInterest(){
        double monthlyInterest = App.calclateMonthlyInterest(1000, 12);
        assertEquals(10.0, monthlyInterest);
    }

    @Test
    public void testcalculateOverallDebt(){
        double overallDebt = App.calculateOverallDebt(1000, 10.0, 12);
        assertEquals(1120.0, overallDebt);
    }
}
