package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PrimeCalculatorTest {

    @Test
    void testCountPrimesInValidRange() {
        PrimeCalculator calculator = new PrimeCalculator(0, 1000);
        assertEquals(168, calculator.countPrimes());
    }

    @Test
    void testSumPrimesInValidRange() {
        PrimeCalculator calculator = new PrimeCalculator(0, 1000);
        assertEquals(76127, calculator.sumPrimes());
    }

    //@Test
    //void testInvalidRange() {
        //PrimeCalculator calculator = new PrimeCalculator(-10, 1500);
        //assertThrows(IllegalArgumentException.class, calculator::validateRange);
    //}
    @Test
    void testInvalidRange() {
        assertThrows(IllegalArgumentException.class, () ->{
           new PrimeCalculator(-10, 1500);
        });
    }
}
