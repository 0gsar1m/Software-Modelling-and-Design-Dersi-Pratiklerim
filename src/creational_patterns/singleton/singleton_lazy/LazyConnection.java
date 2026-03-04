package creational_patterns.singleton.singleton_lazy;

public class LazyConnection {
    private static LazyConnection lazyConnectionInstance;

    private LazyConnection(){
        System.out.println("lazy Connection Instance başlatıldı");
    }

    public static LazyConnection getInstance(){
        if(lazyConnectionInstance == null){
            lazyConnectionInstance = new LazyConnection();
        }
        return lazyConnectionInstance;
    }
}