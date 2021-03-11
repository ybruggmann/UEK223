package ch.noser.uek223.domain.user.dto;

import ch.noser.uek223.domain.role.Role;

import java.util.Set;
import java.util.UUID;

public class UserDTOCustomer {

    private UUID id;

    private String email;

    private Set<Role> roles;

    public UserDTOCustomer(UUID id, String email, Set<Role> roles) {
        this.id = id;
        this.email = email;
        this.roles = roles;
    }

    public UserDTOCustomer() {
    }

    public UUID getId() {
        return id;
    }

    public UserDTOCustomer setId(UUID id) {
        this.id = id;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserDTOCustomer setEmail(String email) {
        this.email = email;
        return this;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public UserDTOCustomer setRoles(Set<Role> roles) {
        this.roles = roles;
        return this;
    }
}
