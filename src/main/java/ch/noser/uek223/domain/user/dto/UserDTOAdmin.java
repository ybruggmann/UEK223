package ch.noser.uek223.domain.user.dto;

import ch.noser.uek223.domain.role.dtoforrole.RoleDTO;

import java.util.Set;
import java.util.UUID;

public class UserDTOAdmin {

    private UUID id;

    private String email;

    private String firstName;

    private String surname;

    private String password;

    private Set<RoleDTO> roles;

    /* private Set<PurchaseDTOAdmin> purchases;

     private Set<ProductDTO> products;
 */
    public UserDTOAdmin(UUID id, String email, String firstName, String surname, String password, Set<RoleDTO> roles/*, Set<PurchaseDTOAdmin> purchases, Set<ProductDTO> products*/) {
        this.id = id;
        this.email = email;
        this.firstName = firstName;
        this.surname = surname;
        this.password = password;
        this.roles = roles;
       /* this.purchases = purchases;
        this.products = products;
        */
    }

    public UserDTOAdmin() {
    }

    public UUID getId() {
        return id;
    }

    public UserDTOAdmin setId(UUID id) {
        this.id = id;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserDTOAdmin setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public UserDTOAdmin setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public UserDTOAdmin setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserDTOAdmin setPassword(String password) {
        this.password = password;
        return this;
    }

    public Set<RoleDTO> getRoles() {
        return roles;
    }

    public UserDTOAdmin setRoles(Set<RoleDTO> roles) {
        this.roles = roles;
        return this;
    }
/*
    public Set<PurchaseDTOAdmin> getPurchases() {
        return purchases;
    }

    public UserDTOAdmin setPurchases(Set<PurchaseDTOAdmin> purchases) {
        this.purchases = purchases;
        return this;
    }

    public Set<ProductDTO> getProducts() {
        return products;
    }

    public UserDTOAdmin setProducts(Set<ProductDTO> products) {
        this.products = products;
        return this;
    }
 */
}
