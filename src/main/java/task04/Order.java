package task04;

public class Order {
    int customerId;
    int payment;
    int change;

    public Order(int customerId, int payment, int change) {
        this.customerId = customerId;
        this.payment = payment;
        this.change = change;
    }
    public int getRecivedAmount() {
        return payment - change;
    }
}
