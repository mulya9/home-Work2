package Poliphorism.Competition;

public class Wall extends Let {


    public Wall(double indicators, String name) {
        super(indicators, name);
    }

    public boolean overcome(Participants participants) {
        return participants.getHeight() >= getIndicators();
    }


}
