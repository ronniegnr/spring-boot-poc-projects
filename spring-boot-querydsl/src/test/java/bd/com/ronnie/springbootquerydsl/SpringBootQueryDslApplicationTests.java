package bd.com.ronnie.springbootquerydsl;

import bd.com.ronnie.springbootquerydsl.entity.User;
import bd.com.ronnie.springbootquerydsl.repository.UserRepository;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.Instant;
import java.util.List;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootQueryDslApplicationTests {

    @Autowired
    private UserRepository userRepository;

    @After
    public void tearDown() throws Exception {
        userRepository.deleteAllInBatch();
    }

    @Test
    public void queryDslTest() {
        User user = User.newObjectWithDefaults();
        user.setName("ronnie");
        user.setEmail("ronnie@email.com");
        user.setPassword("password");
        user.setPhone("0123456789");
        user.setCreatedAt(Instant.now());
        user.setCreatedBy("ronnie");
        userRepository.save(user);

        List<User> users = userRepository.findUsersWithNamePart("onn");

        assertThat(users.size(), greaterThan(0));
        assertThat(users.get(0).getEmail(), is("ronnie@email.com"));
    }


}
