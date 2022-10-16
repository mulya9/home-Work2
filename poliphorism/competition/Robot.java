package poliphorism.competition;

public class Robot extends Participant {


    public Robot(String name, double canRunlong, double canJumpHigh) {
        super(name, canRunlong, canJumpHigh);
    }

    @Override

    public void run(String nameLet) {
        System.out.println(getName() + " run on ");
    }

    @Override

    public void jump(String nameLet) {
        System.out.println(getName() + " jump through ");
    }
}
