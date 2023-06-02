package com.pattern.structural.bridge;

public class Main {
    public static void main(String[] args) {
        Black black = new Black();
        Green green = new Green();
        Rectangle rectangle = new Rectangle(black);
        rectangle.draw();
        Circle circle = new Circle(green);
        circle.draw();
    }
}
