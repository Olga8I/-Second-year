package com.Java;

public class Car {
    private Dvigatel dvigatel=null;
    private Koleso koleso=null;
        private String name;
    public Car(String name, Dvigatel dvigatel, Koleso koleso) {
        this.name=name;
        this.dvigatel=dvigatel;
        this.koleso=koleso;
        }
    public void SetDvigatel(Dvigatel dvigatel) {
        this.dvigatel=dvigatel;
    }
    public void SetKoleso(Koleso koleso) {
        this.koleso=koleso;
    }

    public String GetCar() {
        return name+" "+dvigatel.getDvigatel()+" "+koleso.getKoleso();
    }
    @Override
    public String toString() {
        return name+" "+dvigatel.getDvigatel()+" "+koleso.getKoleso();
    }

}
