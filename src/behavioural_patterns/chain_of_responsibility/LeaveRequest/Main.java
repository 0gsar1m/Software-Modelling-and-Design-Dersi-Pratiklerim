package behavioural_patterns.chain_of_responsibility.LeaveRequest;

public class Main {
    static void main() {
        LeaveRequest request = new LeaveRequest("Emir",17,"asd");

        LeaveApprover tl = new TeamLead("TeamLead(Ayse)");
        LeaveApprover mng = new Manager("Manager(Fatma)");
        LeaveApprover ceo = new CEO("CEO(Burhan)");

        tl.setNextApprover(mng);

        mng.setNextApprover(ceo);

        // tl --> mng --> ceo

        tl.processLeaveRequest(request);

    }
}
