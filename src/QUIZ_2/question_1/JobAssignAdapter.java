package QUIZ_2.question_1;

//ADAPTER:
public class JobAssignAdapter implements IEmployee {
    private AssignJob jobToAssign; //This is the key point

    public JobAssignAdapter(AssignJob jobToAssign) {
        this.jobToAssign = jobToAssign; //Thing is, we inject external system into adapter
    }


    @Override
    public void executeTask() {     //then we plug adapter's external system socket
                                    //into IEmployee's executeTask()
        jobToAssign.assignTask();
    }
}
