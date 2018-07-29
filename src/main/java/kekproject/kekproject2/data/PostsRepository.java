package kekproject.kekproject2.data;

import kekproject.kekproject2.models.Post;

import java.util.List;

public interface PostsRepository {

    List<Post> getAll();
    Post getPostById(int postId);
    boolean addNewPost(Post p);
    boolean updatePost(Post p);
    boolean deletePost(int postId);
}
