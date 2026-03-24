package structural_patterns.mixed.composite_and_facade;

public class Main {
    public static void main(String[] args) {

        UniversityFacade university = new UniversityFacade();

        System.out.println("=== UNIVERSITY HIERARCHY ===");
        university.showUniversityStructure();

        System.out.println("\n------------------------------");
        System.out.println("Total Instructor Count: " + university.getTotalInstructorCount());
        System.out.println("------------------------------");
    }
}
