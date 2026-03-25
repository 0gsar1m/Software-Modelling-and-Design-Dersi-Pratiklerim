package mixed_examples.mixed.proxy_and_adapter;

public class JobServiceProxy implements IJobService {
    private IJobService jobService;
    private String accesDegree;

    public JobServiceProxy(String accesDegree) {
        this.accesDegree = accesDegree;
    }

    @Override
    public void assign(String employee, String task) {

        //In question, it says "A proxy to enforce access" so maybe we can even add a parameter "title or degree"
        if (!accesDegree.contains("Leader")) {
            System.out.println("Proxy: Access Denied! Only team leaders can assign tasks.");
            return;
        }

        if (jobService == null) {
            jobService = new LegacyHRAdapter();
        }
        jobService.assign(employee, task);
    }
}
