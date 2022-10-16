package Poliphorism.Competition;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Bob", 300, 1.6);
        Robot robot = new Robot("Verter", 370, 2.4);
        Cat cat = new Cat("Tom", 200, 1.2);
        Treadmill treadmill = new Treadmill(270, " Treadmill ");
        Wall wall = new Wall(1.5, " Wall ");

        List<Participants> participants = new ArrayList<>();
        participants.add(human);
        participants.add(robot);
        participants.add(cat);

        List<Let> lets = new ArrayList<>();
        lets.add(treadmill);
        lets.add(wall);

        for (Participants participants1 : participants) {
            for (Let let : lets) {
                if (let.overcome(participants1)) {
                    System.out.println("Participants " + participants1.getName() + " passed the obstacle "
                            + let.getName() + " on indicators " + let.getIndicators());
                } else {
                    System.out.println("Participants " + participants1.getName() + " did not  passe the obstacle "
                            + let.getName() + " at a distance " + let.getIndicators() + ".");
                }
            }
        }
    }

}
