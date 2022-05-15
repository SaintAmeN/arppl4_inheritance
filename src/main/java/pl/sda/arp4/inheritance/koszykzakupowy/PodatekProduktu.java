package pl.sda.arp4.inheritance.koszykzakupowy;

public enum PodatekProduktu {
    VAT5(0.05), // 5% => 5/100 = 0.05
    VAT8(0.08),
    VAT23(0.23),
    NO_VAT(0.0);

    private final double wartoscPodatku;

    PodatekProduktu(double wartoscPodatku) {
        this.wartoscPodatku = wartoscPodatku;
    }

    public double getWartoscPodatku() {
        return wartoscPodatku;
    }
}
