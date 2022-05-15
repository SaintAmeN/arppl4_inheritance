package pl.sda.arp4.inheritance.rodzice;

// klasa abstrakcyjna i nie może istnieć instancja tej klasy
// (nie możemy stworzyć takiego obiektu)
// została zaimplementowana tylko w celu dziedziczenia/uogólnienia
public abstract class Czlowiek {
    protected String imie;

    public void przedstawSię() {
        System.out.println("Jestem człowiekiem");
    }

    public abstract boolean czyPelnoletni();
}
