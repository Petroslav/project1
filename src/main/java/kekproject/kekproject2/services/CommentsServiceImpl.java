package kekproject.kekproject2.services;

import kekproject.kekproject2.data.CommentsRepository;
import kekproject.kekproject2.models.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentsServiceImpl implements CommentsService {

    private CommentsRepository repository;

    @Autowired
    public CommentsServiceImpl(CommentsRepository repository) {
        this.repository = repository;
        System.out.println("Comments Service initialized successfully.");
    }

    @Override
    public List<Comment> getAll() {
        return repository.getAll();
    }

    @Override
    public List<Comment> getUserComments(int authorId) {
        return repository.getUserComments(authorId);
    }

    @Override
    public Comment getCommentById(int commentId) {
        return repository.getCommentById(commentId);
    }

    @Override
    public boolean saveComment(Comment c) {
        return repository.saveComment(c);
    }

    @Override
    public boolean updateComment(Comment c) {
        return repository.updateComment(c);
    }

    @Override
    public boolean deleteComment(Comment c) {
        return repository.deleteComment(c);
    }
}
