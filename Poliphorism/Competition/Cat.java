package Poliphorism.Competition;

public class Cat extends Participants {
    public Cat(String name, double length, double height) {
        super(name, length, height);
    }

    void run() {
        System.out.println("Cat can run");
    }

    void jump() {
        System.out.println("Cat can jump");
    }
}
