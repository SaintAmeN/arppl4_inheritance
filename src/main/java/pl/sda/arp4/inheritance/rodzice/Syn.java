package pl.sda.arp4.inheritance.rodzice;

public class Syn extends Dziecko {
    @Override
    public void przedstawSię() {
//        super oznacza 'klasa nadrzędna'
//        super.przedstawSię();
        System.out.println("Yo Yo jestem Syneq!");
        System.out.println("Mam na imie: " + imie);
    }
}
