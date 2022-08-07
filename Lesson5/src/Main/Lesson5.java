package Main;

import Model.Human;
import Model.Car;

public class Lesson5 {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.firstName = "Vahe";
        human1.lastName = "Mkhitaryan";
        human1.gender = 'm';
        human1.isArmenian = true;
        human1.year = 1982;

        Human human2 = new Human();
        human2.firstName = "Qristine";
        human2.lastName = "Sargsyan";
        human2.gender = 'f';
        human2.isArmenian = true;
        human2.year = 1993;

        System.out.println(human1.lastName + " " + human1.firstName);

        if (human1.year < human2.year)
            System.out.println(human1.firstName);
        else
            System.out.println(human2.firstName);
        System.out.println("----------------");

        System.out.println(human1.year < human2.year ? human1.firstName : human2.firstName);
        System.out.println("----------------");

        Car car1 = new Car();
        car1.setModel("Dodge");
        car1.setYear(2016);
        System.out.println(car1.getEngine());
        System.out.println("----------------");

        human1.sayHello();
        human2.printFullName();
        human1.printFullName();
        System.out.println("----------------");

        String s = human1.fullName();
        System.out.println("Full name of human1 is " + s);
        System.out.println("----------------");

        human2.sum(4,6);
        System.out.println("----------------");

        human1.print1toN(5);
        human2.print1toN(15);
        human2.print1toN(100);
        System.out.println("----------------");

        Car car=new Car();
        //   car.engine= -8.8;
        car.setEngine(-8.8);
        System.out.println(car.getEngine());


        car.setModel("BWM");
        car.setEngine(2.4);
        car.setYear(2018);
        System.out.println(car.getModel()+","+ car.getYear());
        System.out.println("----------------");

        car1.setModel("Dodge");
        car1.setEngine(2.4);
        car1.setYear(2016);
        System.out.println(car1.getModel()+","+car1.getYear() );

        System.out.println("----------------");

        String text="Hello from Lesson 5";
        System.out.println(text.length());
        System.out.println(text.charAt(0));
        for (int i = 0; i < text.length(); i++) {
            System.out.println(text.charAt(i));
        }
        System.out.println("----------------");
        int countOfS =0;
        for (int i = 0; i <text.length(); i++) {
            if(text.charAt(i)=='s')
                countOfS++;
        }
        System.out.println(countOfS);
        String z= text.toUpperCase();
        System.out.println(z);
        System.out.println("----------------");



    }
}