package pl.sda.arp4.inheritance.rodzice;

public class Syn extends Czlowiek {
    public Syn(String imie) {
        super(imie); // konstruktor klasy nadrzednej Czlowiek
        System.out.println("Stworzono syna:" + imie);
    }

    @Override
    public void przedstawSię() {
//        super oznacza 'klasa nadrzędna'
//        super.przedstawSię();
        System.out.println("Yo Yo jestem Syneq!");
        System.out.println("Mam na imie: " + getImie());
        System.out.println("stała : " + Main.A);
    }

    @Override
    public boolean czyPelnoletni() {
        return false;
    }
}
