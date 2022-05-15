package pl.sda.arp4.inheritance.wyjatkiZadanie;

public class CholeroException extends RuntimeException {
    public CholeroException() {
        super("Pamiętaj cholero by nie dzielić przez '0'");
    }
}
