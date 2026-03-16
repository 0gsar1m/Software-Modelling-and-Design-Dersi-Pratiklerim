package structural_patterns.mixed.decorator_and_composite;

public class Main {
    static void main() {
        IFileComponent salaryPdf = new SingleDocument("salary.pdf");

        salaryPdf = new EncryptDecorator(salaryPdf);

        Directory secretFolder = new Directory("Secret");

        secretFolder.addFile(salaryPdf);

        IFileComponent compressedSystem = new CompressDecorator(secretFolder);

        compressedSystem.read();
    }
}
