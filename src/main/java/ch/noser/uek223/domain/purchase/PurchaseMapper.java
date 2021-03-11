package ch.noser.uek223.domain.purchase;

import ch.noser.uek223.domain.purchase.dto.PurchaseDTOAdmin;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PurchaseMapper {

    PurchaseDTOAdmin purchaseToPurchaseDTO(Purchase purchase);
}
