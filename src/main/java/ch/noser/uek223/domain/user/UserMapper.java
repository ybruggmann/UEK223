package ch.noser.uek223.domain.user;

import ch.noser.uek223.domain.user.dto.*;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDTOCustomer userToUserDTOCustomer(User user);
    UserDTOSupplier userToUserDTOSupplier(User user);
    UserDTOAdmin userToUserDTOAdmin(User user);
    User userDTONewToBo(UserDTONew userDTONew);
    UserDTO toDTO(User user);
}
