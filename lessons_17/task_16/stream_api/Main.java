package lessons_17.task_16.stream_api;


import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;


public class Main {



    public static void main(String[] args)  {

        List<Product> products = Shop.getProducts();


        List<Product> productList = products.stream()
                .filter(Product.isCorrectTypeProduct.and(Product.isCorrectPrisesProduct))
                .toList();


        List<Product> productsDiscountPriseList = products.stream()
                .filter(Product.isCorrectTypeProduct)
                .map(Shop::doDiscount)
                .toList();


        Optional<Product> minPrise = products.stream()
                .filter(Product.isCorrectTypeProduct )
                .min(Comparator.comparing(Product::getPriseInCent));



        printList(productList);
    }
    public static void printList(List<Product> list) {
        for (Product l:list) {
            System.out.println(l);
        }
    }

}
