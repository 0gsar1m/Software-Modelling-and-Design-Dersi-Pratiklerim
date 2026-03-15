package QUIZ_2.question_1_ans;

import java.util.ArrayList;
import java.util.List;

public class Manager implements IEmployee{
    //Internal System
    private List<IEmployee> employees = new ArrayList<>();

    @Override
    public void executeTask() {
        System.out.println("Manager displaying It's team:");
        for(IEmployee e : employees){
            e.executeTask(); // Recursive call, just like in binary trees
        }
    }

    void add(IEmployee e){
        employees.add(e);
    }
}
