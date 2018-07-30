package kekproject.kekproject2.services;

import kekproject.kekproject2.data.UsersRepository;
import kekproject.kekproject2.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {

    private UsersRepository repository;

    @Autowired
    public UsersServiceImpl(UsersRepository repository) {
        this.repository = repository;
        System.out.println("Users Service initialized successfully.");
    }

    @Override
    public List<User> getAllUsers() {

        return repository.getAllUsers();
    }

    @Override
    public List<User> getUsersDisplayName(String criteria) {
        return repository.getUsersDisplayName(criteria);
    }

    @Override
    public User getUserByID(int id) {
        return repository.getUserByID(id);
    }

    @Override
    public User getUserByEmail(String email) {
        return repository.getUserByEmail(email);
    }

    @Override
    public boolean registerUser(User u) {
        return repository.registerUser(u);
    }

    @Override
    public boolean updateUser(User u) {
        return repository.updateUser(u);
    }

    public UsersRepository getRepository() {
        return repository;
    }

    public void setRepository(UsersRepository repository) {
        this.repository = repository;
    }
}
