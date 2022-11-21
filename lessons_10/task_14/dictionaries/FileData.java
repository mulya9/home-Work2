package lessons_10.task_14.dictionaries;

public class FileData {

    private String fileName;
    private int size;
    private String path;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "FileData{" +
                "fileName='" + fileName + '\'' +
                ", size=" + size +
                ", path='" + path + '\'' +
                '}';
    }
}
