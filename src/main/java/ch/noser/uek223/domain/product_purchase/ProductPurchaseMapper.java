package ch.noser.uek223.domain.product_purchase;

import ch.noser.uek223.domain.product_purchase.dto.ProductPurchaseDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductPurchaseMapper {

    ProductPurchaseDTO productPurchaseToProductPurchaseDTo(ProductPurchase productPurchase);
}
