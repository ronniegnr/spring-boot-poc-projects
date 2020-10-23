package bd.com.ronnie.springbootrabbitmqconsumer.model;

import java.math.BigDecimal;
import java.time.Instant;

public class Order {

    private String id;
    private String customerName;
    private String customerPhone;
    private BigDecimal amount;
    private Instant orderPlaceTime;

    public Order() {
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
