package Poliphorism.Figure;

public class Square implements Figure {
   private int a;
   private int s;

   public Square(int a) {
      this.a = a;
   }

   public double figureArea() {
      s = a * a;
      return s;
   }

   public int getA() {
      return a;
   }

   public void setA(int a) {
      this.a = a;
   }

   public int getS() {
      return s;
   }

   public void setS(int s) {
      this.s = s;
   }
}
