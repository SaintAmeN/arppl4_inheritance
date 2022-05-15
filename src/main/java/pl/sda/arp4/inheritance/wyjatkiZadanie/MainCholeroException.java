package pl.sda.arp4.inheritance.wyjatkiZadanie;

import java.util.Scanner;

public class MainCholeroException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę a: ");
        int a = scanner.nextInt();
        System.out.println("Podaj liczbę b: ");
        int b = scanner.nextInt();

        if (b == 0) {
            throw new CholeroException();
        } else {
            double wynikDzielenia = a / b;
            System.out.println("Wynik dzielenia to: " + wynikDzielenia);
        }
    }
}
