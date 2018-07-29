package kekproject.kekproject2.data;

import kekproject.kekproject2.models.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UsersRepositoryImpl implements UsersRepository {

    SessionFactory session;

    @Autowired
    public UsersRepositoryImpl(SessionFactory session) {
        this.session = session;
        System.out.println("Users Repository initialized successfully.");
    }

    @Override
    public List<User> getAllUsers() {
        return null;
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
}
