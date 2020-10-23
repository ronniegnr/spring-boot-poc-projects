package bd.com.ronnie.springbootrabbitmqconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;

@SpringBootApplication
public class SpringbootrabbitmqconsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootrabbitmqconsumerApplication.class, args);
    }

}
