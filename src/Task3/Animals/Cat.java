package Task3.Animals;

import Task3.Animals.Common.Animal;
import Task3.Animals.Interfaces.Run;


public class Cat extends Animal implements Run {
    public String getName() {
        return "Cat";
    }

    public void run() {
        System.out.println("Cat is running");
    }
}
