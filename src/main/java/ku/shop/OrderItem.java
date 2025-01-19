package ku.shop;

public class OrderItem {
    private int quantity;
    private Product prod;

    public OrderItem(Product prod, int quantity) {
        this.prod = prod;
        this.quantity = quantity;
        checkStock(); // เช็คสต็อกในที่นี้
    }

    public double getSubtotal() {
        return prod.getPrice() * quantity;
    }

    private void checkStock() {
        if (prod.getStock() < quantity) {
            throw new OutOfStockException("Not enough stock for product: " + prod.getName());
        }
    }
}
