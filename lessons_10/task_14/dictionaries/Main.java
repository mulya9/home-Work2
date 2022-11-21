package lessons_10.task_14.dictionaries;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        FileNavigator fileNavigator = new FileNavigator();
        FileData data = new FileData();
        FileData data1 = new FileData();
        FileData data2 = new FileData();

        data.setSize(250);
        data.setFileName("file1");
        data.setPath("C:\\Users\\Acer\\Test");

        data1.setSize(256);
        data1.setFileName("file2");
        data1.setPath("C:\\Users\\Acer\\Test");

        data2.setSize(250);
        data2.setFileName("file3");
        data2.setPath("C:\\Users\\Acer\\Test\\Test2");

        fileNavigator.add(data);
        fileNavigator.add(data1);
        fileNavigator.add(data2);


        fileNavigator.dataMap.forEach((key,value)-> System.out.println("( KEY = " + key + "):" + " ( VALUE = " +
                value + " )"));
    }
}
