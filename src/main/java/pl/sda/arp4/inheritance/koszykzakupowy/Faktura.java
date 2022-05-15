package pl.sda.arp4.inheritance.koszykzakupowy;

import java.util.Arrays;

public class Faktura extends Rachunek {
    private String nip;

    public Faktura(String nip, Produkt[] produkty) {
        super(produkty);
        this.nip = nip;
    }

    @Override
    public String toString() {
        return "Faktura\n" +
                "NIP: " + nip + "\n" +
                "Data: " + czasZakupu + "\n" +
                "Produkty: " + Arrays.toString(produkty) + "\n" +
                "-------------------------------------------\n" +
                "Suma cena brutto: " + sumaBrutto;
    }
}
