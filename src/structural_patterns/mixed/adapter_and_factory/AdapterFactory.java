package structural_patterns.mixed.adapter_and_factory;

public class AdapterFactory {

    // Tek bir metot, parametreye göre doğru adapter'ı döndürür.
    public IPayment createPaymentAdapter(String type) {
        if (type.equalsIgnoreCase("PAYPAL")) {
            return new PayPalAdapter(new PayPalPayment());
        } else if (type.equalsIgnoreCase("CRYPTO")) {
            return new CryptoAdapter(new CryptoPayment());
        }
        return null;
    }
}
