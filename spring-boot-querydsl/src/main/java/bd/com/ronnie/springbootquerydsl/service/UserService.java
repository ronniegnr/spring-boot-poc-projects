package bd.com.ronnie.springbootquerydsl.service;

import bd.com.ronnie.springbootquerydsl.entity.User;
import bd.com.ronnie.springbootquerydsl.repository.UserRepository;
import bd.com.ronnie.springbootquerydsl.repository.UserRepositoryQD;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final UserRepositoryQD userRepositoryQD;

    public UserService(UserRepository userRepository, UserRepositoryQD userRepositoryQD) {
        this.userRepository = userRepository;
        this.userRepositoryQD = userRepositoryQD;
    }

    public List<User> getUsers() {
        return userRepositoryQD.getUsers();
    }

}
