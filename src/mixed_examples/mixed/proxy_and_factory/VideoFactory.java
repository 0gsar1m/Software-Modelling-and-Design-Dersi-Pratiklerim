package mixed_examples.mixed.proxy_and_factory;

public class VideoFactory {
    public static IVideo createVideo(String name){
        return new VideoProxy(name);
    }

    protected static RealVideo createRealVideo(String name){
        return new RealVideo(name);
    }
}
