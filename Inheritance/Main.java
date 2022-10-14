package Inheritance;

public class Main {
    public static void main(String[] args) {
        Animals animals = new Animals();
        Dog dogBobik = new Dog("Bobik", 9, 256);
        Dog dogBos = new Dog("Bos", 12, 346);
        Dog dogStar = new Dog("Star", 7, 560);
        Cat catBarsik = new Cat("Barsik", 34, 230);
        Cat catTom = new Cat("Tom", 47, 126);
        Cat catBlack = new Cat("Black", 27, 165);
        dogBobik.run();
        dogBobik.swim();
        catBarsik.run();
        catBarsik.swim();
        animals.count.add(dogBobik);
        animals.count.add(dogBos);
        animals.count.add(dogStar);
        animals.count.add(catBarsik);
        animals.count.add(catBlack);
        animals.count.add(catTom);

    }


}
