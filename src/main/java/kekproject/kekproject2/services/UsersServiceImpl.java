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
    public User getUserByID(int id) {
        return null;
    }

    @Override
    public User getUserByEmail(String email) {
        return null;
    }

    @Override
    public boolean registerUser(User u) {
        return false;
    }

    @Override
    public boolean UpdateUser(User u) {
        return false;
    }

    public UsersRepository getRepository() {
        return repository;
    }

    public void setRepository(UsersRepository repository) {
        this.repository = repository;
    }
}
