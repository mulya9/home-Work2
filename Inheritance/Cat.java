package Inheritance;

public class Cat extends Animals {
    String name;
    int swimTestimony;
    int runTestimony;

    public Cat(String name, int swimTestimony, int runTestimony) {
        this.name = name;
        this.swimTestimony = swimTestimony;
        this.runTestimony = runTestimony;

    }


    public void run() {
        if (runTestimony > 200) {
            System.out.println(name + " can't run more than 200 m.");

        } else {
            System.out.println(name + " ran " + runTestimony + " m.");
        }


    }

    public void swim() {
        System.out.println(name + " can't swim ");
    }
}
