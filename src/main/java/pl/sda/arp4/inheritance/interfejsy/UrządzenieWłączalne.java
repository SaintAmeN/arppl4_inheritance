package pl.sda.arp4.inheritance.interfejsy;

public interface UrządzenieWłączalne {
    public static final int NAPIECIE_ZASILANIA_V = 230;
    // SOLID
    // S single responsibility
    // I interface segregation
    /**
     * Interfejs to typ który posiada tylko metody 'public abstract'
     * BEZ IMPLEMENTACJI
     * <p>
     * Interfejs jest z definicji abstrakcyjny/niekompletny.
     * Interfejs posiada metody, nie może posiadać pól.
     *      Zdefiniowane w klasie pola są stałymi globalnymi 'public static final'
     *
     * Interfejs używamy w dwóch przypadkach (przeważnie nie jednocześnie):
     *  - cel 1: do definiowania stałych (w tym przypadku prawdopodobnie nie używamy do dziedziczenia)
     *  - cel 2: do definiowania wspólnego zachowania
     *
     * Klasy abstrakcyjne piszemy kiedy mamy wspólne cechy/pola do odziedziczenia
     * Interfejsy piszemy kiedy mamy wspólne zachowanie do odziedziczenia (brak pól)!
     *
     * Możemy dziedziczyć po jednej klasie, a implementować nieskończenie wiele interfejsów.
     */
    public abstract void włącz();
}
