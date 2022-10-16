package Poliphorism.Competition;

public class Treadmill extends Let {


    public Treadmill(double indicators, String name) {
        super(indicators, name);
    }

    public boolean overcome(Participants participants) {
        return participants.getLength() >= getIndicators();
    }


}
