package poliphorism.competition;

public class Treadmill extends Let {


    public Treadmill(double indicators, String name) {
        super(indicators, name);
    }

    @Override

    public boolean overcome(Participant participant) {
        return participant.getCanRunlong() >= getSizeLet();
    }


}
