package Task2;

import Task2.Animals.*;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal bird = new Bird();

        System.out.println(dog.getName());
        System.out.println(cat.getName());
        System.out.println(bird.getName());
    }
}
