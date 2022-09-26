package com.hillel.lonzhansky.lessons.lesson13.abstracts;

public class Main2 {

    public static void main(String[] args) {

//        Animal dog = new Dog("Sharik");
        Animal cat = new CatChild("Tom");
        Animal cat2 = null;

//        demoBad(dog);
//        demoBad(cat);

//        demo2(dog);
//        demo2(cat);

        demo(cat2);
    }

//    static void demoBad(Animal animal) {
//        Cat cat = ((Cat) animal);
//        cat.jump();
//    }

    static void demo(Animal animal) {
        if (animal != null) {
            if (animal instanceof Cat) {
                Cat cat = ((Cat) animal);
                cat.jump();
            } else if (animal instanceof Dog) {
                ((Dog) animal).sayGav();
            } else {
                animal.swim();
            }
        }
    }

    static void demo2(Animal animal) {
        if (animal.getClass() == Cat.class) {
            Cat cat = ((Cat) animal);
            cat.jump();
        } else if (animal instanceof Dog) {
            ((Dog) animal).sayGav();
        } else {
            animal.swim();
        }
    }

}
