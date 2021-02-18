package com.company.fan;

public class Fan {


    final double SLOW = 1;
    final double MEDIUM = 2;
    final double FAST = 3;
    private int speed = 1;
    private boolean on = false;
    private double radius = 5.0D;
    private String color = "blue";

    public Fan(){
        this.speed = 1;
        this.on = false;
        this.radius = 5.0D;
        this.color = "blue";
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void display(){
        if (this.on){
            System.out.println("fan is on, speed is: " + this.speed + ", radius is: " + this.radius + ", color is: " + this.color);
        }else {
            System.out.println("fan is off, speed is: " + this.speed + ", radius is: " + this.radius + ", color is: " + this.color);
        }
    }
}
