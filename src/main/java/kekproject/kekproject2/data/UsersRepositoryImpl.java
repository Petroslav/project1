package kekproject.kekproject2.data;

import kekproject.kekproject2.models.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsersRepositoryImpl implements UsersRepository {

    private SessionFactory session;

    @Autowired
    public UsersRepositoryImpl(SessionFactory session) {
        this.session = session;
        System.out.println("Users Repository initialized successfully.");
    }

    @Override
    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        Session s = null;
        try{
            s = session.openSession();
            s.beginTransaction();
            Query query = s.createQuery("FROM User");
            users = query.list();
            s.getTransaction().commit();
            System.out.println("Users retrieved successfully.");
        }catch(Exception e){
            System.out.print(e.getMessage());
            e.printStackTrace();
        }
        return users;
    }

    @Override
    public List<User> getUsersDisplayName(String criteria) {
        List<User> matches = new ArrayList<>();
        Session s = null;
        try{
            s = session.openSession();
            s.beginTransaction();
            matches = s.createQuery("FROM User WHERE displayName LIKE %" + criteria + "%").list();
            s.getTransaction().commit();
            System.out.println("Display names retrieved successfully.");
        }catch(Exception e){
            System.out.print(e.getMessage());
            e.printStackTrace();
        }
        return matches;
    }

    @Override
    public User getUserByID(int id) {
        User user = null;
        Session s = null;
        try{
            s = session.openSession();
            s.beginTransaction();
            user = (User) s.get(User.class, id);
            s.getTransaction().commit();
        }catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public boolean registerUser(User u) {
        Session s = null;
        try{
            s = session.openSession();
            s.beginTransaction();
            s.save(u);
            s.getTransaction().commit();
            return true;
        }catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean updateUser(User u) {
        Session s = null;
        try{
            s = session.openSession();
            s.beginTransaction();
            s.update(u);
            s.getTransaction().commit();
            return true;
        }catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
            return false;
        }
    }

    public SessionFactory getSession() {
        return session;
    }

    public void setSession(SessionFactory session) {
        this.session = session;
    }
}
