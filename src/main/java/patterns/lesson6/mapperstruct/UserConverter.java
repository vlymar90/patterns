package patterns.lesson6.mapperstruct;

import patterns.lesson6.dto.UserRequest;
import patterns.lesson6.dto.UserResponse;
import patterns.lesson6.entity.User;

public class UserConverter {

    public User entityToDto(UserRequest userRequest) {
        User user = new User();
        user.setId(userRequest.getId());
        user.setName(userRequest.getName());
        user.setLastName(userRequest.getLastName());
        user.setInfo(userRequest.getInfo());
        user.setPrivateInfo(userRequest.getPrivateInfo());
        return user;
    }

    public UserResponse dtoToEntity(User user) {
        UserResponse userResponse = new UserResponse();
        userResponse.setId(user.getId());
        userResponse.setName(user.getName());
        userResponse.setLastName(userResponse.getLastName());
        userResponse.setInfo(user.getInfo());
        return userResponse;
    }
}
