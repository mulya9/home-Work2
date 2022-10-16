package Poliphorism.Competition;

abstract class Participants {
    private String name;
    private double length;
    private double height;

    public Participants(String name, double length, double height) {
        this.name = name;
        this.length = length;
        this.height = height;
    }

    abstract void run();

    abstract void jump();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
