package kekproject.kekproject2.web;

import kekproject.kekproject2.models.User;
import kekproject.kekproject2.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.sql.Date;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private UsersService service;

    @Autowired
    public UserController(UsersService service) {
        this.service = service;
    }

    @GetMapping("all")
    List<User> getAllUsers(){
        List<User> sad = service.getAllUsers();
        System.out.println(sad);
        return sad;
    }

    @GetMapping("/id/{id}")
    public User getUserByID(@PathVariable String id) {
        System.out.println("SAD: " + id);
        User u = service.getUserByID(Integer.parseInt(id));
        System.out.println("BLYAT");
        System.out.println(u);
        return u;
    }


    @PostMapping("register-user")
    public String newUser(@RequestParam String username, @RequestParam String pass){
        User u = new User();
        u.setDisplayName("sad");
        u.setPass("123asd");
        u.setEmail("wat@abv.bg");
//        u.setRegisterDate(LocalDate.now());
        if(service.registerUser(u)){
            return "redirect:/all";
        }

        return "redirect:/register";
    }

    @PutMapping("update")
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
