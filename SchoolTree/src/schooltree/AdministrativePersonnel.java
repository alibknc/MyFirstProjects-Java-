package schooltree;

public class AdministrativePersonnel extends Staff {

    String workingArea;

    AdministrativePersonnel(String name, String gender, int age, String area, int workingYear, boolean isMarried) {
        super.name = name;
        super.gender = gender;
        super.age = age;
        super.workingYear = workingYear;
        super.isMarried = isMarried;
        this.workingArea = area;
    }

    void workingInfo() {
        System.out.println("Working area: " + this.workingArea);
    }
}
