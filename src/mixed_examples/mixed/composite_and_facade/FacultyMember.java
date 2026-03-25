package mixed_examples.mixed.composite_and_facade;

public class FacultyMember implements IUniversityComponents{

    private String name;

    public FacultyMember(String name){
        this.name = name;
    }

    @Override
    public void showDetails() {
        System.out.println("Faculty member: " + name);
    }

    @Override
    public int getInstructorCount() {
        return 1;
    }
}
