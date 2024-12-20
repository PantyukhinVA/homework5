package task3.animals;

import task3.animals.common.Animal;
import task3.animals.interfaces.Run;


public class Cat extends Animal implements Run {
    public String getName() {
        return "Cat";
    }

    public void run() {
        System.out.println("Cat is running");
    }
}
