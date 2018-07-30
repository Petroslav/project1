package kekproject.kekproject2.services;

import kekproject.kekproject2.models.Post;

import java.util.List;

public interface PostsService {

    List<Post> getAll();
    List<Post> getAllFromCategory(int categoryId);
    Post getPostById(int postId);
    boolean addNewPost(Post p);
    boolean updatePost(Post p);
    boolean deletePost(Post p);
}
