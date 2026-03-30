package mixed_examples.behavioural_mixed.cor_and_decorator;

public class Main {
    public static void main(String[] args) {
        // 1. Kargo oluşturulur ve süslenir (Decorator)
        IPackage myPackage = new BasicPackage(30);
        myPackage = new FragileDecorator(myPackage); // Artık 15kg ve Hassas

        // 2. Zincir kurulur (CoR)
        Carrier small = new SmallCarrier();
        Carrier big = new BigCarrier();
        small.setNextCarrier(big);

        // 3. İstek zincire verilir
        small.handle(myPackage);
        // ÇIKTI: Büyük Taşıyıcı: Standart Paket + Hassas Ürün Etiketi taşınıyor.
    }
}
