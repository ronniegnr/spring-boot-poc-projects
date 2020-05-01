package bd.com.ronnie.springbootquerydsl.repository;

import bd.com.ronnie.springbootquerydsl.entity.User;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

import static bd.com.ronnie.springbootquerydsl.entity.QUser.user;

@Repository
public class UserRepositoryImpl implements UserRepositoryCustom {

    private final JPAQueryFactory jpaQueryFactory;

    public UserRepositoryImpl(JPAQueryFactory jpaQueryFactory) {
        this.jpaQueryFactory = jpaQueryFactory;
    }

    @Override
    public List<User> findUsersWithNamePart(String namePart) {
        return jpaQueryFactory.selectFrom(user)
                .where(user.name.containsIgnoreCase(namePart))
                .fetch();
    }

}
