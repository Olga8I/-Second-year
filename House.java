package com.Java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

public class House {
    public static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int id;
    String numberHouse;
    int area;
    int stage;
    String typeBuilding;
    String street;
    int countRoom;
    int lifeTime;
    public House()
    {
        id=0;
        numberHouse="";
        stage=0;
        area=0;
        typeBuilding="";
        street="";
        countRoom=0;
        lifeTime=0;
    }
    public House (int Id,String nrh,int st,int ar,String tb,String s,int cr,int lt)
    {
        id=Id;
        numberHouse=nrh;
        stage=st;
        area=ar;
        typeBuilding=tb;
        street=s;
        countRoom=cr;
        lifeTime=lt;
    }
    public String toString()
    {
        return numberHouse+" "+stage+" "+area+" "+typeBuilding+" "+street+" "+countRoom+" "+lifeTime;
    }
    public void setID(int id)
    {
        this.id=id;
    }
    public int getID()
    {
        return id;
    }
    public void setNumberHouse(String numberHouse)
    {
        this.numberHouse=numberHouse;
    }
    public String getNumberHouse()
    {
        return numberHouse;
    }
    public void setArea(int area)
    {
        this.area=area;
    }
    public int getArea()
    {
        return area;
    }
    public void setStage(int stage)
    {
        this.stage=stage;
    }
    public int getStage()
    {
        return stage;
    }
    public void setTypeBuilding(String typeBuilding)
    {
        this.typeBuilding=typeBuilding;
    }
    public String getTypeBuilding()
    {
        return typeBuilding;
    }
    public void setStreet(String street)
    {
        this.street=street;
    }
    public String getStreet()
    {
        return street;
    }
    public void setCountRoom(int countRoom)
    {
        this.countRoom=countRoom;
    }
    public int getCountRoom()
    {
        return countRoom;
    }
    public void setLifeTime(int lifeTime)
    {
        this.lifeTime=lifeTime;
    }
    public int getLifeTime()
    {
        return lifeTime;
    }
    public void vivod()
    {
        System.out.println("Уникальный идентификатор квартиры:"+id+"\nНомер квартиры:"+numberHouse+"\nЭтаж:"+stage+"\nПлощадь:"+area+"\nТип здания:"+typeBuilding+"\nУлица:"+street+"\nКоличество комнат:"+countRoom+"\nСрок эксплуатации:"+lifeTime+"\n");
    }
    public void vvod()
    {
        try {
            System.out.println("Введите id квартиры");
            id= parseInt(br.readLine());
            System.out.println("Введите номер квартиры");
            numberHouse=br.readLine();
            System.out.println("Введите площадь квартиры");
            stage= parseInt(br.readLine());
            System.out.println("Введите этаж");
            area= parseInt(br.readLine());
            System.out.println("Введите тип здания");
            typeBuilding=br.readLine();
            System.out.println("Введите название улицы");
            street=br.readLine();
            System.out.println("Введите количество комнат");
            countRoom= parseInt(br.readLine());
            System.out.println("Введите срок эксплуатации");
            lifeTime=Integer.parseInt(br.readLine());
        } catch (IOException e) {e.printStackTrace();}
    }
    public void Student3(String dates)
    {
        if(typeBuilding.compareTo(dates) > 0)
            vivod();
    }
    public static void main(String[] args) {
        try {
            int roomCount;
            House[] s=new House[0];
            boolean f=true;
            while(f)
            {
                System.out.println("\nВыберите пункт меню:");
                System.out.println("1 - Ввести информацию о квартирах");
                System.out.println("2 - Вывести список квартир, имеющих заданное число комнат");
                System.out.println("3 - Вывести список квартир, имеющих заданное число комнат и расположенных\n на этаже, который находится в заданном промежутке");
                System.out.println("4 - Вывести список квартир, имеющих площадь, превосходящую заданную");
                System.out.println("5 - Выход");
                int N=Integer.parseInt(br.readLine());
                switch (N) {
                    case 1 -> {
                        System.out.println("Введите количество квартир");
                        int n = Integer.parseInt(br.readLine());
                        s = new House[n];
                        for (int i = 0; i < s.length; i++) {
                            s[i] = new House();
                            s[i].vvod();
                        }
                    }
                    case 2 -> {
                        System.out.print("Введите количество комнат\n");
                        roomCount = Integer.parseInt(br.readLine());
                        for (int i = 0; i < s.length; i++)
                            if (roomCount == s[i].getCountRoom())
                                System.out.print(s[i].toString());
                    }
                    case 3 -> {
                        System.out.print("Введите количество комнат\n");
                        roomCount = Integer.parseInt(br.readLine());
                        System.out.print("Введите промежуток этажей\n");
                        int startFloor = Integer.parseInt(br.readLine());
                        int endFloor = Integer.parseInt(br.readLine());
                        for (House house : s)
                            if (roomCount == house.getCountRoom() && startFloor <= house.getStage() && endFloor >= house.getStage())
                                System.out.print(house.toString());
                    }
                    case 4 -> {
                        System.out.print("Введите площадь\n");
                        int square = Integer.parseInt(br.readLine());
                        for (House house : s)
                            if (square == house.getArea())
                                System.out.print(house.toString());
                    }
                    case 5 -> {
                        f = false;
                        return;
                    }
                }
            }
        } catch (IOException e) {e.printStackTrace();}
    }
}
