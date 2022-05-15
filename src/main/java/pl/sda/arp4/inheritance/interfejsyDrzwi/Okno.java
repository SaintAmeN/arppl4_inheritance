package pl.sda.arp4.inheritance.interfejsyDrzwi;

// Closeable -> Zamykalny

public class Okno implements IZamykalnyOtwieralny, IUchylalny{
    public void zamknij(){}
    public void otworz(){}
    public void uchyl(){}
}
