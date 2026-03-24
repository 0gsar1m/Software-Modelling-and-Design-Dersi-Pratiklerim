package structural_patterns.mixed.decorator_and_proxy;

public class FileProxy implements IFile {
    private String fileName;
    private RealFile realFile;

    public FileProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void read() {
        if (realFile == null) {
            System.out.println("[Proxy] --> First time access. Loading " + fileName + " from disk...");
            realFile = new RealFile(fileName);
        } else {
            System.out.println("[Proxy] --> File already loaded. Accessing cache...");
        }
        realFile.read();
    }
}

