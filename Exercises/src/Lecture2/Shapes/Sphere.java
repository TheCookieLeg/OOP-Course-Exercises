package Lecture2.Shapes;
import java.lang.Math;

public class Sphere extends Circle {

    public Sphere(double radius) {
        super(radius);
    }

    public double volume() {
        return (4.0/3.0) * 3.14 * Math.pow(radius, 3);
    }
}
