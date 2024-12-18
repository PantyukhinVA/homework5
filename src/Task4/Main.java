package Task4;

import Task4.Human.*;

public class Main {
    public static void main(String[] args) {
        Human runner = new Runner();
        Human swimmer = new Swimmer();
        Human runnerSwimmer = new RunnerSwimmer();

        System.out.println(runner.getName());
        runner.run();
        runner.swim();

        System.out.println(swimmer.getName());
        swimmer.run();
        swimmer.swim();

        System.out.println(runnerSwimmer.getName());
        runnerSwimmer.run();
        runnerSwimmer.swim();
    }
}
