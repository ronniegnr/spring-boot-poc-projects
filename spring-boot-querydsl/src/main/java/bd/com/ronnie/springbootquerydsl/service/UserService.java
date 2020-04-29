package bd.com.ronnie.springbootquerydsl.service;

import bd.com.ronnie.springbootquerydsl.entity.User;
import bd.com.ronnie.springbootquerydsl.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getUsers() {
        /*  we are just converting iterator to a list here
            but do some service magic here  */
        List<User> users = new ArrayList<>();
        userRepository.findAll()
                .forEach(users::add);
        return users;
    }

}
