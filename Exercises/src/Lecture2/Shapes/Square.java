package Lecture2.Shapes;

public class Square {
    protected double width;

    public Square(double width) {
        this.width = width;
    }

    public double area() {
        return width * width;
    }

    public double circumference() {
        return width*4;
    }
}
