package ro.itschool.shopApp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "Order")
public class Order {
    @Id
    @GeneratedValue
    Integer orederId;
    Integer productId;
    Integer quantity;
    double price;
    Status status;

    public Order(Integer productId, Integer quantity, double price, Status status) {
        this.productId = productId;
        this.quantity = quantity;
        this.price = price;
        this.status = status;
    }

    public Order() {

    }

    public Integer getOrederId() {
        return orederId;
    }

    public void setOrederId(Integer orederId) {
        this.orederId = orederId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Double.compare(order.price, price) == 0 &&
                orederId.equals(order.orederId) &&
                productId.equals(order.productId) &&
                quantity.equals(order.quantity) &&
                status == order.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(orederId, productId, quantity, price, status);
    }

    @Override
    public String toString() {
        return "Order{" +
                "orederId=" + orederId +
                ", productId=" + productId +
                ", quantity=" + quantity +
                ", price=" + price +
                ", status=" + status +
                '}';
    }
}
