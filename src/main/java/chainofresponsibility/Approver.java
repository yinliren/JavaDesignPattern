package chainofresponsibility;

public abstract class Approver {

    Approver approver; // The next approver
    String name;

    public Approver(String name) {
        this.name = name;
    }

    public void setApprover(Approver approver) {
        this.approver = approver;
    }

    public abstract void processRequest(PurchaseRequest purchaseRequest);

}
