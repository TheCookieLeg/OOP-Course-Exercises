package Lecture2.Shapes;

public class Box extends Square {
    public Box(double width) {
        super(width);
    }

    public double volume() {
        return width * width * width;
    }
}
