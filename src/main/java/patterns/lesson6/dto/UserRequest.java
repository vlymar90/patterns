package patterns.lesson6.dto;

import java.util.Objects;
import java.util.UUID;

public class UserRequest {
    private UUID id;
    private String name;
    private String lastName;
    private String info;
    private String privateInfo;

    public UserRequest(UUID id, String name, String lastName, String info, String privateInfo) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.info = info;
        this.privateInfo = privateInfo;
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

    public String getPrivateInfo() {
        return privateInfo;
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

    public void setPrivateInfo(String privateInfo) {
        this.privateInfo = privateInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserRequest that = (UserRequest) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(lastName, that.lastName) && Objects.equals(info, that.info) && Objects.equals(privateInfo, that.privateInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, lastName, info, privateInfo);
    }
}
