package patterns.lesson6.entity;

import java.util.Objects;
import java.util.UUID;

public class User {
    private UUID id;
    private String name;
    private String lastName;
    private String info;
    private String privateInfo;

    public User(UUID id, String name, String lastName, String info, String privateInfo) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.info = info;
        this.privateInfo = privateInfo;
    }

    public User() {
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
        User user = (User) o;
        return id == user.id && Objects.equals(name, user.name) &&
                Objects.equals(lastName, user.lastName) && Objects.equals(info, user.info) &&
                Objects.equals(privateInfo, user.privateInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, lastName, info, privateInfo);
    }
}
