package Inheritance;

public class Dog extends Animals {
    String name;
    int swimTestimony;
    int runTestimony;

    public Dog(String name, int swimTestimony, int runTestimony) {
        this.name = name;
        this.swimTestimony = swimTestimony;
        this.runTestimony = runTestimony;

    }


    public void swim() {
        limited();
    }

    public void run() {
        if (runTestimony > 500) {
            System.out.println(name + " can't run more than 500 m.");
        } else {
            System.out.println(name + " ran " + runTestimony + " m");
        }
    }

    public void limited() {
        if (swimTestimony < 10)
            System.out.println(name + " swim " + swimTestimony + " m.");
        else {
            System.out.println("Can't swim more than 10 meters");
        }

    }
}
