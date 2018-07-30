package kekproject.kekproject2.web;

import kekproject.kekproject2.models.User;
import kekproject.kekproject2.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
        return service.getUserByID(Integer.parseInt(strid));
    }

    @GetMapping("/{email}")
    public User getUserByEmail(@PathVariable("email") String email) {
        return service.getUserByEmail(email);
    }

    @PutMapping("/register")
    public boolean createUser(@RequestBody User user) {
        return service.registerUser(user);
    }

    @PutMapping("/update")
    public boolean updateUser(User u) {
        return service.updateUser(u);
    }

    public UsersService getService() {
        return service;
    }

    public void setService(UsersService service) {
        this.service = service;
    }
}
