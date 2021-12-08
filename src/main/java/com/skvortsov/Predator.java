package com.skvortsov;

public abstract class Predator {
    private String color;
    private int weight;

    public Predator(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public abstract void sleep();

    public abstract void hunt();
}