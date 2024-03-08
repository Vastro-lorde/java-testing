import models.Animal;
import models.Dog;
import models.Matter;

public class App {
    public static void main(String[] args) throws Exception {

        Animal[] animals = new Animal[2];
        animals[0] = new Animal("Seun", 5);
        animals[1] = new Dog("Billy", 3);

        for (Animal a : animals) {
            a.eat();
            a.sound();
        }

        Matter box = new Matter("Black Box", 5, 0, 50);
        box.setZPosition(2);
        box.setArea(5, 5);
        System.out.println(box.getArea());
    }
}
