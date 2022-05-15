package pl.sda.arp4.inheritance.przyklad;

public class Main {
    // git push -u origin master
    public static void main(String[] args) {
        // SOLID
        // S single responsibility
        // O open/close principle
        // L liskov substitution
        // I interface segregation
        // D dependency inversion/injection (dopiero pod koniec kursu zrozumiemy)

        Ptak[] ptaki = new Ptak[4];
        ptaki[0] = new Sowa();
        ptaki[1] = new Kukułka();
        ptaki[2] = new Papuga();
        ptaki[3] = new Papuga();

        for (Ptak ptak : ptaki) {
            ptak.spiewaj();
        }


        Ptak s = new Sowa();
        s.spiewaj();

        Ptak k = new Kukułka();
        k.spiewaj();

        Papuga p = new Papuga();
        p.spiewaj();
        p.spiewaj("a kuka racza");
    }
}
