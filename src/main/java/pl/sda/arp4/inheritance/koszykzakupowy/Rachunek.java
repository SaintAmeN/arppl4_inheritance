package pl.sda.arp4.inheritance.koszykzakupowy;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Rachunek {
    protected LocalDateTime czasZakupu;
    protected Produkt[] produkty;
    protected double sumaBrutto;

    public Rachunek(Produkt[] produkty) {
        this.produkty = produkty;
        this.czasZakupu = LocalDateTime.now();

        for (int i = 0; i < produkty.length; i++) {
            sumaBrutto = sumaBrutto + produkty[i].cenaBrutto();
        }
    }

    @Override
    public String toString() {
        return "Rachunek\n" +
                "Data: " + czasZakupu + "\n" +
                "Produkty: " + Arrays.toString(produkty) + "\n" +
                "-------------------------------------------\n" +
                "Suma cena brutto: " + sumaBrutto;
    }
}

/*
----------------------
|
| RACHUNEK
| DATA
----------------------
| Produkty:
----------------------
| Suma: KWOTA
----------------------

 */
