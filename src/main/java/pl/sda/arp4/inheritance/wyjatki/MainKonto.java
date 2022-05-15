package pl.sda.arp4.inheritance.wyjatki;

public class MainKonto {
    public static void main(String[] args) {
        Konto k = new Konto();

        // sprawdzenie stanu konta
        double ilosc = k.podajIloscSrodkow();
        System.out.println("Stan: " + ilosc);

        // zasilanie konta
//        k.przelewPrzychodzacy(1050);

        try {
            double kwota = 1000;
            k.wykonajPrzelew(kwota);

            System.out.println("Sukces przelewu: " + kwota);
        } catch (SrodkiNaKoncieException re) {
            System.out.println("Błąd: " + re.getMessage());
        }

        // sprawdzenie stanu konta
        ilosc = k.podajIloscSrodkow();
        System.out.println("Stan: " + ilosc);
    }
}
