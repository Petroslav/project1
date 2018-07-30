package kekproject.kekproject2.web;

import kekproject.kekproject2.services.CommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/comments")
public class CommentController {

    private CommentsService service;

    @Autowired
    public CommentController(CommentsService service) {
        this.service = service;
    }
}
