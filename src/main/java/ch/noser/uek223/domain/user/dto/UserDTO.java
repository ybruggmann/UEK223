package ch.noser.uek223.domain.user.dto;

import ch.noser.uek223.domain.role.dtoforrole.RoleDTO;

import java.util.Set;
import java.util.UUID;

public class UserDTO {

    private UUID id;

    private String email;

    private String firstName;

    private String surname;

    private String password;

    private Set<RoleDTO> roles;


    public UserDTO(UUID id, String email, String firstName, String surname, String password, Set<RoleDTO> roles) {
        this.id = id;
        this.email = email;
        this.firstName = firstName;
        this.surname = surname;
        this.password = password;
        this.roles = roles;
    }

    public UserDTO() {
    }

    public UserDTO(UUID id) {
    }

    public UUID getId() {
        return id;
    }

    public UserDTO setId(UUID id) {
        this.id = id;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserDTO setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserDTO setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public UserDTO setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public UserDTO setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public Set<RoleDTO> getRoles() {
        return roles;
    }

    public UserDTO setRoles(Set<RoleDTO> roles) {
        this.roles = roles;
        return this;
    }
}
