package za.co.admatech.factory;

import za.co.admatech.domain.Money;
import za.co.admatech.domain.Product;

public class ProductFactory {

    public static Product createProduct(String productId, String name, String description, String sku, Money price, String categoryId) {
        return new Product.Builder()
                .setProductId(productId)
                .setName(name)
                .setDescription(description)
                .setSku(sku)
                .setPrice(price)
                .setCategoryId(categoryId)
                .build();
    }
}