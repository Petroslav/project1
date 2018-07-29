package kekproject.kekproject2.web;

import kekproject.kekproject2.models.User;
import kekproject.kekproject2.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

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

    @GetMapping("/{id}")
    public User getUserByID(@PathVariable("id") String strid) {
        return null;
    }

    @GetMapping("/{email}")
    public User getUserByEmail(String email) {
        return null;
    }

    @PutMapping("/register")
    public boolean createUser(@RequestBody User user) {
        return true;
    }

    @PutMapping("/update")
    public boolean updateUser(User u) {
        return false;
    }

    public UsersService getService() {
        return service;
    }

    public void setService(UsersService service) {
        this.service = service;
    }
}
