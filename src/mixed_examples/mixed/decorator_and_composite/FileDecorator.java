package mixed_examples.mixed.decorator_and_composite;

public abstract class FileDecorator implements IFileComponent {
    protected IFileComponent fileComponent;

    public FileDecorator(IFileComponent fileComponent) {
        this.fileComponent = fileComponent;
    }

    @Override
    public void read() {
        fileComponent.read();
    }
}

