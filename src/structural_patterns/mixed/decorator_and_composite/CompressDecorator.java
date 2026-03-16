package structural_patterns.mixed.decorator_and_composite;

public class CompressDecorator extends FileDecorator{
    public CompressDecorator(IFileComponent fileComponent) {
        super(fileComponent);
    }

    @Override
    public void read() {
        System.out.println("File compressed");
        fileComponent.read();
    }
}
