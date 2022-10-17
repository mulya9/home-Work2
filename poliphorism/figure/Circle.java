package poliphorism.figure;

public class Circle implements Figure {
    private int r;

    public Circle(int r) {
        this.r = r;
    }

    public double figureArea() {
        return Math.PI * (r * r);
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

}
