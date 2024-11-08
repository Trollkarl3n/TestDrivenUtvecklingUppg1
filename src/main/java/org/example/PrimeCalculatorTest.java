package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PrimeCalculatorTest {

    @Test
    @DisplayName("Testar ogiltigt intervall: Nedre gräns under 0")
    void testInvalidRangeLowerBoundBelowZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            new PrimeCalculator(-10, 100);
        }, "Ska kasta IllegalArgumentException för intervall under 0");
    }

    @Test
    @DisplayName("Testar ogiltigt intervall: Övre gräns över 1000")
    void testInvalidRangeUpperBoundAboveThousand() {
        assertThrows(IllegalArgumentException.class, () -> {
            new PrimeCalculator(10, 1500);
        }, "Ska kasta IllegalArgumentException för intervall över 1000");
    }

    @Test
    @DisplayName("Testar ogiltigt intervall: Nedre gräns större än övre gräns")
    void testInvalidRangeLowerBoundGreaterThanUpperBound() {
        assertThrows(IllegalArgumentException.class, () -> {
            new PrimeCalculator(100, 50);
        }, "Ska kasta IllegalArgumentException för intervall där nedre gräns är större än övre gräns");
    }

    @Test
    @DisplayName("Testar giltigt intervall: Antal primtal mellan 0 och 10")
    void testValidRangePrimeCount0to10() {
        PrimeCalculator calculator = new PrimeCalculator(0, 10);
        assertEquals(4, calculator.getPrimeCount(), "Ska vara 4 primtal mellan 0 och 10");
    }

    @Test
    @DisplayName("Testar giltigt intervall: Summan av primtal mellan 0 och 10")
    void testValidRangePrimeSum0to10() {
        PrimeCalculator calculator = new PrimeCalculator(0, 10);
        assertEquals(17, calculator.getPrimeSum(), "Summan av primtal mellan 0 och 10 ska vara 17");
    }

    @Test
    @DisplayName("Testar giltigt intervall: Antal primtal mellan 0 och 100")
    void testValidRangePrimeCount0to100() {
        PrimeCalculator calculator = new PrimeCalculator(0, 100);
        assertEquals(25, calculator.getPrimeCount(), "Ska vara 25 primtal mellan 0 och 100");
    }

    @Test
    @DisplayName("Testar giltigt intervall: Summan av primtal mellan 0 och 100")
    void testValidRangePrimeSum0to100() {
        PrimeCalculator calculator = new PrimeCalculator(0, 100);
        assertEquals(1060, calculator.getPrimeSum(), "Summan av primtal mellan 0 och 100 ska vara 1060");
    }

    @Test
    @DisplayName("Testar giltigt intervall: Antal primtal mellan 100 och 200")
    void testValidRangePrimeCount100to200() {
        PrimeCalculator calculator = new PrimeCalculator(100, 200);
        assertEquals(21, calculator.getPrimeCount(), "Ska vara 21 primtal mellan 100 och 200");
    }

    @Test
    @DisplayName("Testar giltigt intervall: Summan av primtal mellan 100 och 200")
    void testValidRangePrimeSum100to200() {
        PrimeCalculator calculator = new PrimeCalculator(100, 200);
        assertEquals(3167, calculator.getPrimeSum(), "Summan av primtal mellan 100 och 200 ska vara 3167");
    }
}
