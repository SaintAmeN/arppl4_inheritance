package pl.sda.arp4.inheritance.rodzice;

public class Main {
    public static final int A = 5;

    public static void main(String[] args) {
        // Obiekt o nazwie 'syn' typu 'Syn' może przyjąć
        // wiele form, czyli być przypisany/traktowany jako
        // typ który dziedziczy.
        //
        // polimorfizm - obiekt może być traktowany/przypisany
        //                jako obiekt swojego typu nadrzędnego
        Czlowiek[] czlowieki = new Czlowiek[3];

        czlowieki[0] = new Syn("Marian");
        czlowieki[1] = new Corka("Ola");
        czlowieki[2] = new Syn("Piotr");

        for (Czlowiek czlowiek : czlowieki) {
            czlowiek.przedstawSię();
        }
    }
}
