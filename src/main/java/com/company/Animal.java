package com.company;

public class Animal {
    private String nameType;
    private String nameAnimal;
    private Coordinates coordinates;

    Animal(String name){
        coordinates = new Coordinates();
        this.nameType = "Животное";
        this.nameAnimal = name;
    }
    Animal(){
        this("без имени");
    }
    public void setNameType(String name){
        this.nameType = name;
    }
    public String getNames(){
        return nameType + " " + nameAnimal;
    }
    public void goToXY(long x, long y){ // прийти в точку с координатами x,y
        coordinates.setXY(x,y);
        System.out.println(getNames() + " пришла в координаты x=" + coordinates.getX() + " y=" + coordinates.getY() );
    }
    public void goToTree(long h){ // залезть на дерево на высоту h
        coordinates.setHeight(h);
        System.out.println(getNames() + " залезла на дерево на высоту " + coordinates.getHeight() );
    }
    public void sailToXY(long x, long y){ // переместиться в точку с координатами x,y
        coordinates.setXY(x,y);
        System.out.println(getNames() + " приплыла в координаты x=" + coordinates.getX() + " y=" + coordinates.getY() );
    }
    public void sound(){}
    public void eat(){
        System.out.println(getNames() + " ест.");
    }
}
