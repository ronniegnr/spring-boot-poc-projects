package bd.com.ronnie.springbootrabbitmq.service;

import bd.com.ronnie.springbootrabbitmq.model.Order;
import com.github.javafaker.Faker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Random;

@Service
public class OrderService {

    private final Logger logger = LoggerFactory.getLogger(OrderService.class);

    private final Source source;

    @Autowired
    public OrderService(Source source) {
        this.source = source;
    }

    @Scheduled(fixedRate = 500)
    public void generateRandomOrder() {
        int randomNumber = new Random().nextInt(2);
        if (randomNumber == 1) {
            Order order = getSingleDummyOrder();
            source.output().send(MessageBuilder.withPayload(order).build());
            logger.info("Order created with id: " + order.getId());
        }

    }

    private Order getSingleDummyOrder() {
        Faker faker = new Faker();
        String name = faker.name().fullName();
        String phone = faker.phoneNumber().cellPhone();
        BigDecimal amount = new BigDecimal(faker.number().numberBetween(100, 1000));
        return new Order(name, phone, amount);
    }

}
