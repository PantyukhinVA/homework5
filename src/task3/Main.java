package task3;

import task3.animals.*;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Bird bird = new Bird();

        System.out.println(dog.getName());
        dog.run();

        System.out.println(cat.getName());
        cat.run();

        System.out.println(bird.getName());
        bird.fly();
        bird.run();
        bird.swim();
    }
}
