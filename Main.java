package com.Java;

public class Main {

    public static void main(String[] args) {

        Dvigatel dvigatel = new Dvigatel("V2.0 120 km/ch,");
        Dvigatel dvigatel1 = new Dvigatel("V2.2 120 km/ch,");
        Koleso koleso = new Koleso("radius kolesa 18 d,,");
        Koleso koleso1 = new Koleso("radius kolesa 16 d,");
        Car car = new Car("Mercedes:", dvigatel, koleso);
        Car car1 = new Car("Volkswagen:", dvigatel1, koleso1);
        System.out.println("Informacia o Car:");
        System.out.println(car.GetCar());
        System.out.println(car1.GetCar());
        if (dvigatel.equals(dvigatel1)&&koleso.equals(koleso1)) {System.out.println("Car identychny po charakteristikam");}
        else {System.out.println("Car ne identychny po characteristikam");}
        System.out.println("Pereopredelenie metoda toString():");
        System.out.println(car.hashCode());
        System.out.println(car1.hashCode());


    }

}

