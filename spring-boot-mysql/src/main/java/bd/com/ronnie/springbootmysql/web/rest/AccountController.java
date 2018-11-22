package bd.com.ronnie.springbootmysql.web.rest;

import bd.com.ronnie.springbootmysql.domain.Account;
import bd.com.ronnie.springbootmysql.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/accounts")
public class AccountController {

    private final AccountRepository accountRepository;

    @Autowired
    public AccountController(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @RequestMapping("")
    public Iterable<Account> findAll() {
        return accountRepository.findAll();
    }

}
