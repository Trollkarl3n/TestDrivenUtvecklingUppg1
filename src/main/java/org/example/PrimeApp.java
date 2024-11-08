package org.example;

import java.util.Scanner;

public class PrimeApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Ange nedre gräns (0-1000): ");
            int lowerBound = scanner.nextInt();

            System.out.println("Ange övre gräns (0-1000): ");
            int upperBound = scanner.nextInt();

            try {
                PrimeCalculator calculator = new PrimeCalculator(lowerBound, upperBound);
                calculator.printCount();
                calculator.printSum();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            System.out.println("Vill du köra igen? (ja/nej): ");
            String choice = scanner.next();
            if (!choice.equalsIgnoreCase("ja")) {
                System.out.println("Tack för att du använde programmet!");
                break;
            }
        }

        scanner.close();
    }
}

