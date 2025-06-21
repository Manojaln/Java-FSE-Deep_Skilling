package org.data;

public class FinancialForecasting {
	// Recursive method to calculate future value
    public static double fV(double prtValue, double interest, int duration) {
        // Base case: no more years
        if (duration == 0) {
            return prtValue;
        }
        // Recursive step
        return fV(prtValue * (1 + interest), interest, duration - 1);
    }

    public static void main(String[] args) {
        double prtValue = 10000;      // Starting amount 
        double interest = 0.10;         // 10% annual growth
        int duration = 5;                    // Forecast for 5 years
        double fv = fV(prtValue, interest, duration);
        System.out.printf("Future Value after %d years = ₹%.2f\n", duration,fv);
    }
}
