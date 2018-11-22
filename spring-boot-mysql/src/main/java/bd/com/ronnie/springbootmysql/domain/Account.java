package bd.com.ronnie.springbootmysql.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "account")
@Data
public class Account {

    @Id
    private long id;

    private String userName;

    private String password;

}
