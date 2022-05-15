package pl.sda.arp4.inheritance.wyjatki;

/**
 * Konto powinno posiadać pole:
 * - ilość środków
 * <p>
 * metody:
 * - podaj ilosc srodkow (wypisuje stan konta)
 * - wykonaj przelew (od obecnego stanu konta odejmuje kwotę podaną w parametrze)
 * - przelew przychodzący (do obecnego stanu konta dodaje kwotę podaną w parametrze)
 */
public class Konto {
    private double iloscSrodkow;

    public double podajIloscSrodkow() {
        return iloscSrodkow;
    }

    public void wykonajPrzelew(double kwota1) throws SrodkiNaKoncieException {
        if (iloscSrodkow < kwota1){
            throw new SrodkiNaKoncieException("Błąd przelewu, brak środków!");
        }
        iloscSrodkow = iloscSrodkow - kwota1;
    }

    public void przelewPrzychodzacy(double kwota2) {
        iloscSrodkow = iloscSrodkow + kwota2;
    }
}
