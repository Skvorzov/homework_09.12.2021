package com.skvortsov;

public abstract class Predator {

    private String color;
    private int weight;

    public Predator(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public abstract String sleep();

    public abstract String hunt();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}