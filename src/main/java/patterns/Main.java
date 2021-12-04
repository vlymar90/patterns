package patterns;

import patterns.lesson6.cache.Cache;
import patterns.lesson6.mapperstruct.UserConverter;
import patterns.lesson6.repository.UserRepository;
import patterns.lesson6.repository.impl.UserRepositoryImpl;
import patterns.lesson6.service.UserService;

public class Main {
    public static void main(String[] args) {
        start();
    }

    public static void start() {
        UserConverter userConverter = new UserConverter();
        Cache cache = new Cache();
        UserRepository userRepository = new UserRepositoryImpl(cache);
        new UserService(userRepository, userConverter);
    }
}
