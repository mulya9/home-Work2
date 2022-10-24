package lesson5.task_1.exseption;

public class CustomException extends Exception{
    CustomException(String message){
        super(message);
    }

    public void printStackTrace(String message) {
        System.out.println(message);

    }
}
