package mixed_examples.mixed.composite_and_facade;

public class UniversityFacade {
    private Department universityRoot;

    public UniversityFacade() {
        // En üst düğüm: Tüm üniversiteyi temsil eden bir "Ana Bölüm/Rektörlük" gibi düşün
        universityRoot = new Department("Tüm Üniversite");

        // 2 Fakülte oluştur
        Department f1 = new Department("Mühendislik Fakültesi");
        Department f2 = new Department("İşletme Fakültesi");

        // Her Fakülteye 2 Bölüm ekle
        Department b1 = new Department("Bilgisayar Mühendisliği");
        Department b2 = new Department("Yazılım Mühendisliği");
        Department b3 = new Department("İktisat");
        Department b4 = new Department("İşletme");

        // Her Bölüme 2 Hoca ekle
        b1.addMember(new FacultyMember("Şamil Basayev"));
        b1.addMember(new FacultyMember("Cevher Dudayev"));

        b2.addMember(new FacultyMember("Alan Turing"));
        b2.addMember(new FacultyMember("Margaret Hamilton"));

        b3.addMember(new FacultyMember("Adam Smith"));
        b3.addMember(new FacultyMember("John Maynard Keynes"));

        b4.addMember(new FacultyMember("Peter Drucker"));
        b4.addMember(new FacultyMember("Philip Kotler"));

        // Hiyerarşiyi bağla (Dalları gövdeye ekle)
        f1.addMember(b1);
        f1.addMember(b2);
        f2.addMember(b3);
        f2.addMember(b4);

        universityRoot.addMember(f1);
        universityRoot.addMember(f2);
    }

    public void showUniversityStructure() {
        universityRoot.showDetails();
    }

    public int getTotalInstructorCount() {
        return universityRoot.getInstructorCount();
    }
}
