package creational_patterns.builder;

public class Main {
    static void main() {
        Computer computer = new Computer.Builder("i7",32)
                .setGraphicsCard(true)
                .setSSD(false)
                .build();
    }
}
