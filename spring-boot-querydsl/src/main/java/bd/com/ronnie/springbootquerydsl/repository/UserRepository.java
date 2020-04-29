package bd.com.ronnie.springbootquerydsl.repository;

import bd.com.ronnie.springbootquerydsl.entity.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends PagingAndSortingRepository<User, Long> {

}
