package structural_patterns.decorator_and_composite;

public class EncryptDecorator extends FileDecorator{
    public EncryptDecorator(IFileComponent fileComponent) {
        super(fileComponent);
    }

    @Override
    public void read() {
        System.out.println("File encrypted");
        fileComponent.read();
    }
}
