package Task3.Animals;

import Task3.Animals.Common.Animal;
import Task3.Animals.Interfaces.Run;

public class Dog extends Animal implements Run {
    public String getName() {
        return "Dog";
    }

    public void run() {
        System.out.println("Dog is running");
    }
}