package kekproject.kekproject2.data;

import kekproject.kekproject2.models.Comment;
import org.hibernate.SessionFactory;

import java.util.List;

public class CommentsRepositoryImpl implements CommentsRepository {

    private SessionFactory session;

    public CommentsRepositoryImpl(SessionFactory session) {
        this.session = session;
        System.out.println("Comments Repository initialized successfully.");
    }

    @Override
    public List<Comment> getAll() {
        return null;
    }

    @Override
    public List<Comment> getUserComments(int authorId) {
        return null;
    }

    @Override
    public Comment getCommentById(int commentId) {
        return null;
    }

    @Override
    public boolean saveComment(Comment c) {
        return false;
    }

    @Override
    public boolean updateComment(Comment c) {
        return false;
    }

    @Override
    public boolean deleteComment(int commentId) {
        return false;
    }
}
