package pl.sda.arp4.inheritance.wyjatki;

public class SrodkiNaKoncieException extends Exception{
    public SrodkiNaKoncieException(String message) {
//        new Exception(message)
        super(message);
    }
}
