
package entities;

public class OrderItem {
    
    private Integer quantity;
    private Double price;
    
    private Product product;
    
    public OrderItem() {}
    
    public OrderItem(int quantity, double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }
    
    public int getQuantity() {
        return this.quantity;
    }
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public double getPrice() {
        return this.price;
    }
    
    public void setPrice(){
        this.price = price;
    }
    
    public double subTotal() {
        return this.price * this.quantity;
    }
    
    public String toString() {
        return this.product + ", Quantity: " + this.getQuantity() + ", Subtotal: $" + this.subTotal() + "\n";
    }
}
