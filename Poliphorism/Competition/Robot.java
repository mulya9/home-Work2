package Poliphorism.Competition;

public class Robot extends Participants {
    public Robot(String name, double length, double height) {
        super(name, length, height);
    }

    void run() {
        System.out.println("Robot can run");
    }

    void jump() {
        System.out.println("Robot can jump");
    }
}
