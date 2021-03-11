package ch.noser.uek223.domain.user.dto;

import ch.noser.uek223.domain.role.dtoforrole.RoleDTO;

import java.util.Set;
import java.util.UUID;

public class UserDTOSupplier {

    private UUID id;

    private String email;

    private String password;

    private Set<RoleDTO> roles;

    public UserDTOSupplier(UUID id, String email, String password, Set<RoleDTO> roles) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.roles = roles;
    }

    public UserDTOSupplier() {
    }

    public UUID getId() {
        return id;
    }

    public UserDTOSupplier setId(UUID id) {
        this.id = id;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserDTOSupplier setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserDTOSupplier setPassword(String password) {
        this.password = password;
        return this;
    }

    public Set<RoleDTO> getRoles() {
        return roles;
    }

    public UserDTOSupplier setRoles(Set<RoleDTO> roles) {
        this.roles = roles;
        return this;
    }
}
