package structural_patterns.decorator_and_composite;

public class SingleDocument implements IFileComponent{
    private String fileName;
    public SingleDocument(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void read() {
        System.out.println("Reading single document");
    }
}
