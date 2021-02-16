package schooltree;

public abstract class Staff extends Salary implements Person {

    String name;
    String gender;
    int age;

    void personnelInfo() {
        System.out.println("Name: " + this.name + " Gender: " + this.gender + " Age: " + this.age);
    }

    void salaryInfo() {
        System.out.println("Monthly salary: " + super.calculateSalary() + " Annual salary: " + super.annualSalary());
    }

    @Override
    public void personalInfo() {
    }

}
