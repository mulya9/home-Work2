package lessons_17.task_16.stream_api;


import java.util.function.Predicate;

public class Product {
    private final String type;
    private final long priseInCent;

    public static final Predicate<Product> isCorrectPrisesProduct = product ->  250 <= product.getPriseInCent();

    public static final Predicate<Product> isCorrectTypeProduct = product-> "Book".equals(product.getType());





    public Product(String type, long prise) {
        this.type = type;
        this.priseInCent = prise;
    }

    @Override
    public String toString() {
        return "Product " +
                "type ='" + type + '\'' +
                ", prise = " + priseInCent +" bitcoint "+
                ' ';
    }

    public  String getType() {
        return type;
    }

    public long getPriseInCent() {
        return priseInCent;
    }
}
