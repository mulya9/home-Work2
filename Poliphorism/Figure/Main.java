package Poliphorism.Figure;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(15);
        Square square = new Square(13);
        Triangle triangle = new Triangle(12, 9, 16);
        Figure[] figures = new Figure[]{square, circle, triangle};
        sumAreasFigure(figures);
    }

    public static void sumAreasFigure(Figure[] figures) {
        double sum = 0;
        for (Figure figure : figures) {
            sum = sum + figure.figureArea();
        }
        System.out.println("Sum areas figures " + sum);
    }


}
