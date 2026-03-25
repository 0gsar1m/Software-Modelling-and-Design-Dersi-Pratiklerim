package mixed_examples.mixed.adapter_and_factory;

public class CryptoAdapter implements IPayment {

    private CryptoPayment cryptoPayment;

    public CryptoAdapter(CryptoPayment payment) {
        this.cryptoPayment = payment;
    }

    @Override
    public void doPayment() {
        cryptoPayment.doCryptoPayment();
    }
}
