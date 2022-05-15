package pl.sda.arp4.inheritance.rodzice;

public class Main {
    public static void main(String[] args) {
        // Obiekt o nazwie 'syn' typu 'Syn' może przyjąć
        // wiele form, czyli być przypisany/traktowany jako
        // typ który dziedziczy.
        //
        // polimorfizm - obiekt może być traktowany/przypisany
        //                jako obiekt swojego typu nadrzędnego
        Czlowiek syn = new Syn();
        syn.przedstawSię();

//        Czlowiek c = new Czlowiek();
    }
}
