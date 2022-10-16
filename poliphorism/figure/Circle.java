package poliphorism.figure;

public class Circle implements Figure {
    private int r;
    private double s;

    public Circle(int r) {
        this.r = r;
    }

    public double figureArea() {
        s = Math.PI * (r * r);
        return s;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public double getS() {
        return s;
    }

    public void setS(double s) {
        this.s = s;
    }
}
