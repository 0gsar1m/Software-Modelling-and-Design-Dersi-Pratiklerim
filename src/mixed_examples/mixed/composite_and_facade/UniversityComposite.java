package mixed_examples.mixed.composite_and_facade;

import java.util.ArrayList;
import java.util.List;

// Ortak bir "Konteynır" sınıfı oluşturuyoruz
public abstract class UniversityComposite implements IUniversityComponents {
    protected List<IUniversityComponents> children = new ArrayList<>();
    private String name;

    public UniversityComposite(String name) {
        this.name = name;
    }

    public void addMember(IUniversityComponents component) {
        children.add(component);
    }

    @Override
    public int getInstructorCount() {
        int count = 0;
        for (IUniversityComponents child : children) {
            count += child.getInstructorCount();
        }
        return count;
    }

    @Override
    public void showDetails() {
        for (IUniversityComponents i : children) {
            i.showDetails();
        }
    }
}