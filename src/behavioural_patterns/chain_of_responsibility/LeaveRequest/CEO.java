package behavioural_patterns.chain_of_responsibility.LeaveRequest;

public class CEO extends LeaveApprover {
    private static final int MAX_DAY = 45;

    public CEO(String approverName) {
        super(approverName);
    }

    @Override
    public void processLeaveRequest(LeaveRequest request) {
        if (request.getNumberOfDays() <= MAX_DAY) {
            System.out.println(super.approverName + " (CEO) APPROVED " + request.getEmployeeName() + "'s request");
        } else if (super.nextApprove != null) {
            super.nextApprove.processLeaveRequest(request);
        } else {
            System.out.println("Leave request cannot be processed at this time.");
        }
    }
}
