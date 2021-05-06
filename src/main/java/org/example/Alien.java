package org.example;

public class Alien {
    private int age;

    //private Laptop laptop;
    private Computer computer;

    public Alien() {
        System.out.println("Alien Object Created");
    }


/*
    If u have a bean for this class and u didnt mention any constructor args in xml file for this class bean then it gives an error because it has no default constructor
*/
    /*public Alien(){
        System.out.println("Alien Object Created");
    }*/
    /*//constructor injection
    public Alien(int age, Laptop laptop) {
        this.age = age;
        this.laptop = laptop;
    }*/

    /*public Laptop getLaptop() {
        return laptop;
    }

    //setter injection
    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }*/


    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Age is assigned");
        this.age = age;
    }

    public void code() {
        System.out.println("I am coding...");
        computer.compile();
    }
}
