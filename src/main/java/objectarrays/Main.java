package objectarrays;

import java.util.Arrays;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(1.5, 10.99, 101);
        Product product2 = new Product(2.0, 7.99, 102);
        Product product3 = new Product(1.0, 14.99, 103);
        List<Product> productList = Arrays.asList(product1, product2, product3);

        // Sort products based on their price
        productList.sort(null);

        // Print sorted products
        for (Product product : productList) {
            System.out.println(product);
        }
    }
}

