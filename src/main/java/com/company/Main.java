package com.company;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat("Мурка");
        cat.goToXY(10,20);
        cat.goToTree(2);
        cat.sailToXY(30, 40);
        cat.sound();
        cat.eat();

        Animal dog = new Dog("Шарик");
        dog.goToXY(10,20);
        dog.goToTree(2);
        dog.sailToXY(30, 40);
        dog.sound();
        dog.eat();
    }
}
