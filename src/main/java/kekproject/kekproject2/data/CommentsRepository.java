package kekproject.kekproject2.data;

import kekproject.kekproject2.models.Comment;

import java.util.List;

public interface CommentsRepository {

    List<Comment> getAll();
    List<Comment> getUserComments(int authorId);
    Comment getCommentById(int commentId);
    boolean saveComment(Comment c);
    boolean updateComment(Comment c);
    boolean deleteComment(Comment c);
}
