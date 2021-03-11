package ch.noser.uek223.domain.product.dto;

import ch.noser.uek223.domain.product.Availability;
import ch.noser.uek223.domain.product_purchase.ProductPurchase;
import ch.noser.uek223.domain.product_purchase.dto.ProductPurchaseDTO;
import ch.noser.uek223.domain.user.User;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Set;
import java.util.UUID;

public class ProductDTO {

    private UUID id;

    private String description;

    private float sellingPrice;

    private float buyingPrice;

    private Availability availability;

    //private User supplier;

    //private Set<ProductPurchaseDTO> productPurchases;

    public ProductDTO(UUID id, String description, float sellingPrice, float buyingPrice, Availability availability /*, User supplier, Set<ProductPurchaseDTO> productPurchases*/) {
        this.id = id;
        this.description = description;
        this.sellingPrice = sellingPrice;
        this.buyingPrice = buyingPrice;
        this.availability = availability;
        //this.supplier = supplier;
        //this.productPurchases = productPurchases;
    }

    public ProductDTO() {
    }

    public UUID getId() {
        return id;
    }

    public ProductDTO setId(UUID id) {
        this.id = id;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public ProductDTO setDescription(String description) {
        this.description = description;
        return this;
    }

    public float getSellingPrice() {
        return sellingPrice;
    }

    public ProductDTO setSellingPrice(float sellingPrice) {
        this.sellingPrice = sellingPrice;
        return this;
    }

    public float getBuyingPrice() {
        return buyingPrice;
    }

    public ProductDTO setBuyingPrice(float buyingPrice) {
        this.buyingPrice = buyingPrice;
        return this;
    }

    public Availability getAvailability() {
        return availability;
    }

    public ProductDTO setAvailability(Availability availability) {
        this.availability = availability;
        return this;
    }
/*
    public User getSupplier() {
        return supplier;
    }

    public ProductDTO setSupplier(User supplier) {
        this.supplier = supplier;
        return this;
    }

    public Set<ProductPurchaseDTO> getProductPurchases() {
        return productPurchases;
    }

    public ProductDTO setProductPurchases(Set<ProductPurchaseDTO> productPurchases) {
        this.productPurchases = productPurchases;
        return this;
    }

 */
}
