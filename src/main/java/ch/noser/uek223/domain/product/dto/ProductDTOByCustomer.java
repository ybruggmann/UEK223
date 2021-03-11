package ch.noser.uek223.domain.product.dto;

import ch.noser.uek223.domain.user.dto.UserDTOSupplier;

import java.util.UUID;

public class ProductDTOByCustomer {

    private UserDTOSupplier customer;

    private UUID id;

    private float sellingPrice;

    public ProductDTOByCustomer(UserDTOSupplier customer, UUID id, float sellingPrice) {
        this.customer = customer;
        this.id = id;
        this.sellingPrice = sellingPrice;
    }

    public ProductDTOByCustomer() {
    }

    public UserDTOSupplier getCustomer() {
        return customer;
    }

    public ProductDTOByCustomer setCustomer(UserDTOSupplier customer) {
        this.customer = customer;
        return this;
    }

    public UUID getId() {
        return id;
    }

    public ProductDTOByCustomer setId(UUID id) {
        this.id = id;
        return this;
    }

    public float getSellingPrice() {
        return sellingPrice;
    }

    public ProductDTOByCustomer setSellingPrice(float sellingPrice) {
        this.sellingPrice = sellingPrice;
        return this;
    }
}
