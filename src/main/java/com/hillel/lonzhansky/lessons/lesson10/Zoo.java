package com.hillel.lonzhansky.lessons.lesson10;


//Зоопарк
//        a. У зоопарку живуть звірі (кожного виду щонайменше 2, максимум 30):
//        ведмедики
//        тигри
//        папуги
//        слони
//        єноти
//        b. відомо, що кількість звірів збільшується щороку на
//        певний коефіцієнт:
//        ведмедика на 30%
//        тигри на 20%
//        папуги на 40%
//        слони на 5%
//        єноти на 80%
//        c. Завдання:
//        порахувати за допомогою методу countAnimals() - скільки звірів у
//        зоопарку цього року;
//        за допомогою методу countAnimalsNextYear() порахувати - скільки їх
//        буде через рік, враховуючи коефіцієнти;
//        зробити такий самий метод але з кількістю звірів 6
public class Zoo {

    static final double COEFFICIENT_BEARS = 1.3;
    static final double COEFFICIENT_TIGERS = 1.2;
    static final double COEFFICIENT_PARROTS = 1.4;
    static final double COEFFICIENT_ELEPHANTS = 1.05;
    static final double COEFFICIENT_RACCOONS = 1.8;
    static final double COEFFICIENT_LAMMAS = 1.05;

    public static void main(String[] args) {
        int min = 2;
        int max = 30;

        int bears = getRandomNumber(min, max);
        int tiger = getRandomNumber(min, max);
        int parrots = getRandomNumber(min, max);
        int elephants = getRandomNumber(min, max);
        int raccoons = getRandomNumber(min, max);
        int lammas = getRandomNumber(min, max);

        printCount("bears", bears);
        printCount("tiger", tiger);
        printCount("parrots", parrots);
        printCount("elephants", elephants);
        printCount("raccoons", raccoons);
        printCount("lammas", lammas);


        System.out.println("count animals current year = " + countAnimals(bears, tiger, parrots, elephants, raccoons));
        System.out.println("count animals next year = " + countAnimalsNextYear(bears, tiger, parrots, elephants, raccoons));
        System.out.println();
        System.out.println("count animals current year = " + countAnimals(bears, tiger, parrots, elephants, raccoons, lammas));
        System.out.println("count animals next year = " + countAnimalsNextYear(bears, tiger, parrots, elephants, raccoons, lammas));
    }

    static int getRandomNumber(int min, int max) {
        return min + (int) (Math.random() * (max - min + 1));
    }

    static void printCount(String animal, int count) {
        System.out.println(animal + " = " + count);
    }

    static int countAnimals(int bears, int tiger, int parrots, int elephants, int raccoons) {
        return bears + tiger + parrots + elephants + raccoons;
    }

    static int countAnimals(int bears, int tiger, int parrots, int elephants, int raccoons, int lammas) {
        return countAnimals(bears, tiger, parrots, elephants, raccoons) + lammas;
    }

    static int countAnimalsNextYear(int bears, int tiger, int parrots, int elephants, int raccoons) {
        return (int) (bears * COEFFICIENT_BEARS)
                + (int) (tiger * COEFFICIENT_TIGERS)
                + (int) (parrots * COEFFICIENT_PARROTS)
                + (int) (elephants * COEFFICIENT_ELEPHANTS)
                + (int) (raccoons * COEFFICIENT_RACCOONS);
    }

    static int countAnimalsNextYear(int bears, int tiger, int parrots, int elephants, int raccoons, int lammas) {
        return countAnimalsNextYear(bears, tiger, parrots, elephants, raccoons)
                + (int) (lammas * COEFFICIENT_LAMMAS);
    }
}
