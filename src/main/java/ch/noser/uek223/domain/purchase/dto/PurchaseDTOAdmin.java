package ch.noser.uek223.domain.purchase.dto;

import ch.noser.uek223.domain.product_purchase.ProductPurchase;
import ch.noser.uek223.domain.product_purchase.dto.ProductPurchaseDTO;
import ch.noser.uek223.domain.user.User;

import java.util.Set;
import java.util.UUID;

public class PurchaseDTOAdmin {

    private UUID id;

    private Set<ProductPurchaseDTO> productPurchases;

    private User customer;

    public PurchaseDTOAdmin(UUID id, Set<ProductPurchaseDTO> productPurchases, User customer) {
        this.id = id;
        this.productPurchases = productPurchases;
        this.customer = customer;
    }

    public PurchaseDTOAdmin() {
    }

    public UUID getId() {
        return id;
    }

    public PurchaseDTOAdmin setId(UUID id) {
        this.id = id;
        return this;
    }

    public Set<ProductPurchaseDTO> getProductPurchases() {
        return productPurchases;
    }

    public PurchaseDTOAdmin setProductPurchases(Set<ProductPurchaseDTO> productPurchases) {
        this.productPurchases = productPurchases;
        return this;
    }

    public User getCustomer() {
        return customer;
    }

    public PurchaseDTOAdmin setCustomer(User customer) {
        this.customer = customer;
        return this;
    }
}
