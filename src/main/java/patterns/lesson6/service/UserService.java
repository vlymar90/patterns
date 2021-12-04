package patterns.lesson6.service;

import patterns.lesson6.dto.UserRequest;
import patterns.lesson6.dto.UserResponse;
import patterns.lesson6.entity.User;
import patterns.lesson6.mapperstruct.UserConverter;
import patterns.lesson6.repository.UserRepository;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class UserService {
    private UserRepository userRepository;
    private UserConverter userConverter;

    public UserService(UserRepository userRepository, UserConverter userConverter) {
        this.userRepository = userRepository;
        this.userConverter = userConverter;
    }

    public UserResponse getUser(UUID id) {
        return userConverter.dtoToEntity(userRepository.getById(id));
    }

    public List<UserResponse> getAllUsers() {
        return userRepository.getAll().stream()
                .map(it -> userConverter.dtoToEntity(it)).collect(Collectors.toList());
    }

    public boolean removeUser(UUID id) {
        return userRepository.remove(id);
    }

    public void saveUser(UserRequest user) {
        userRepository.save(userConverter.entityToDto(user));
    }
}
