package ch.noser.uek223.domain.role;

import ch.noser.uek223.domain.role.dtoforrole.RoleDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RoleMapper {

    RoleDTO roleTORoleDTO(Role role);
}
