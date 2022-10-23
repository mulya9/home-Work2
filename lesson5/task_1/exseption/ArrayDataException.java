package lesson5.task_1.exseption;

public class ArrayDataException extends Exception{
    public int i;
    public int j;

    public ArrayDataException(int i, int j) {
    }

    public ArrayDataException(String message) {
        super(message);
    }

    public ArrayDataException(String message, Throwable cause) {
        super(message, cause);
    }

    public ArrayDataException(Throwable cause) {
        super(cause);
    }

    public ArrayDataException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
