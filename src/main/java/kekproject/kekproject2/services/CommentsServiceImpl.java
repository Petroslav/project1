package kekproject.kekproject2.services;

import kekproject.kekproject2.data.CommentsRepository;
import kekproject.kekproject2.models.Comment;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CommentsServiceImpl implements CommentsService {

    private CommentsRepository repository;

    @Autowired
    public CommentsServiceImpl(CommentsRepository repository) {
        this.repository = repository;
        System.out.println("Comments Service initialized successfully.");
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
