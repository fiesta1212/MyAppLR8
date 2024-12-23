package ru.soloboev.MyAppLR8.service;

import ru.soloboev.MyAppLR8.dto.UserDto;
import ru.soloboev.MyAppLR8.entity.User;

import java.util.List;

public interface UserService {

    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}
