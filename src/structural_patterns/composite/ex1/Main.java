package structural_patterns.composite.ex1;

public class Main {
    static void main() {
        // Constructing leafs
        IFile txtFile = new File("Notlar.txt", 4);
        IFile mp3File = new File("Tarkan.mp3", 5);
        IFile pdfFile = new File("Fatura.pdf", 6);
        IFile exeFile = new File("Oyun.exe", 7);

        //Constructing directories (nodes)
        Directory dirMusics = new Directory("Musics");
        Directory dirFiles = new Directory("Files");

        //the root maybe, main C
        Directory mainDiscC = new Directory("Main_disc_C");

        //constructing env
        dirMusics.addFile(mp3File);
        dirFiles.addFile(pdfFile);
        dirFiles.addFile(txtFile);

        //all in C disc
        mainDiscC.addFile(exeFile);
        mainDiscC.addFile(dirFiles);
        mainDiscC.addFile(dirMusics);

        //let's see main disc C!
        System.out.println("--MAIN DISC C--");
        mainDiscC.showFileDetails();
    }
}
