package schooltree;

public abstract class Graduate extends Student {

    String department;

    void departmentInfo() {
        System.out.println("Department: " + this.department);
    }
}
