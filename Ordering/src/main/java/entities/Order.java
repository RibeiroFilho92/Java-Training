
package entities;

import entities.enums.OrderStatus;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    
    public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    public static SimpleDateFormat sdf_ = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    
    private Date moment;
    private OrderStatus status;
    
    private List<OrderItem> orderItems = new ArrayList<>();
    private Client client;
    
    public Order() {}
    
    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }
    
    public Date getMoment() {
        return this.moment;
    }
    
    public void setMoment(Date moment) {
        this.moment = moment;
    }
    
    public OrderStatus getStatus() {
        return this.status;
    }
    
    public void setStatus(OrderStatus status) {
        this.status = status;
    }
    
    public List<OrderItem> getOrderItems()  {
        return orderItems;
    }
    
    public void addItem(OrderItem item) {
        orderItems.add(item);
    }
    
    public void removeItem(OrderItem item) {
        orderItems.remove(item);
    }
    
    public double total() {
        double sum = 0;
        for (OrderItem item : orderItems) {
            sum += item.getPrice() * item.getQuantity();
        }
        return sum;
    }
    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ORDER SUMARY" + "\n" + "Order moment: ");
        sb.append(sdf_.format(getMoment()));
        sb.append("\n" + "Order status: " + getStatus() + "\n" + "Client: ");
        sb.append(client);
        sb.append("\n Order item: \n");
        sb.append(orderItems);
        return sb.toString();
    }
}
