package bd.com.ronnie.springbootrabbitmqconsumer.service;

import bd.com.ronnie.springbootrabbitmqconsumer.model.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

@EnableBinding(Sink.class)
public class OrderConsumer {

    private Logger logger = LoggerFactory.getLogger(OrderConsumer.class);

    @StreamListener(target = Sink.INPUT)
    public void printOrder(Order order) {
        logger.info("Received order id: " + order);
    }

}
