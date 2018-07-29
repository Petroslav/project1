package kekproject.kekproject2.services;

import kekproject.kekproject2.models.User;

import java.util.List;

public interface UsersService {

    List<User> getAllUsers();
    User getUserByID(int id);
    User getUserByEmail(String email);
    boolean registerUser(User u);
    boolean UpdateUser(User u);
}
