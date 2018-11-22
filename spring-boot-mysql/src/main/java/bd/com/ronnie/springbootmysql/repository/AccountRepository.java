package bd.com.ronnie.springbootmysql.repository;

import bd.com.ronnie.springbootmysql.domain.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends CrudRepository<Account, Long> {
}
