package pl.sda.arp4.inheritance.rodzice;

public class Corka extends Czlowiek{

    public Corka(String imie) {
        super(imie);
        System.out.println("Stworzono corke:" + imie);
    }

    @Override
    public boolean czyPelnoletni() {
        return false;
    }
}
