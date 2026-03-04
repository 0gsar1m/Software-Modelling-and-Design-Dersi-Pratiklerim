package creational_patterns.singleton.singleton_lazy;

public class Main {
    static void main() {
        LazyConnection instance1 = LazyConnection.getInstance();
        LazyConnection instance2 = LazyConnection.getInstance();

        System.out.println(instance1 == instance2); //true döncek
    }
}
