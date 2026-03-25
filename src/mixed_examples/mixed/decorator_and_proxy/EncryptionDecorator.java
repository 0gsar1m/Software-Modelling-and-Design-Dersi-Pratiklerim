package mixed_examples.mixed.decorator_and_proxy;

public class EncryptionDecorator extends FileDecorator {

    public EncryptionDecorator(IFile file) {
        super(file);
    }

    @Override
    public void read(){
        System.out.println("[EncryptionDecorator.read()] --> Decrypting file...");
        super.read(); //Using main read() at abstract FileDecorator
    }
}
