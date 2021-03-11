package ch.noser.uek223.domain.product_purchase.dto;

import ch.noser.uek223.domain.product.Product;
import ch.noser.uek223.domain.purchase.Purchase;

import java.util.UUID;

public class ProductPurchaseDTO {

    private UUID id;

    private Purchase purchase;

    private Product product;

    private int amount;

    public ProductPurchaseDTO(UUID id, Purchase purchase, Product product, int amount) {
        this.id = id;
        this.purchase = purchase;
        this.product = product;
        this.amount = amount;
    }

    public ProductPurchaseDTO() {
    }

    public UUID getId() {
        return id;
    }

    public ProductPurchaseDTO setId(UUID id) {
        this.id = id;
        return this;
    }

    public Purchase getPurchase() {
        return purchase;
    }

    public ProductPurchaseDTO setPurchase(Purchase purchase) {
        this.purchase = purchase;
        return this;
    }

    public Product getProduct() {
        return product;
    }

    public ProductPurchaseDTO setProduct(Product product) {
        this.product = product;
        return this;
    }

    public int getAmount() {
        return amount;
    }

    public ProductPurchaseDTO setAmount(int amount) {
        this.amount = amount;
        return this;
    }
}
