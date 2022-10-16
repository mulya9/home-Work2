package Poliphorism.Competition;

public class Human extends Participants {
    public Human(String name, double length, double height) {
        super(name, length, height);
    }

    void run() {
        System.out.println("Human can run");
    }

    void jump() {
        System.out.println("Human can jump");
    }
}
