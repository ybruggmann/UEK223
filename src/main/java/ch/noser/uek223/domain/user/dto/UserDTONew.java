package ch.noser.uek223.domain.user.dto;

public class UserDTONew {

    private String email;

    private String firstName;

    private String surname;

    private String password;

    public UserDTONew(String email, String firstName, String surname, String password) {
        this.email = email;
        this.firstName = firstName;
        this.surname = surname;
        this.password = password;
    }

    public UserDTONew() {
    }

    public String getEmail() {
        return email;
    }

    public UserDTONew setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public UserDTONew setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public UserDTONew setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserDTONew setPassword(String password) {
        this.password = password;
        return this;
    }
}
