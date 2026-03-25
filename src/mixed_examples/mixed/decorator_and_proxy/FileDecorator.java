package mixed_examples.mixed.decorator_and_proxy;

public abstract class FileDecorator implements IFile{

    protected IFile decoratedFile;

    public FileDecorator(IFile file){
            this.decoratedFile = file;
    }

    @Override
    public void read(){
        decoratedFile.read(); //whatever concrete IFile file is,
                                // that read() will execute due to polymorphism (RealFile etc.)
    }
}
