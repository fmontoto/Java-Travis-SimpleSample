package com.main;

/**
 * Created by fmontoto on 11-01-16.
 */
public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
     public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "(" + this.x + "," + this.y + ")";

    }

    public double getDistance(Point b) {
        return Math.sqrt(Math.pow(this.getX() - b.getX(), 2) +
                         Math.pow(this.getY() - b.getY(), 2));
    }
}
