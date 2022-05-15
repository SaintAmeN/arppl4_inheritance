package pl.sda.arp4.inheritance.koszykzakupowy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // - stworzymy scanner
        Scanner scanner = new Scanner(System.in);

        // - poprosimy użytkownika o ilość produktów (N)(iloscProduktow) które będą na rachunku
        System.out.println("Podaj ilość produktów (N):");
        int iloscProduktow = scanner.nextInt();
//        scanner.nextLine(); // dummy/sztuczne wczytanie linii ponieważ nextInt wczyta kliknięcie enter.

        // - stworzymy tablicę o tym rozmiarze (N) (iloscProduktow)
        Produkt[] tablicaProduktow = new Produkt[iloscProduktow];

        // - stworzymy pętle która ma wykonać się N (iloscProduktow) razy
        for (int i = 0; i < iloscProduktow; i++) {
            // - zapytamy N(iloscProduktow) razy o nazwę, cenę netto, oraz rodzaj podatku. Stworzony produkt dodamy do tablicy
            System.out.println("Podaj nazwę produktu:");
            String nazwa = scanner.next();

            System.out.println("Podaj cenę netto produktu: ");
            double cenaNetto = scanner.nextDouble();

            PodatekProduktu podatekProduktu = null;
            do {
                System.out.println("Podaj rodzaj podatku " + (Arrays.toString(PodatekProduktu.values())) + ":");
                String podatekProduktuString = scanner.next();
                try {
                    // linia niżej sprawdza czy wpisana treść zmiennej "podatekProduktuString" pasuje
                    //  do jakiejkolwiek z opcji wpisanej w enum PodatekProduktu. Jeśli nie, rzuca wyjątek.
                    podatekProduktu = PodatekProduktu.valueOf(podatekProduktuString.toUpperCase());
                } catch (IllegalArgumentException iae) {
                    System.out.println("Zły podatek produktu");
                }
                // dopóki użytkownik nie wpisał poprawnego podatku produktu, to powtarzaj pętlę
            } while (podatekProduktu == null);

            Produkt produkt = new Produkt(nazwa, cenaNetto, podatekProduktu);
            tablicaProduktow[i] = produkt;
        }

        System.out.println("Czy będzie faktura czy paragon?");
        String czyFaktura = scanner.next();

        if (czyFaktura.equalsIgnoreCase("faktura")) {
            System.out.println("Proszę podać numer nip:");
            String nip = scanner.next();

            Faktura faktura = new Faktura(nip, tablicaProduktow);
            System.out.println(faktura);
        } else {
            Rachunek rachunek = new Rachunek(tablicaProduktow);
            System.out.println(rachunek);
        }
    }
}
