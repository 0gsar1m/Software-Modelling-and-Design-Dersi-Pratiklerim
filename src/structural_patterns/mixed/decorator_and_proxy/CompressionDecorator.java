package structural_patterns.mixed.decorator_and_proxy;

public class CompressionDecorator extends FileDecorator {

    public CompressionDecorator(IFile file) {
        super(file);
    }

    @Override
    public void read(){
        System.out.println("[CompressionDecorator.read()] --> Unzipping file...");
        super.read(); //Using main read() at abstract FileDecorator
    }
}
