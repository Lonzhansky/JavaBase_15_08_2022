package com.hillel.lonzhansky.lessons.lesson13.abstracts;

public final class Dog extends Animal {

    String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sayGav() {
        System.out.println("Gav Gav");
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    void swim() {
        System.out.println(name + " swim");
    }

    @Override
    void run() {
        System.out.println(name + " run");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (o == null || o instanceof Dog) return false;

        Dog dog = (Dog) o;

        return name != null ? name.equals(dog.name) : dog.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
