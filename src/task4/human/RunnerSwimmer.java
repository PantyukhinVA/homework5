package task4.human;

public class RunnerSwimmer extends Human {
    public String getName() {
        return "RunnerSwimmer";
    }

    public void run() {
        System.out.println("RunnerSwimmer is running");
    }

    public void swim() {
        System.out.println("RunnerSwimmer is swimming");
    }
}
