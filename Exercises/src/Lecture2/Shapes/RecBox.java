package Lecture2.Shapes;

public class RecBox extends Rectangle{
    private double height;

    public RecBox(double width, double length, double height) {
        super(width, length);
        this.height = height;
    }

    public double volume() {
        return width * length * height;
    }
}
