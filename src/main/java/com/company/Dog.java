package com.company;

public class Dog extends Animal{
    Dog(String name){
        super(name);
        this.setNameType("Собака");
    }
    public void goToTree(long h){
        System.out.println("Собаки не лазают по деревьям.");
    }
    public void sound(){
        System.out.println(getNames() + ": \"Гав-гав\"");
    }
    public void eat(){
        System.out.println(getNames() + " ест мясо.");
    }
}
