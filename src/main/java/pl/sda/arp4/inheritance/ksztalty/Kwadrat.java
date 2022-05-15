package pl.sda.arp4.inheritance.ksztalty;

public class Kwadrat extends Ksztalt {
    private double dlugoscBoku;

    public Kwadrat(double dlugoscBoku) {
        this.dlugoscBoku = dlugoscBoku;
    }

    public double obliczPole() {
        return dlugoscBoku * dlugoscBoku;
    }

    @Override
    public double obliczObwod() {
        return 4 * dlugoscBoku;
    }
}
