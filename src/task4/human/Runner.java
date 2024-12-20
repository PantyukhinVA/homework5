package task4.human;

public class Runner extends Human {
    public String getName() {
        return "Runner";
    }

    public void run() {
        System.out.println("Runner is running");
    }

    public void swim() {
        System.out.println("A runner can't swim");
    }
}
