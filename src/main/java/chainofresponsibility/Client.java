package chainofresponsibility;

public class Client {

    public static void main(String[] args) {
        PurchaseRequest purchaseRequest = new PurchaseRequest(31000, 1);

        DepartmentApprover departmentApprover = new DepartmentApprover("Department Approver");
        CollegeApprover collegeApprover = new CollegeApprover("College Approver");
        ViceSchoolMasterApprover viceSchoolMasterApprover = new ViceSchoolMasterApprover("Vice School Master Approver");
        SchoolMasterApprover schoolMasterApprover = new SchoolMasterApprover("School Master Approver");


        // The chain must be a closed circular chain
        departmentApprover.setApprover(collegeApprover);
        collegeApprover.setApprover(viceSchoolMasterApprover);
        viceSchoolMasterApprover.setApprover(schoolMasterApprover);
        schoolMasterApprover.setApprover(departmentApprover);

        departmentApprover.processRequest(purchaseRequest);
        viceSchoolMasterApprover.processRequest(purchaseRequest);
    }

}