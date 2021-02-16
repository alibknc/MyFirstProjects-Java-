package schooltree;

public class Undergraduate extends Student {

    String department;
    int _class;

    Undergraduate(String name, String gender, String department, int _class, double average) {
        super.studentName = name;
        super.studentGender = gender;
        super.average = average;
        this._class = _class;
        this.department = department;
    }

    void undergraduateInfo() {
        System.out.println("Department: " + this.department + " Class: " + this._class);
    }
}
