package mixed_examples.mixed.decorator_and_proxy;

public class Main {
    static void main() {
        IFile file = new FileProxy("secret_file.zip");
        IFile decoratedFile = new CompressionDecorator(new EncryptionDecorator(file));

        decoratedFile.read();
    }
}
