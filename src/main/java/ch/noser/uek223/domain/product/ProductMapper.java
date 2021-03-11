package ch.noser.uek223.domain.product;

import ch.noser.uek223.domain.product.dto.*;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    ProductDTOByCustomer productToProductDTOCustomer(Product product);

    ProductDTOBYSupplier productToProductDTOSupplier(Product product);

    ProductDTO productToProductDTOAdmin(Product product);
}
