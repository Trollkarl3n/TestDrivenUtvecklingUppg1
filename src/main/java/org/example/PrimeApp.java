package org.example;

import java.util.Scanner;

public class PrimeApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueRunning = true;

        while (continueRunning) {
            // primtalsberäkning
            System.out.print("Ange nedre gräns (0-1000): ");
            int lowerBound = scanner.nextInt();

            System.out.print("Ange övre gräns (0-1000): ");
            int upperBound = scanner.nextInt();

            try {
                // PrimeCalculator med gränser
                PrimeCalculator calculator = new PrimeCalculator(lowerBound, upperBound);
                calculator.printCount();
                calculator.printSum();
            } catch (IllegalArgumentException e) {
                // Felmeddelande vid ogiltigt intervall
                System.out.println(e.getMessage());
            }

            // Köra programmet igen
            System.out.print("Vill du köra programmet igen? (ja/nej): ");
            String answer = scanner.next().trim().toLowerCase();

            if (!answer.equals("ja")) {
                // "ja", avsluta programmet
                continueRunning = false;
            }
        }

        System.out.println("Programmet avslutas. Tack för att du använde primtal-räknaren!");
        scanner.close();
    }
}

