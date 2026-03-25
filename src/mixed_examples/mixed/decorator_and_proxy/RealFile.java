package mixed_examples.mixed.decorator_and_proxy;

public class RealFile implements IFile {
    private String fileName;

    public RealFile(String fileName) {
        this.fileName = fileName;
        System.out.println("RealFile created: " + fileName);
    }

    @Override
    public void read() {
        System.out.println("Reading RealFile: " + fileName);
    }
}
