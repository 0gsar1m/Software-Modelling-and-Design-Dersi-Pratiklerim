package mixed_examples.mixed.adapter_and_factory;

public class Main {
    public static void main(String[] args) { // static main'e String[] args eklemeyi unutma reis
        AdapterFactory factory = new AdapterFactory();

        // PayPal istiyoruz
        IPayment payment1 = factory.createPaymentAdapter("PAYPAL");
        payment1.doPayment();

        System.out.println("--------------------");

        // Crypto istiyoruz
        IPayment payment2 = factory.createPaymentAdapter("CRYPTO");
        payment2.doPayment();
    }
}
