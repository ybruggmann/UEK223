package ch.noser.uek223.domain.product;

import ch.noser.uek223.domain.product_purchase.ProductPurchase;
import ch.noser.uek223.domain.user.User;
import com.fasterxml.jackson.annotation.JsonBackReference;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;
import java.util.Set;
import java.util.UUID;

@Entity
public class Product {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator",
            parameters = {
                    @org.hibernate.annotations.Parameter(
                            name = "uuid_gen_strategy_class",
                            value = "org.hibernate.id.uuid.CustomVersionOneStrategy"
                    )
            }
    )
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;

    private String description;

    @Column(nullable = false)
    private float sellingPrice;

    @Column(nullable = false)
    private float buyingPrice;

    @Enumerated(EnumType.ORDINAL)
    private Availability availability;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.EAGER)
    private User supplier;

    @JsonBackReference
    @OneToMany(mappedBy = "product")
    private Set<ProductPurchase> productPurchases;

    public Product(UUID id, String description, float sellingPrice, float buyingPrice, Availability availability, User supplier, Set<ProductPurchase> productPurchases) {
        this.id = id;
        this.description = description;
        this.sellingPrice = sellingPrice;
        this.buyingPrice = buyingPrice;
        this.availability = availability;
        this.supplier = supplier;
        this.productPurchases = productPurchases;
    }

    public Product() {
    }

    public UUID getId() {
        return id;
    }

    public Product setId(UUID id) {
        this.id = id;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Product setDescription(String description) {
        this.description = description;
        return this;
    }

    public float getSellingPrice() {
        return sellingPrice;
    }

    public Product setSellingPrice(float sellingPrice) {
        this.sellingPrice = sellingPrice;
        return this;
    }

    public float getBuyingPrice() {
        return buyingPrice;
    }

    public Product setBuyingPrice(float buyingPrice) {
        this.buyingPrice = buyingPrice;
        return this;
    }

    public Availability getAvailability() {
        return availability;
    }

    public Product setAvailability(Availability availability) {
        this.availability = availability;
        return this;
    }

    public User getSupplier() {
        return supplier;
    }

    public Product setSupplier(User supplier) {
        this.supplier = supplier;
        return this;
    }

    public Set<ProductPurchase> getProductPurchases() {
        return productPurchases;
    }

    public Product setProductPurchases(Set<ProductPurchase> productPurchases) {
        this.productPurchases = productPurchases;
        return this;
    }
}