package QUIZ_2.question_1_ans;

public class Main {
    public static void main(String[] args) {

        // ==========================================
        // 1. CREATING PURE INTERNAL EMPLOYEES (Leaves)
        // ==========================================
        IEmployee dev1 = new Developer();
        IEmployee dev2 = new Developer();


        // ==========================================
        // 2. BRINGING IN THE EXTERNAL SYSTEM
        // ==========================================
        // This is the weird guy from the outside world. He doesn't know executeTask().
        AssignJob foreignJobSystem = new AssignJob();

        // Let's dress him up in our company's uniform!
        // We create an Adapter and inject the foreign system into it.
        // Now, 'adaptedSystem' looks and acts exactly like an 'Employee' to the outside world.
        IEmployee adaptedSystem = new JobAssignAdapter(foreignJobSystem);


        // ==========================================
        // 3. ASSEMBLING THE COMPOSITE TREE (The Box)
        // ==========================================
        // We create a Manager who can hold ANY 'Employee'.
        Manager projectManager = new Manager();

        // The Manager happily accepts the regular developers.
        projectManager.add(dev1);
        projectManager.add(dev2);

        // THE KEY MOMENT:
        // The Manager also accepts the adapted foreign system without even realizing it's different!
        // To the Manager, it's just another 'Employee' because it wears the uniform.
        projectManager.add(adaptedSystem);


        // ==========================================
        // 4. TRIGGERING THE WHOLE SYSTEM
        // ==========================================
        System.out.println("--- Manager triggers the 'executeTask()' chain ---");

        // When the manager calls this, it will iterate through its list:
        // - For dev1: It prints "Developer employee"
        // - For dev2: It prints "Developer employee"
        // - For adaptedSystem: The Adapter hears executeTask(), turns around,
        //   and whispers assignTask() to the foreign system inside it!
        projectManager.executeTask();

    }
}

