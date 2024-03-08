package models;

public class Animal {
    public String name;
    public int age;
    // Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println(this.name + " is eating");
    }

    public void sound() {
        System.out.println(this.name + " is making sound");
    }

    
}
