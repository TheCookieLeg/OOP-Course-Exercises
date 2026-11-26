package Lecture9.SmartHome.Receiver;

public class Fan {
    private Speed speed;
    public enum Speed {
        OFF,
        LOW,
        MEDIUM,
        HIGH
    }

    public Fan() {
        speed = Speed.OFF;
    }

    public void turnOn() {
        speed = Speed.MEDIUM;
        System.out.println("Fan speed: " + speed);
    }

    public void turnOff() {
        speed = Speed.OFF;
        System.out.println("Fan speed: " + speed);
    }

    public void increaseSpeed() {
        Speed[] speeds = Speed.values();
        int next = speed.ordinal() + 1;
        if (next < speeds.length) {
            speed = speeds[next];
        }
        System.out.println("Fan speed: " + speed);
    }

    public void decreaseSpeed() {
        Speed[] speeds = Speed.values();
        int prev = speed.ordinal() - 1;
        if (prev >= 0) {
            speed = speeds[prev];
        }
        System.out.println("Fan speed: " + speed);
    }

}
