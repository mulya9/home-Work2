package poliphorism.competition;

public class Wall extends Let {


    public Wall(double indicators, String name) {
        super(indicators, name);
    }

    @Override

    public boolean overcome(Participant participant) {
        return participant.getCanJumpHigh() >= getSizeLet();
    }

}
