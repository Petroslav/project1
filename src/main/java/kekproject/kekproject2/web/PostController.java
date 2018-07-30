package kekproject.kekproject2.web;


import kekproject.kekproject2.services.PostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/posts")
public class PostController {

    private PostsService service;

    @Autowired
    public PostController(PostsService service) {
        this.service = service;
    }
}
