package schooltree;

public abstract class Salary {

    int workingYear;
    int salary;
    boolean isMarried;

    int calculateSalary() {
        this.salary = 5000 + this.workingYear * 100 + extraPay();
        return this.salary;
    }
    
    int extraPay() {
        int extra = 0;
        if (this.isMarried) {
            extra = 250;
        }
        return extra;
    }

    int annualSalary() {
        return this.salary * 12;
    }
}
