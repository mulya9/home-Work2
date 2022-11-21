package lessons_10.task_14.dictionaries;

import java.util.*;

public class FileNavigator {

    Map<String, List<FileData>> dataMap = new HashMap<>();


    public void add(FileData data) {
        if (data.getPath()== null)
            System.out.println(" Path missing ");

        else if (!dataMap.containsKey(data.getPath())) {
            List<FileData> fileDataList = new ArrayList<>();
            fileDataList.add(data);
            dataMap.put(data.getPath(), fileDataList);
        } else {
            List<FileData> fileDataList = dataMap.get(data.getPath());
            fileDataList.add(data);
            dataMap.put(data.getPath(), fileDataList);
        }
    }

    public List<FileData> find(String path) {
        return dataMap.get(path);
    }

    public List<FileData> filterBySize(int maxSize) {
        Collection<List<FileData>> values = dataMap.values();
        List<FileData> data = new ArrayList<>();
        for (List<FileData> arr:values) {
            for (FileData file:arr){
                if (file.getSize() <= maxSize){
                    data.add(file);
                }
            }
        }
        return data;
    }

    public void remove(String path) {
        dataMap.remove(path);
    }


    public List<FileData> sortBySize() {
        List<FileData> sortData = new ArrayList<>();
        for (List<FileData> arr:dataMap.values()) {
            sortData.addAll(arr);
        }

        return sortData.stream().sorted(Comparator.comparing(FileData::getSize)).toList();
    }

    @Override
    public String toString() {
        return "FileNavigator{" +
                "dataMap=" + dataMap +
                '}';
    }
}
