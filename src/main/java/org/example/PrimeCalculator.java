package org.example;

public class PrimeCalculator {
    private int lowerBound;
    private int upperBound;

    public PrimeCalculator(int lowerBound, int upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
        validateRange();
    }

    // Validerar intervallet
    public void validateRange() {
        if (lowerBound < 0 || upperBound > 1000 || lowerBound > upperBound) {
            throw new IllegalArgumentException("Hoppsan, fel intervall angivet!");
        }
    }

    // Metod för att räkna primtal
    public int countPrimes() {
        int count = 0;
        for (int i = lowerBound; i <= upperBound; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    // Metod för att summera primtal
    public int sumPrimes() {
        int sum = 0;
        for (int i = lowerBound; i <= upperBound; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        return sum;
    }

    // Kontrollera om ett tal är primtal
    private boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Antal primtal
    public void printCount() {
        System.out.println("Det finns " + countPrimes() + " primtal mellan " + lowerBound + " och " + upperBound + "!");
    }

    // Summan av primtal
    public void printSum() {
        System.out.println("Och den totala summan av dessa primtal är " + sumPrimes() + ".");
    }
}
