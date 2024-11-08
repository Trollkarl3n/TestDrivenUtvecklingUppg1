package org.example;

public class PrimeCalculator {
    private int lowerBound;
    private int upperBound;
    private int primeCount;
    private int primeSum;

    public PrimeCalculator(int lowerBound, int upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
        validateRange();
        calculatePrimes();
    }

    // Validering av inmatningsintervallet
    private void validateRange() {
        if (lowerBound < 0 || upperBound > 1000 || lowerBound > upperBound) {
            throw new IllegalArgumentException("Hoppsan, fel intervall angivet!");
        }
    }

    // Beräkna primtal inom intervallet och lagra antal och summa
    private void calculatePrimes() {
        primeCount = 0;
        primeSum = 0;
        for (int i = lowerBound; i <= upperBound; i++) {
            if (isPrime(i)) {
                primeCount++;
                primeSum += i;
            }
        }
    }

    // Kontrollera om ett tal är ett primtal
    private boolean isPrime(int number) {
        if (number < 2) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Getter för antal primtal
    public int getPrimeCount() {
        return primeCount;
    }

    // Getter för summan av primtal
    public int getPrimeSum() {
        return primeSum;
    }

    // Utskriftsmetoder
    public void printCount() {
        System.out.println("Hej, det finns " + primeCount + " primtal mellan " + lowerBound + " och " + upperBound + "!");
    }

    public void printSum() {
        System.out.println("Och den totala summan av dessa primtal är " + primeSum + ".");
    }
}