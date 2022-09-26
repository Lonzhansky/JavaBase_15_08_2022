package com.hillel.lonzhansky.lessons.lesson13.homework;

public class Homework14 {
    private final String name;
    private final int birthDay;
    private final int birthMounth;
    private final int birthYear;
    private final String email;
    private final String phoneNumber;
    private  String surname;
    private  double weight;
    private int age;

    public Homework14(String name, int birthDay, int birthMounth, int birthYear, String email, String phoneNumber, String surname, double weight) {
        this.name = name;
        this.birthDay = birthDay;
        this.birthMounth = birthMounth;
        this.birthYear = birthYear;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.surname = surname;
//        if (weight < 0) {
//            System.out.println("Wrong data!");
//        } else {
//            this.weight = weight;
//        }
        setWeight(weight);
        age = 2020 - birthYear;
    }

    public String getName() {
        return name;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public int getBirthMounth() {
        return birthMounth;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight < 0) {
            System.out.println("Wrong data!");
        } else {
            this.weight = weight;
        }
    }

    public int getAge() {
        return age;
    }

    //    void printAccountInfo() {
//        System.out.println(this);
//    }

    void printAccountInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Person :" + "name='").append(name).append('\'')
                .append(", birthDay=").append(birthDay)
                .append(", birthMounth=").append(birthMounth)
                .append(", birthYer=").append(birthYear)
                .append(", age=").append(age)
                .append(", email='").append(email).append('\'')
                .append(", phoneNumber='").append(phoneNumber)
                .append('\'').append(", surname='").append(surname)
                .append('\'').append(", weight=").append(weight);

        System.out.println(stringBuilder);

    }

    @Override
    public String toString() {
        return "Person :" +
                "name='" + name + '\'' +
                ", birthDay=" + birthDay +
                ", birthMounth=" + birthMounth +
                ", birthYear=" + birthYear +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", surname='" + surname + '\'' +
                ", weight=" + weight;
    }
}
