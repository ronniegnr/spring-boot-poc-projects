package bd.com.ronnie.springbootrabbitmq.model;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

public class Order {

    private String id;
    private String customerName;
    private String customerPhone;
    private BigDecimal amount;
    private Instant orderPlaceTime;

    public Order(String customerName, String customerPhone, BigDecimal amount) {
        this.id = UUID.randomUUID().toString();
        this.customerName = customerName;
        this.customerPhone = customerPhone;
        this.amount = amount;
        this.orderPlaceTime = Instant.now();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Instant getOrderPlaceTime() {
        return orderPlaceTime;
    }

    public void setOrderPlaceTime(Instant orderPlaceTime) {
        this.orderPlaceTime = orderPlaceTime;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", customerName='" + customerName + '\'' +
                ", customerPhone='" + customerPhone + '\'' +
                ", amount=" + amount +
                ", orderPlaceTime=" + orderPlaceTime +
                '}';
    }
}
