package structural_patterns.mixed.proxy_and_singleton;

public class Main {
    public static void main(String[] args) {
        // 1. ADIM: Proxy'yi oluşturuyoruz.
        // Dikkat: Henüz MySqlConnection içindeki "getting instance" yazısı çıkmamalı!
        System.out.println("--- 1. ADIM: Proxy Nesnesi Oluşturuldu ---");
        IDBConnection proxy = new ProxyMysqlDbConnection();
        System.out.println("Proxy şu an beklemede, henüz MySQL nesnesi yaratılmadı.");

        System.out.println("\n--- 2. ADIM: İlk Bağlantı İsteği ---");
        // Proxy burada 'mysql == null' olduğu için getInstance()'a gidecek.
        IDBConnection conn1 = proxy.connect();

        System.out.println("\n--- 3. ADIM: İkinci Bağlantı İsteği ---");
        // Proxy burada 'mysql != null' olduğu için mevcut nesneyi kullanacak.
        // "getting instance" yazısını görmememiz gerekiyor!
        IDBConnection conn2 = proxy.connect();

        System.out.println("\n--- 4. ADIM: Singleton Kanıtı (Referans Kontrolü) ---");
        // Bellek adreslerini karşılaştırıyoruz.
        if (conn1 == conn2) {
            System.out.println("KANIT: conn1 ve conn2 bellekte aynı adresi gösteriyor.");
            System.out.println("Nesne Adresi: " + System.identityHashCode(conn1));
            System.out.println("SONUÇ: Singleton ve Proxy uyum içinde çalışıyor!");
        } else {
            System.out.println("HATA: Nesneler farklı! Singleton yapısı bozulmuş.");
        }
    }
}