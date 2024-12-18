package Task3.Animals;

import Task3.Animals.Common.Animal;
import Task3.Animals.Interfaces.*;

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