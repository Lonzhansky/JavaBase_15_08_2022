package com.hillel.lonzhansky.lessons.lesson15.enumerations;

import java.util.Scanner;

/*
        створіть клас Exam, у ньому попросіть користувача ввести тип
        транспортного засобу:
        MOTORCYCLE, CAR, BUS, TRUCK
        b. залежно від вибраного виду, виведіть літеру категорії прав, яка
        необхідна для керування цим транспортним засобом.
        приклад: MOTO = A, CAR = B
        c. виведіть у консоль букву категорії:
        "Для керування CAR необхідна категорія В"
        d. для кожної категорії створіть метод, який приймає на вхід
        кількість років досвіду водіння (вводимо з консолі), в якому рахуйте
        чи достатньо в людини досвіду щоб водити це транспортне
        засіб. З такими параметрами:
        А: від 3 років досвіду водіння
        В: від 0 років досвіду
        З: від 5 років досвіду
        D: від 7 років досвіду
        e. викликайте відповідний метод у switch
        f. введіть з консолі типу т.с. і років досвіду в циклі, щоб можна було
        перевіряти та видавати багато прав. цикл повинен працювати поки користувач
        не введе "no"
        g. створіть клас DriverLicense і якщо користувач може отримати права -
        створюйте йому екземпляр прав
        h. рахуйте кількість виданих прав і виведіть на екран після того як
        введено команду "no":
        Всього видано: 12 ліцензій

 */
public class Exam {

    public static void main(String[] args) {
        runApp();

        System.out.println("Видано прав: " + DriverLicense.counterLicense);
    }

    static void runApp() {
        Scanner scanner = new Scanner(System.in);

        do {
            TransportType transportType = null;
            TransportType[] transportTypes = TransportType.values();
            while (true) {
                System.out.println("Please enter transport type from list: MOTORCYCLE, CAR, BUS, TRUCK or type \"NO\" for exit");
                String userValue = scanner.nextLine().toUpperCase();
                for (TransportType type : transportTypes) {
                    if (userValue.equals(type.toString())) {
                        transportType = type;
                        break;
                    }
                }
                if (transportType != null) {
                    break;
                } else if (userValue.equalsIgnoreCase("NO")) {
                    return;
                } else {
                    System.out.println("Wrong data, try again!");
                }
            }
//        TransportType transportType = null;
//        while (true) {
//            String type = scanner.nextLine();
//            try {
//                transportType = TransportType.valueOf(type.toUpperCase());
//                break;
//            } catch (IllegalArgumentException e) {
//                System.out.println("Wrong data");
//            }
//        }
//
//        System.out.println(transportType.getTitle());

            int years = getYears(scanner);
            boolean ok = false;
            switch (transportType) {
                case CAR: {
                    System.out.println("Для керування " + transportType + " необхідна категорія " + TransportCategory.B);
                    ok = checkYears(years, TransportCategory.B);
                    break;
                }
                case MOTORCYCLE: {
                    System.out.println("Для керування " + transportType + " необхідна категорія " + TransportCategory.A);
                    ok = checkYears(years, TransportCategory.A);
                    break;
                }
                case BUS: {
                    System.out.println("Для керування " + transportType + " необхідна категорія " + TransportCategory.D);
                    ok = checkYears(years, TransportCategory.D);
                    break;
                }
                case TRUCK: {
                    System.out.println("Для керування " + transportType + " необхідна категорія " + TransportCategory.C);
                    ok = checkYears(years, TransportCategory.C);
                    break;
                }
            }
            if (ok) {
                System.out.println("Права видано");
                new DriverLicense();
            } else {
                System.out.println("Недостатньо стажу");
            }
        } while (true);
    }

    private static boolean checkYears(int years, TransportCategory transportCategory) {
        switch (transportCategory) {
            case A: {
                return years > 3;
            }
            case B: {
                return years > 0;
            }
            case C: {
                return years > 5;
            }
            case D: {
                return years > 7;
            }
            default: {
                return false;
            }
        }
    }

    static int getYears(Scanner scanner) {
        int temp;
        System.out.println("Please enter years of driving");
        while (true) {
            if (scanner.hasNextInt()) {
                temp = scanner.nextInt();
                scanner.nextLine();
                if (temp < 0) {
                    System.out.println("Please enter positive number");
                } else {
                    break;
                }
                scanner.nextLine();
            } else {
                System.out.println("Wrong data, try again");
                scanner.nextLine();
            }
        }
        return temp;
    }

}
