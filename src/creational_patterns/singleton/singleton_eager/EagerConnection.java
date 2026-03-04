package creational_patterns.singleton.singleton_eager;

public class EagerConnection {
    private static EagerConnection eagerConnection = new EagerConnection();
    //JVM tarafından derlenir derlenmez (run edince yani) direkt oluşturuyro nesneyi (Spring Bean gibi)
    private EagerConnection(){
        //dışarıdan erişilemeyen bir nesne/sınıf haline getirmek için private contructor
        System.out.println("Eager connection instance başlatıldı!");
    }

    public static EagerConnection getInstance(){
        return eagerConnection;
    }

}
