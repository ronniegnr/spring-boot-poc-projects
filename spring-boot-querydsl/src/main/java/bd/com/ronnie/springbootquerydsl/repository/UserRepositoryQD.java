package bd.com.ronnie.springbootquerydsl.repository;

import bd.com.ronnie.springbootquerydsl.entity.QUser;
import bd.com.ronnie.springbootquerydsl.entity.User;
import com.querydsl.jpa.impl.JPAQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserRepositoryQD {

    @PersistenceContext
    private final EntityManager entityManager;

    private final UserRepository userRepository;

    @Autowired
    public UserRepositoryQD(EntityManager entityManager, UserRepository userRepository) {
        this.entityManager = entityManager;
        this.userRepository = userRepository;
    }

    public List<User> getUsers() {
        JPAQuery<User> query = new JPAQuery<>(entityManager);
        QUser user = QUser.user;
        return query.from(user).fetch();
    }

}
