package mixed_examples.mixed.proxy_and_factory;

public class RealVideo implements IVideo {
    private String fileName;

    public RealVideo(String fileName) {
        this.fileName = fileName;
        loadFromDisk(); //heavy process
    }

    private void loadFromDisk() {
        System.out.println("SYSTEM: " + fileName + " loading (5 GB)...");
    }

    @Override
    public void play() {
        System.out.println("VIDEO: RealVideo " + fileName + " playing");
    }
}
