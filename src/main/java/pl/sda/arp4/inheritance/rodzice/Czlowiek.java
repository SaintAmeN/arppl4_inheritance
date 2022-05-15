package pl.sda.arp4.inheritance.rodzice;

// klasa abstrakcyjna i nie może istnieć instancja tej klasy
// (nie możemy stworzyć takiego obiektu)
// została zaimplementowana tylko w celu dziedziczenia/uogólnienia
public abstract class Czlowiek {
    // protected - dla klas dziedziczących i tych w pakiecie
    protected String imie;

    public Czlowiek(String imie) {
        this.imie = imie;
        System.out.println("Stworzono człowiek: " + imie);
    }

    public void przedstawSię() {
        System.out.println("Jestem człowiekiem");
        System.out.println("Nadano mi imie: " + imie);
    }

    public abstract boolean czyPelnoletni();

    public String getImie() {
        return imie;
    }
}
