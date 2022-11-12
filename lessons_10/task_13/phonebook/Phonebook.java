package lessons_10.task_13.phonebook;

import java.util.ArrayList;
import java.util.Objects;

public class Phonebook implements Interface{



    public String add(String name, Integer tel){

        return name +","+ tel;
    }


    public String find(ArrayList<Phonebook> arr, String name){
        for (Object array:arr) {
            if (Objects.equals(name, array)){
                return name;
            }break;
        }
        return null;
    }
}
