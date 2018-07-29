package kekproject.kekproject2.services;

import kekproject.kekproject2.data.PostsRepository;
import kekproject.kekproject2.models.Post;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PostsServiceImpl implements PostsService {
    private PostsRepository repository;

    @Autowired
    public PostsServiceImpl(PostsRepository repository) {
        this.repository = repository;
        System.out.println("Posts Service initialized successfully.");
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
}
