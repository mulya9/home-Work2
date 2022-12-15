package lessons_17.task_16.stream_api;

import jdk.javadoc.doclet.Doclet;

import java.lang.invoke.StringConcatException;
import java.util.*;
import java.util.function.Predicate;
import java.util.Optional;
public class Shop {
    private static final List<Product> PRODUCTS = Arrays.asList(
            new Product("Book",250),
            new Product("Book",260),
            new Product("Book",255),
            new Product("Toy",235),
            new Product("Book",214),
            new Product("Book",278),
            new Product("Toy",367),
            new Product("Book",184),
            new Product("Book",293),
            new Product("Toy",115),
            new Product("Book",572),
            new Product("Toy",287),
            new Product("Book",126),
            new Product("Book",235),
            new Product("Toy",249),
            new Product("Book",257),
            new Product("Book",292),
            new Product("Book",240));

    public static List<Product>getProducts(){
        return new  ArrayList<>(PRODUCTS);
    }

    public static Product doDiscount(Product product) {

    long discount = product.getPriseInCent()*100/1000;

        return new Product("Book",product.getPriseInCent() - discount );
    }
    public static void typeException(Product product)  {
        if (minPrise.isPresent()) {
            minPrise.get();
        }else{
            throw new NoSuchElementException("Продукт [категория: " +product.getType() + " ] не найден");
        }

    }
}

