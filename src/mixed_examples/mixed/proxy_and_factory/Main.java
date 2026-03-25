package mixed_examples.mixed.proxy_and_factory;

public class Main {
    static void main() {
        // Fast initialization: No heavy loading happens here
        IVideo video = VideoFactory.createVideo("cat.mp4");

        System.out.println("--- First Call ---");
        video.play(); // Triggers loading

        System.out.println("\n--- Second Call ---");
        video.play(); // Uses cached object
    }
}
