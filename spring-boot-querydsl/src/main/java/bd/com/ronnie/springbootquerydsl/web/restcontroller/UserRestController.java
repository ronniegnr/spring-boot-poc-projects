package bd.com.ronnie.springbootquerydsl.web.restcontroller;

import bd.com.ronnie.springbootquerydsl.entity.User;
import bd.com.ronnie.springbootquerydsl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UserRestController {

    private final UserService userService;

    @Autowired
    public UserRestController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("")
    public Iterable<User> getUsers() {
        return userService.getUsers();
    }

}



