package kekproject.kekproject2.services;

import kekproject.kekproject2.data.PostsRepository;
import kekproject.kekproject2.models.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostsServiceImpl implements PostsService {
    private PostsRepository repository;

    @Autowired
    public PostsServiceImpl(PostsRepository repository) {
        this.repository = repository;
        System.out.println("Posts Service initialized successfully.");
    }

    @Override
    public List<Post> getAll() {
        return repository.getAll();
    }

    @Override
    public List<Post> getAllFromCategory(int categoryId) {
        return repository.getAllFromCategory(categoryId);
    }

    @Override
    public Post getPostById(int postId) {
        return repository.getPostById(postId);
    }

    @Override
    public boolean addNewPost(Post p) {
        return repository.addNewPost(p);
    }

    @Override
    public boolean updatePost(Post p) {
        return repository.updatePost(p);
    }

    @Override
    public boolean deletePost(Post p) {
        return repository.deletePost(p);
    }
}
