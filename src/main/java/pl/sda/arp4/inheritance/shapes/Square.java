package pl.sda.arp4.inheritance.shapes;

public class Square implements IShape {
    private double edgeA;

    public Square(double edgeA) {
        this.edgeA = edgeA;
    }

    @Override
    public double calculateArea() {
        return edgeA * edgeA;
    }

    @Override
    public double calculateCircumference() {
        return edgeA * 4;
    }
}
