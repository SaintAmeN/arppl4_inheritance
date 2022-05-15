package pl.sda.arp4.inheritance.koszykzakupowy;

public class Produkt {
    private String nazwa;
    private double cenaProduktu;        // netto
    private PodatekProduktu podatek;    // VAT8 / VAT23 / VAT5

    public Produkt(String nazwa, double cenaProduktu, PodatekProduktu podatek) {
        this.nazwa = nazwa;
        this.cenaProduktu = cenaProduktu;
        this.podatek = podatek;
    }

    public double cenaBrutto() {
//                                  cena + (cena * %VAT) = 1.23 * cena
        double cenaProduktuBrutto = cenaProduktu + (cenaProduktu * podatek.getWartoscPodatku());
        return cenaProduktuBrutto;
    }

    @Override
    public String toString() {
        return "Produkt{" +
                "nazwa='" + nazwa + '\'' +
                ", cenaProduktu=" + cenaProduktu +
                ", podatek=" + podatek +
                '}';
    }
}
