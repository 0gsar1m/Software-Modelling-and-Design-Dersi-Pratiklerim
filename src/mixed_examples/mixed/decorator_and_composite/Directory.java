package mixed_examples.mixed.decorator_and_composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements IFileComponent {
    private String directoryName;

    public Directory(String directoryName) {
        this.directoryName = directoryName;
    }

    public List<IFileComponent> fileList = new ArrayList<>();

    @Override
    public void read() {
        System.out.println("\n[Inside directory] -> " + this.directoryName);
        for (IFileComponent i : fileList) {
            i.read();
        }
    }

    public void addFile(IFileComponent file) {
        fileList.add(file);
    }

    public void removeFile(IFileComponent file) {
        fileList.remove(file);
    }
}
