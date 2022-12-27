package lessons_18.task_18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String[] arrayString = new String[]{"Apple","Orange","Fruits"};
        System.out.println(toList(arrayString));
        System.out.println("----------------------------------------------");

        Box<Orange> boxByOrange = new Box<>();
        Box<Apple> boxByApple = new Box<>();
        Box<Orange> secondBoxByOrange = new Box<>();


        boxByOrange.add(new Orange());
        boxByOrange.add(new Orange());
        boxByOrange.add(new Orange());
        System.out.println(boxByOrange);
        System.out.println("----------------------------------------------");


        List<Apple> appleList = new ArrayList<>();
        appleList.add(new Apple());
        appleList.add(new Apple());
        appleList.add(new Apple());
        appleList.add(new Apple());
        System.out.println(appleList);
        System.out.println("----------------------------------------------");

        boxByApple.addAll(appleList);
        System.out.println(boxByApple);
        System.out.println("----------------------------------------------");

        System.out.println(boxByOrange.getWeight());
        System.out.println("----------------------------------------------");
        System.out.println(boxByApple.compare(boxByOrange));
        System.out.println("----------------------------------------------");
        boxByOrange.merge(secondBoxByOrange);
        System.out.println(boxByOrange);
        System.out.println(boxByOrange.getBoxList().isEmpty());
    }


    public static List<String> toList(String[] arrayString) {
        return Arrays.stream(arrayString).toList();
    }


}
