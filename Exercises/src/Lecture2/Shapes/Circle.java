package Lecture2.Shapes;

public class Circle {
    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return (radius*radius) * 3.14;
    }

    public double circumference() {
        return 2 * 3.14 * radius;
    }
}
