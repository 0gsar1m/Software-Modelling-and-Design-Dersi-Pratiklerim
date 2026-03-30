package structural_patterns.composite.ex1;

import java.util.ArrayList;
import java.util.List;

public class Directory implements IFile{
    private String directoryName;

    public Directory(String directoryName){
        this.directoryName = directoryName;
    }

    public List<IFile> fileList = new ArrayList<>();

    @Override
    public void showFileDetails() {
        System.out.println("\n[Inside directory] -> " + this.directoryName);
        for(IFile i : fileList){
            i.showFileDetails();
        }
    }
    public void addFile(IFile file){
        fileList.add(file);
    }
    public void removeFile(IFile file){
        fileList.remove(file);
    }
}
