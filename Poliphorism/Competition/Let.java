package Poliphorism.Competition;

abstract class Let {
    private double indicators;
    private String name;

    public Let(double indicators, String name) {
        this.indicators = indicators;
        this.name = name;
    }

    abstract public boolean overcome(Participants participants);
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getIndicators() {
        return indicators;
    }

    public void setIndicators(double indicators) {
        this.indicators = indicators;
    }
}
