package pl.sda.arp4.inheritance.wyjatkiZadanie;

import java.util.Scanner;

public class MainTry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę a: ");
        int a = scanner.nextInt();
        System.out.println("Podaj liczbę b: ");
        int b = scanner.nextInt();

        try {
            double wynikDzielenia = a / b;
            System.out.println("Wynik dzielenia to: " + wynikDzielenia);
        } catch (ArithmeticException ae) {
            System.out.println("Pamiętaj cholero by nie dzielić przez '0'");
        }
    }
}
