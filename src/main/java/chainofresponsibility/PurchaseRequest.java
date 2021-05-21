package chainofresponsibility;

public class PurchaseRequest {

    private float price = 0.0f;
    private int id = 0;

    public PurchaseRequest(float price, int id) {
        this.price = price;
        this.id = id;
    }
    public float getPrice() {
        return price;
    }
    public int getId() {
        return id;
    }

}
