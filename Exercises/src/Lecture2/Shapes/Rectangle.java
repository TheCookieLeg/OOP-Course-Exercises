package Lecture2.Shapes;

public class Rectangle {
    protected double width;
    protected double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double area() {
        return width * length;
    }

    public double circumference() {
        return (width*2) + (length*2);
    }
}
