package pl.sda.arp4.inheritance.interfejsy;

public class Piekarnik implements UrządzenieWłączalne,UrządzenieWyłączalne {
    public void włącz() {
        System.out.println("Włączam piekarnik, jedzonko się podgrzewa...");
    }

    public void wyłącz() {
        System.out.println("Wyłączam piekarnik.");
    }
}
