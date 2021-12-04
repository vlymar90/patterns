package patterns.lesson6.cache;

import patterns.lesson6.entity.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class Cache {
    private List<User> users;

    public Cache() {
        users = new ArrayList<>();
    }

    public void add(User user) {
        users.add(user);
    }

    public Optional<User> get(UUID id) {
        return users.stream().filter(user -> user.getId().equals(id)).findFirst();
    }

    public void remove(UUID id) {
        users.removeIf(it -> it.getId().equals(id));
    }
}
