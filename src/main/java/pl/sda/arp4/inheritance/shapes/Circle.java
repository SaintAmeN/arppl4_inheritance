package pl.sda.arp4.inheritance.shapes;

public class Circle implements IShape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double calculateCircumference() {
        return Math.PI * radius * radius;
    }
}
