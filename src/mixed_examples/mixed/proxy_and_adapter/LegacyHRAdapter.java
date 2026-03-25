package mixed_examples.mixed.proxy_and_adapter;

public class LegacyHRAdapter implements IJobService{
    private LegacyHR legacyHR = new LegacyHR();
    @Override
    public void assign(String employee, String task) {
        legacyHR.giveTask(employee,task);
    }
}
