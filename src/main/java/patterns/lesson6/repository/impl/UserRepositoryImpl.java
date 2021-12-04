package patterns.lesson6.repository.impl;

import patterns.lesson6.cache.Cache;
import patterns.lesson6.entity.User;
import patterns.lesson6.repository.UserRepository;

import java.util.*;

public class UserRepositoryImpl implements UserRepository {
    private Cache cache;
    private List<User> userRepo;

    public UserRepositoryImpl(Cache cache) {
        this.cache = cache;
        userRepo = List.of(new User(UUID.randomUUID(), "Oleg", "Ivanov", "Hello", "private"),
                new User(UUID.randomUUID(), "Olga", "Petrova", "Bay", "private"),
                new User(UUID.randomUUID(), "Ivan", "Dolgov", "Ok", "private"));
    }

    @Override
    public List<User> getAll() {
        return userRepo;
    }

    @Override
    public User getById(UUID id) {
        Optional<User> optional = cache.get(id);
        
        if (optional.isEmpty()) {
            optional = userRepo.stream()
                    .filter(user -> user.getId().equals(id)).findFirst();
        }
        if (optional.isEmpty()) {
            return null;
        }
        return optional.get();
    }

    @Override
    public void save(User user) {
        if (user == null) {
            throw new IllegalArgumentException();
        }
        userRepo.add(user);
    }

    @Override
    public boolean remove(UUID id) {
        boolean isRemove = userRepo.removeIf(it -> it.getId().equals(id));
        if (isRemove) {
            cache.remove(id);
        }
        return isRemove;
    }
}
