package lesson5.task_1.exseption;

public class ArrayDataException extends Exception {

    public ArrayDataException(String s, int i, int j) {
        super(String.format(s, i, j));

    }

}
