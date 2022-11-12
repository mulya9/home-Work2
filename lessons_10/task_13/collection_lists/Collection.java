package lessons_10.task_13.collection_lists;

import java.util.*;

public class Collection {
    public static void main(String[] args) {

       LinkedList<Integer> list = new LinkedList<>();
       ArrayList<String> arr = new ArrayList<>();
       arr.add("dog");
       arr.add("dog");
       arr.add("dog");
       arr.add("dog");
       arr.add("cat");
       arr.add("cat");
       arr.add("cat");
       arr.add("cat");
       arr.add("cat");
       arr.add("bird");
       arr.add("bird");
       arr.add("bird");
       calcOccurance(arr);
    }

    public static int  countOccurance(ArrayList<String> arrayList, String str) {
        int count = 0;
        for (Object arr:arrayList) {
            if (arr == str){
                count++;
            }
        }return count;
    }

    public static List<Integer> toList(int[] array){

        return new ArrayList<>(array.length);
    }

    public static LinkedList<Integer> findUnique(LinkedList<Integer> list){
        LinkedList<Integer> newList = new LinkedList<>();
        for (int i = 0;i < list.element() -1;i++) {
            if (!Objects.equals(list.element(), list.element())){
                 newList.add(list.element());

            }
        }
        return newList;
    }
    public static void  calcOccurance(ArrayList<String> words) {
        HashMap<String,Integer> wordCount = new HashMap<>();
        for (String word:words) {
            if (!wordCount.containsKey(word)) {
                wordCount.put(word,0);
            }
            wordCount.put(word, wordCount.get(word) +1);
        }
        for (String word:wordCount.keySet()) {
            System.out.println(word + ":" + wordCount.get(word));

        }

    }
    public static String  findOccurance(ArrayList<String> words) {
        HashMap<String,Integer> wordCount = new HashMap<>();
        for (String word:words) {
            if (!wordCount.containsKey(word)) {
                wordCount.put(word,0);
            }
            wordCount.put(word, wordCount.get(word) +1);
        }
        for (String word:wordCount.keySet()) {

            String string = word + ":" + wordCount.get(word);
        }
        return "";

    }
}
