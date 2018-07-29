package kekproject.kekproject2.web;

import kekproject.kekproject2.models.User;
import kekproject.kekproject2.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/users")
public class UserController {

    private UsersService service;

    @Autowired
    public UserController(UsersService service) {
        this.service = service;
    }

    @GetMapping("/all")
    List<User> getAllUsers(){
        return service.getAllUsers();
    }

    public UsersService getService() {
        return service;
    }

    public void setService(UsersService service) {
        this.service = service;
    }
}
