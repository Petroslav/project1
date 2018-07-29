package kekproject.kekproject2.data;

import kekproject.kekproject2.models.Post;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PostsRepositoryImpl implements PostsRepository {

    private SessionFactory session;

    @Autowired
    public PostsRepositoryImpl(SessionFactory session) {
        this.session = session;
        System.out.println("Posts repository initialized successfully.");
    }

    @Override
    public List<Post> getAll() {
        return null;
    }

    @Override
    public Post getPostById(int postId) {
        return null;
    }

    @Override
    public boolean addNewPost(Post p) {
        return false;
    }

    @Override
    public boolean updatePost(Post p) {
        return false;
    }

    @Override
    public boolean deletePost(int postId) {
        return false;
    }

    public SessionFactory getSession() {
        return session;
    }

    public void setSession(SessionFactory session) {
        this.session = session;
    }
}
