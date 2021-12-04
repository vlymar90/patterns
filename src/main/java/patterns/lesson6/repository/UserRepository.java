package patterns.lesson6.repository;

import patterns.lesson6.entity.User;

import java.util.List;
import java.util.UUID;

public interface UserRepository {
    List<User> getAll();

    User getById(UUID id);

    void save(User user);

    boolean remove(UUID id);
}
