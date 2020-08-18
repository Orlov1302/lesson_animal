package com.company;

public class Cat extends Animal {
    Cat(String name){
        super(name);
        this.setNameType("Кошка");
    }
    public void sailToXY(long x, long y){ // переместиться в точку с координатами x,y
        super.sailToXY(x,y);
        System.out.println("(но кошки не любят плавать)");
    }
    public void sound(){
        System.out.println(getNames() + ": \"Мяу-мяу\"");
    }
    public void eat(){
        System.out.println(getNames() + " ест рыбу.");
    }
}
