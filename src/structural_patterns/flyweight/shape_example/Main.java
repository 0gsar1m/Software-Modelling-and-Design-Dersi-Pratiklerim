package structural_patterns.flyweight.shape_example;

public class Main {
    static void main() {
        // --- 1. SİPARİŞ (DAİRE) ---
        // Fabrikaya diyorum ki: "Bana Red_Circle ver. Eğer yoksa, bu tarifi '() -> new Circle("Red")' kullanarak üret
        IShape dairem = ShapeFactory.getShape("Red_Circle", () -> new Circle("Red"));
        dairem.draw(50);


        // --- 2. SİPARİŞ (YARIN ÖBÜR GÜN SİSTEME KARE -SQUARE- EKLENDİ DİYELİM) ---
        // DİKKAT: Fabrikanın kapağını BİLE AÇMADIM! Sadece tarifimi (Square) yolladım:
        IShape karem = ShapeFactory.getShape("Blue_Square", () -> new Square("Blue"));
        karem.draw(120);

        // --- 3. SİPARİŞ (AYNI DAİREYİ TEKRAR İSTEYELİM) ---
        // Tarif vermeme rağmen, Factory "Bende Red_Circle var zaten" deyip
        // tarifi çöpe atacak ve RAM'deki AYNI Daireyi bana geri verecek
        IShape belestenDaire = ShapeFactory.getShape("Red_Circle", () -> new Circle("Red"));
        belestenDaire.draw(999);
    }
}
