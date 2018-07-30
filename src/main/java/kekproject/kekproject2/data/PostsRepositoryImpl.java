package kekproject.kekproject2.data;

import kekproject.kekproject2.models.Post;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PostsRepositoryImpl implements PostsRepository {

    private SessionFactory session;

    @Autowired
    public PostsRepositoryImpl(SessionFactory session) {
        this.session = session;
        System.out.println("Posts repository initialized successfully.");
    }

    @Override
    public List<Post> getAll() {
        List<Post> posts = new ArrayList<>();
        try(Session s = session.openSession()){
            s.beginTransaction();
            posts = s.createQuery("FROM Post", Post.class).list();
            s.getTransaction().commit();
            System.out.println("Posts retrieved successfully.");
        }catch(Exception e){
            System.out.print(e.getMessage());
            e.printStackTrace();
        }
        return posts;
    }

    @Override
    public List<Post> getAllFromCategory(int categoryId) {
        List<Post> posts = new ArrayList<>();
        try(Session s = session.openSession()){
            s.beginTransaction();
            posts = s.createQuery("FROM Post WHERE category = " + categoryId, Post.class).list();
            s.getTransaction().commit();
            System.out.println("Posts from category retrieved successfully.");
        }catch(Exception e){
            System.out.print(e.getMessage());
            e.printStackTrace();
        }
        return posts;
    }

    @Override
    public Post getPostById(int postId) {
        Post p = null;
        try(Session s = session.openSession()){
            s.beginTransaction();
            p = s.get(Post.class, postId);
            s.getTransaction().commit();
            System.out.println("Post retrieved successfully.");
        }catch(Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return p;
    }

    @Override
    public boolean addNewPost(Post p) {
        try(Session s = session.openSession()){
            s.beginTransaction();
            s.save(p);
            s.getTransaction().commit();
            System.out.println("Post saved successfully.");
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
            return false;
        }

    }

    @Override
    public boolean updatePost(Post p) {
        try(Session s = session.openSession()){
            s.beginTransaction();
            s.update(p);
            s.getTransaction().commit();
            System.out.println("Post updated successfully.");
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
            return false;
        }

    }

    @Override
    public boolean deletePost(Post p) {
        try(Session s = session.openSession()){
            s.beginTransaction();
            s.delete(p);
            s.getTransaction().commit();
            System.out.println("Post deleted successfully.");
            return true;
        }catch(Exception e){
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
