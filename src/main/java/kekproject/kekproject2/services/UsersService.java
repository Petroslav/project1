package kekproject.kekproject2.services;

import kekproject.kekproject2.models.User;

import java.util.List;

public interface UsersService {

    List<User> getAllUsers();
    List<User> getUsersDisplayName(String criteria);
    User getUserByID(int id);
    User getUserByEmail(String email);
    boolean registerUser(User u);
    boolean updateUser(User u);
}
