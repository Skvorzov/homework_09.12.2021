package com.skvortsov;

import java.util.Objects;

public class Cat extends Predator {
    private String breed;

    public Cat(String color, int weight, String breed) {
        super(color, weight);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String sleep() {
        return "Cat is sleeping";
    }

    @Override
    public String hunt() {
        return "Cat is hunting";
    }

    public String doingTigidik() {
        return "Cat is doing Tigidik";
    }

    public String lickBalls() {
        return "Cat is licking balls";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Cat) || o == null) {
            return false;
        }
        Cat cat = (Cat) o;
        return breed.equals(cat.breed);
    }

    @Override
    public int hashCode() {
        return 29 * Objects.hash(breed);
    }

    public String whatCatIsDoing(DayOfWeek dayOfWeek) {
        switch (dayOfWeek) {
            case MONDAY, WEDNESDAY, FRIDAY -> {
                return sleep();
            }
            case TUESDAY, THURSDAY, SATURDAY -> {
                return hunt();
            }
            case SUNDAY -> {
                return doingTigidik();
            }
            default -> {
                return lickBalls();
            }
        }
    }
}