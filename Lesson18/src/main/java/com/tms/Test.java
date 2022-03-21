package com.tms;

import com.tms.storetmp.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import static java.util.Objects.nonNull;

public class Test {
    public static void main(String[] args) {
        Product productById = findProductById(12);
        if (productById != null) {
//            productById
            //логика
        }
        if (nonNull(productById)) {
            //логика
        }
        Predicate<String> containsA = t -> t.contains("A");
        Predicate<String> containsB = t -> t.contains("B");
        System.out.println(containsA.and(containsB).test("ABCD"));
    }

    private static Product findProductById(int id) {
        List<Product> productList = new ArrayList<>();//getAllProducts();
        return productList.stream()
                .filter(product -> product.getId() == id)
                .findFirst()
                .orElse(null);
    }
}
