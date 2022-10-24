package lesson5.task_1.exseption;

public class ArrayDataException extends CustomException{

    public ArrayDataException(int i, int j) {
        super(String.format("Wrong data is in the cells [%d,%d]\n",i,j));

    }

}
