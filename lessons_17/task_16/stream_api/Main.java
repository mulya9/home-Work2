package lessons_17.task_16.stream_api;


import java.time.LocalDate;
import java.util.*;


public class Main {

    public static void main(String[] args)  {

        ProductService productService= new ProductService();

        System.out.println((productService.listHashMapProduct(getProducts())));
        System.out.println((productService.totalSumProductsInCategory(getProducts())));
        System.out.println((productService.productList(getProducts())));
        System.out.println((productService.priseByDiscount(getProducts())));
        System.out.println((productService.minPriseProduct(getProducts())));
        System.out.println((productService.lastThreeAddProduct(getProducts())));
    }



    static List<Product> PRODUCTS = Arrays.asList(
            new Product(1,ProductType.BOOK,255,10, LocalDate.of(2021,10,29)),
            new Product(2,ProductType.TOY,246,13, LocalDate.of(2022,11,14)),
            new Product(3,ProductType.MEAT,268,10, LocalDate.of(2022,9,27)),
            new Product(4,ProductType.BREAD,210,9, LocalDate.of(2022,10,8)),
            new Product(5,ProductType.FRUITS,156,10, LocalDate.of(2022,12,17)),
            new Product(6,ProductType.BOOK,246,17, LocalDate.of(2021,11,13)));

    public static List<Product> getProducts() {
        return new ArrayList<>(PRODUCTS);
    }

}
