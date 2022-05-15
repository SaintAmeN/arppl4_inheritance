package pl.sda.arp4.inheritance.przyklad;

public class Papuga extends Ptak {
    @Override
    public void spiewaj() {
        System.out.println("a co Ci do tego?");
    }

    public void spiewaj(String co) {
        System.out.println(co);
    }
}
