package pl.sda.arp4.inheritance.wyjatki;

public class MainRzucanieWyjatkow {
    public static void main(String[] args) {
        try {
            metoda();
        } catch (Exception e) {
            System.out.println("Złapany");
        }
        drugaMetoda();
    }

    public static void metoda() throws Exception {
//        niejawny
//        throw new RuntimeException("Runtime Yo!");
        throw new Exception(":(");
    }

    public static void drugaMetoda() {
        try {
            metoda();
        } catch (Exception e) {
            System.out.println("error happened");
            return; // kończy wcześnie metodę
        }finally {
            // służy do sprzątania po tym co się wydarzyło w try/catch
            System.out.println("La la la ta ta ta");
        }
    }
}
