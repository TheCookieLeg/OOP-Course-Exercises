package Lecture2.Shapes;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(5.0);
        Rectangle rec = new Rectangle(5.0, 7.0);
        Circle circle = new Circle (3.4);

        System.out.println("Area of square: " + square.area());
        System.out.println("Circumference of square: " + square.circumference());

        System.out.println("");

        System.out.println("Area of rectangle: " + rec.area());
        System.out.println("Circumference of rectangle: " + rec.circumference());

        System.out.println("");

        System.out.println("Area of circle: " + circle.area());
        System.out.println("Circumference of circle: " + circle.circumference());
    }
}
