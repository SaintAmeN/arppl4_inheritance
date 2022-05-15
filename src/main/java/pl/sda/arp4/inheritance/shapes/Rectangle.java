package pl.sda.arp4.inheritance.shapes;

public class Rectangle implements IShape {
    private double edgeA;
    private double edgeB;

    public Rectangle(double edgeA, double edgeB) {
        this.edgeA = edgeA;
        this.edgeB = edgeB;
    }

    public double calculateArea() {
        return edgeA * edgeB;
    }

    public double calculateCircumference() {
        return 2 * edgeA + 2 * edgeB;
    }
}
