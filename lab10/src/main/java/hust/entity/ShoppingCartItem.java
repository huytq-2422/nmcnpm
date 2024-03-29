package main.java.hust.entity;

public class ShoppingCartItem {

    private ProductEntity product;
    private short quantity;

    public ShoppingCartItem(ProductEntity product) {
        this.product = product;
        quantity = 1;
    }

    public ProductEntity getProduct() {
        return product;
    }

    public short getQuantity() {
        return quantity;
    }

    public void setQuantity(short quantity) {
        this.quantity = quantity;
    }

    public void incrementQuantity() {
        quantity++;
    }

    public void decrementQuantity() {
        quantity--;
    }

    public double getTotal() {
        double amount = 0;
        amount = (this.getQuantity() * product.getPrice().doubleValue());
        return amount;
    }
}
