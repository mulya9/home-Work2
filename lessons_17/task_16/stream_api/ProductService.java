package lessons_17.task_16.stream_api;

import java.time.LocalDate;
import java.util.*;

import java.util.function.Predicate;

public class ProductService {
    long DISCOUNT = 10;
    public static final Predicate<Product> isCorrectPrisesProduct = product -> 250 <= product.getPrise();

    public static final Predicate<Product> isCorrectTypeProduct = product -> ProductType.BOOK.equals(product.getType());

    public List<Product> productList(List<Product> productList) {
        return productList.stream()
                .filter(isCorrectTypeProduct.and(isCorrectPrisesProduct))
                .toList();

    }

    public List<Product> priseByDiscount(List<Product> productList) {
        return productList.stream()
                .filter(isCorrectTypeProduct.and(product1 -> product1.getDiscount() == DISCOUNT))
                .peek(p -> p.setPrise(p.getPrise() - (p.getPrise() * 100 / 1000)))
                .toList();


    }

    public Product minPriseProduct(List<Product> productList) {
     return productList.stream()
              .filter(isCorrectTypeProduct)
              .min(Comparator.comparing(Product::getPrise))
              .orElseThrow(()->new RuntimeException(  "Продукт [категория: BOOK] не найден"));
    }

    public List<Product> lastThreeAddProduct(List<Product> productList) {
        return productList.stream()
                .sorted(Comparator.comparing(Product::getCreateDate))
                .skip(productList.size()-3)
                .toList();
    }

    public long totalSumProductsInCategory(List<Product> productList) {
        return productList.stream()
                .filter(isCorrectTypeProduct.and(p->p.getPrise()<=75).and(p->p.getCreateDate().isAfter(LocalDate.of(
                        2021,8,1))&& p.getCreateDate().isBefore(LocalDate.of(2022,7,
                        31))))
                .mapToLong(Product::getPrise)
                .sum();
    }

    public Map<ProductType,LinkedList<Product>> listHashMapProduct(List<Product> productList) {
        Map<ProductType, LinkedList<Product>> productListHashMap = new HashMap<>();
        productList.stream().map(Product::getType).forEach(p -> productListHashMap.put(p, new LinkedList<>()));
        productList.forEach(p -> productListHashMap.get(p.getType()).add(p));
        return productListHashMap;
    }

}

