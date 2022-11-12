package lessons_10.task_13.phonebook;

import java.util.ArrayList;

public interface Interface {

    String add(String name, Integer tel);

    String find(ArrayList<Phonebook> arr, String name);
}
