package airFun;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 3;
    final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5.0;
    private String color = "blue";

    public void Fan() {
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        if (this.on == true) {
            return this.speed + this.color + this.radius;
        }
        else {
            System.out.println("fun is off");
            return this.color + this.radius;
        }
    }
}