package behavioural_patterns.chain_of_responsibility.LeaveRequest;

public abstract class LeaveApprover {
    protected LeaveApprover nextApprove;
    protected String approverName;

    public LeaveApprover(String approverName){
        this.approverName = approverName;
    }

    public void setNextApprover(LeaveApprover nextApprover){
        this.nextApprove = nextApprover;
    }

    // Abstract method to process the leave request
    public abstract void processLeaveRequest(LeaveRequest request);
}
