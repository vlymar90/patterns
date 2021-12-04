package patterns.lesson6.dto;

import java.util.Objects;
import java.util.UUID;

public class UserResponse {
    private UUID id;
    private String name;
    private String lastName;
    private String info;

    public UserResponse(UUID id, String name, String lastName, String info) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.info = info;
    }

    public UserResponse() {
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getInfo() {
        return info;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserResponse that = (UserResponse) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(lastName, that.lastName) && Objects.equals(info, that.info);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, lastName, info);
    }
}
