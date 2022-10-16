package poliphorism.competition;

abstract class Let {
    private double sizeLet;
    private String name;

    public Let(double sizeLet, String name) {
        this.sizeLet = sizeLet;
        this.name = name;
    }

    abstract public boolean overcome(Participant participant);


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSizeLet() {
        return sizeLet;
    }

    public void setSizeLet(double sizeLet) {
        this.sizeLet = sizeLet;
    }
}
