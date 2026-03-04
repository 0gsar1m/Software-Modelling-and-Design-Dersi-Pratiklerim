package creational_patterns.singleton.singleton_eager;

public class Main {
    static void main(String[] args) {
        EagerConnection instance1 = EagerConnection.getInstance();
        EagerConnection instance2 = EagerConnection.getInstance();

        System.out.println(instance1 == instance2); //true bsaacak
    }
}
