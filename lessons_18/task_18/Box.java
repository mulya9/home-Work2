package lessons_18.task_18;

import java.util.ArrayList;
import java.util.List;

public class Box<E extends Fruit> {
    private final List<E> boxList = new ArrayList<>();


    public void add(E fruit) {
        boxList.add(fruit);
    }


    public void addAll(List<E> fruitList) {
        boxList.addAll(fruitList);
    }


    public float getWeight() {
        return boxList.size() * boxList.get(0).getWeight();
    }


    public boolean compare(Box<? extends Fruit> boxFruits) {
        return getWeight() == boxFruits.getWeight();
    }


    public void merge(Box<E> secondBox) {
        this.boxList.addAll(secondBox.boxList);
        secondBox.boxList.clear();
    }


    public List<E> getBoxList() {
        return boxList;
    }

    @Override
    public String toString() {
        return "Box{" +
                "boxList=" + boxList +
                '}';
    }
}
