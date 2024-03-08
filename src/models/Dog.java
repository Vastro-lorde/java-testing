package models;

public class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override public void eat() {
        System.out.println(this.name + " is chewing");
    }

    @Override public void sound() {
        System.out.println(this.name + " is barking");
    }

    public void play() {
        System.out.println(this.name + " is playing catch");
    }
}
