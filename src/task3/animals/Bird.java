package task3.animals;

import task3.animals.common.Animal;
import task3.animals.interfaces.*;

public class Bird extends Animal implements Fly, Run, Swim {
    public String getName() {
        return "Bird";
    }

    public void fly() {
        System.out.println("Bird is flying");
    }

    public void run() {
        System.out.println("Bird is running");
    }

    public void swim() {
        System.out.println("Bird is swimming");
    }
}