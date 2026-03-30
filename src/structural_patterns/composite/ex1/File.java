package structural_patterns.composite.ex1;

public class File implements IFile{
    private String fileName;
    private int fileSize;


    public File(String fileName, int fileSize){
        this.fileName = fileName;
        this.fileSize = fileSize;
    }

    @Override
    public void showFileDetails() {
        System.out.println("File Name: " + this.fileName + ", Size: " + this.fileSize);
    }

    public void getFileName(){
        System.out.println(this.fileName);
    }
    public void getFileSize(){
        System.out.println(this.fileSize);
    }
}
