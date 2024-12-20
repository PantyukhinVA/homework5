package task3.animals;

import task3.animals.common.Animal;
import task3.animals.interfaces.Run;

public class Dog extends Animal implements Run {
    public String getName() {
        return "Dog";
    }

    public void run() {
        System.out.println("Dog is running");
    }
}