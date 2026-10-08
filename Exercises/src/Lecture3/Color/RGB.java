package Lecture3.Color;

public class RGB implements IColor {
    private int red;
    private int blue;
    private int green;

    public RGB(int red, int blue, int green) {
        this.red = red;
        this.blue = blue;
        this.green = green;
    }

    public int getRed() {
        return red;
    }

    public int getBlue() {
        return blue;
    }

    public int getGreen() {
        return green;
    }
}

