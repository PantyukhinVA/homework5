package Task4.Human;

public class Swimmer extends Human {
    public String getName() {
        return "Swimmer";
    }

    public void run() {
        System.out.println("A swimmer can't run");
    }

    public void swim() {
        System.out.println("Swimmer is swimming");
    }
}