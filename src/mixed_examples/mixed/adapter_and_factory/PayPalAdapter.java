package mixed_examples.mixed.adapter_and_factory;

public class PayPalAdapter implements IPayment{

    private PayPalPayment payPalPayment;

    public PayPalAdapter(PayPalPayment payment){
        this.payPalPayment = payment;
    }

    @Override
    public void doPayment() {
        payPalPayment.doPaypalPayment();
    }
}
