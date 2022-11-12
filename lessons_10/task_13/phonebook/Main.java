package lessons_10.task_13.phonebook;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();
        Recording recording = new Recording();
        ArrayList<Phonebook> arrayList = new ArrayList<>();
        phonebook.add(recording.setName("Rid"),recording.setTelephone(399768855));
        phonebook.find(arrayList,recording.getName());


    }
}
