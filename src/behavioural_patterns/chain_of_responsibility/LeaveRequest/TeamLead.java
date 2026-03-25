package behavioural_patterns.chain_of_responsibility.LeaveRequest;

public class TeamLead extends LeaveApprover {
    private static final int MAX_DAY = 3;

    public TeamLead(String approverName) {
        super(approverName);
    }

    @Override
    public void processLeaveRequest(LeaveRequest request) {
        if (request.getNumberOfDays() <= MAX_DAY) {
            System.out.println(super.approverName + " (Team Lead) APPROVED " + request.getEmployeeName() + "'s request");
        } else if (super.nextApprove != null) {
            System.out.println(super.approverName + " (Team Lead) FORWARDING request to next approver - " + request);
            super.nextApprove.processLeaveRequest(request);
        } else {
            System.out.println("Leave request cannot be processed at this time.");
        }
    }
}
