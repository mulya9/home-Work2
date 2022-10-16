package poliphorism.competition;

abstract class Participant {
    private String name;
    private double canRunlong;
    private double canJumpHigh;

    public Participant(String name, double canRunlong, double canJumpHigh) {
        this.name = name;
        this.canRunlong = canRunlong;
        this.canJumpHigh = canJumpHigh;
    }

    public abstract void run(String nameLet);

    public abstract void jump(String nameLet);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCanRunlong() {
        return canRunlong;
    }

    public void setCanRunlong(double canRunlong) {
        this.canRunlong = canRunlong;
    }

    public double getCanJumpHigh() {
        return canJumpHigh;
    }

    public void setCanJumpHigh(double canJumpHigh) {
        this.canJumpHigh = canJumpHigh;
    }
}
