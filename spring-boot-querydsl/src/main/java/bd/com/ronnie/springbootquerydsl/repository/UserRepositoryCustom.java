package bd.com.ronnie.springbootquerydsl.repository;

import bd.com.ronnie.springbootquerydsl.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepositoryCustom {

    List<User> findUsersWithNamePart(String namePart);

}
