package com.skvortsov;

import java.util.Objects;

public class Cat extends Predator {
    private String breed;

    public Cat(String color, int weight, String breed) {
        super(color, weight);
        this.breed = breed;
    }

    @Override
    public void sleep() {
    }

    @Override
    public void hunt() {
    }

    public void doingTigidik() {
    }

    public void lickBalls() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Cat)) {
            return false;
        }
        Cat cat = (Cat) o;
        return breed.equals(cat.breed);
    }

    @Override
    public int hashCode() {
        return 29 * Objects.hash(breed);
    }

    public void whatCatIsDoing(DayOfWeek dayOfWeek) {
        switch (dayOfWeek) {
            case MONDAY, WEDNESDAY, FRIDAY -> System.out.println("On " + dayOfWeek + " cat is sleeping");
            case TUESDAY, THURSDAY, SATURDAY -> System.out.println("On " + dayOfWeek + " cat is hunting");
            case SUNDAY -> System.out.println("On " + dayOfWeek + " cat is doing ТЫГЫДЫК");
            default -> System.out.println("Cat is licking balls");
        }
    }
}