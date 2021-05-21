package chainofresponsibility;

public class ViceSchoolMasterApprover extends Approver {

    public ViceSchoolMasterApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if(purchaseRequest.getPrice() < 10000 && purchaseRequest.getPrice() <= 30000) {
            System.out.println("Request ID: " + purchaseRequest.getId() + "; Handled by " + this.name);
        }else {
            approver.processRequest(purchaseRequest);
        }
    }
}
