package ch.noser.uek223.domain.product;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    List<Product> findAll(Optional<Boolean> showArchived, Optional<Boolean> showOutOfStock);

    List<Product> findAllAvailable();

    List<Product> findAllArchived();

    List<Product> findAllOutOfStock();

    Optional<Product> findById(String id);

    Product save(Product product);

    Product update(String id, Product changes);

    List<Product> findAllBetweenPrice(double lower, double upper,
                                      Optional<Boolean> showArchived,
                                      Optional<Boolean> showOutOfStock);

    Product archiveById(String id);
}
