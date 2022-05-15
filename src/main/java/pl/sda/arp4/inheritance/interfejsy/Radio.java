package pl.sda.arp4.inheritance.interfejsy;

public class Radio implements UrządzenieWłączalne,UrządzenieWyłączalne {
    public void włącz(){
        System.out.println("Uruchamiam radio. Trala lala la... Muzyczka gra...");
    }

    public void wyłącz(){
        System.out.println("Radio wyłączone.");
    }
}
