package chainofresponsibility;

public class DepartmentApprover extends Approver {


    public DepartmentApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if(purchaseRequest.getPrice() <= 5000) {
            System.out.println("Request ID: " + purchaseRequest.getId() + "; Handled by " + this.name);
        }else {
            approver.processRequest(purchaseRequest);
        }
    }

}
