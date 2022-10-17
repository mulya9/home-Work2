package poliphorism.competition;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Bob",350,1.6);
        Robot robot = new Robot("Verter", 370, 2.4);
        Cat cat = new Cat("Tom", 200, 1.2);
        Treadmill treadmill = new Treadmill(270, " Treadmill ");
        Wall wall = new Wall(1.5, " Wall ");

        human.run(treadmill.getName());
        cat.jump(wall.getName());


        List<Participant> participants = new ArrayList<>();
        participants.add(human);
        participants.add(robot);
        participants.add(cat);

        List<Let> lets = new ArrayList<>();
        lets.add(treadmill);
        lets.add(wall);

        for (Participant participant1 : participants) {
            for (Let let : lets) {
                if (let.overcome(participant1)) {
                    participant1.run(wall.getName());
                    System.out.println("Participants " + participant1.getName() + " passed the obstacle "
                            + let.getName() + " on size " + let.getSizeLet());
                } else {
                    System.out.println("Participants " + participant1.getName() + " did not  passe the obstacle "
                            + let.getName() + " at a size " + let.getSizeLet() + ".");
                    System.out.println();
                    System.out.println(participant1.getName()+ " dropped out of the competition "+
                             participant1.getCanRunlong());
                }break;
            }

        }

    }

}
