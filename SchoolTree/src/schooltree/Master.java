package schooltree;

public class Master extends Graduate {

    String alan;

    Master(String name, String gender, String department, String area, double average) {
        super.studentName = name;
        super.studentGender = gender;
        super.department = department;
        super.average = average;
        this.alan = area;
    }

    void masterInfo() {
        System.out.println("Research Area: " + this.alan);
    }
}
