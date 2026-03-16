package structural_patterns.mixed.proxy_and_factory;

public class VideoProxy implements IVideo {
    private RealVideo realVideo;
    private String fileName;

    public VideoProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void play() {
        // LAZY LOADING: Create the object only if it doesn't exist
        if (realVideo == null) {
            System.out.println("Proxy: Instance not found. Fetching from Factory...");
            realVideo = VideoFactory.createRealVideo(fileName);
        } else {
            // LOGGING: Confirming that we are reusing the existing instance
            System.out.println("Proxy: Instance already exists in memory. Reusing it.");
        }

        // DELEGATION: Pass the request to the real object
        realVideo.play();
    }
}
