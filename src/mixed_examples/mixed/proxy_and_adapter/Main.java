package mixed_examples.mixed.proxy_and_adapter;

public class Main {
    static void main() {
        IJobService proxy = new JobServiceProxy("Dev. Team Leader");
        proxy.assign("Ahmet Ak","Debugging");
    }
}
