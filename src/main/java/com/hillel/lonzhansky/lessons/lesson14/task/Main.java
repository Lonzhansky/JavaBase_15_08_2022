package com.hillel.lonzhansky.lessons.lesson14.task;

/*

Практика No1:
a. Зробіть інтерфейс Swimmable із методом swim()
b. Додайте класи, що імплементують інтерфейс Swimmable:
Duck, Human, Boat
c. Для класу Boat додайте другу імплементацію
від інтерфейсу Transportable,
який заздалегідь створіть з відповідним методом

 */

public class Main {

    public static void main(String[] args) {
        Boat boat = new Boat();
        boat.move();
        boat.swim();
        System.out.println();

        Human human = new Human();
        human.swim();
        System.out.println();

        Duck duck = new Duck();
        duck.swim();
    }
}
