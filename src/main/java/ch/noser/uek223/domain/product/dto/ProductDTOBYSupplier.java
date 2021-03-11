package ch.noser.uek223.domain.product.dto;

import ch.noser.uek223.domain.user.dto.UserDTOSupplier;

import java.util.UUID;

public class ProductDTOBYSupplier {

    private UserDTOSupplier supplier;

    private UUID id;

    private float buyingPrice;

    private float sellingPrice;

    public ProductDTOBYSupplier(UserDTOSupplier supplier, UUID id, float buyingPrice, float sellingPrice) {
        this.supplier = supplier;
        this.id = id;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public ProductDTOBYSupplier() {
    }

    public UserDTOSupplier getSupplier() {
        return supplier;
    }

    public ProductDTOBYSupplier setSupplier(UserDTOSupplier supplier) {
        this.supplier = supplier;
        return this;
    }

    public UUID getId() {
        return id;
    }

    public ProductDTOBYSupplier setId(UUID id) {
        this.id = id;
        return this;
    }

    public float getBuyingPrice() {
        return buyingPrice;
    }

    public ProductDTOBYSupplier setBuyingPrice(float buyingPrice) {
        this.buyingPrice = buyingPrice;
        return this;
    }

    public float getSellingPrice() {
        return sellingPrice;
    }

    public ProductDTOBYSupplier setSellingPrice(float sellingPrice) {
        this.sellingPrice = sellingPrice;
        return this;
    }
}
