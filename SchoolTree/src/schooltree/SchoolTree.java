package schooltree;

public class SchoolTree {

    public static void main(String[] args) {
        AcademicalPersonnel aPersonnel = new AcademicalPersonnel("Ali", "Male", 25, "Research Associate", "Data Structures", 3, false);
        AdministrativePersonnel iPersonel = new AdministrativePersonnel("Fatma", "Female", 30, "Accounting", 5, true);

        aPersonnel.personnelInfo();
        aPersonnel.academicalInfo();
        aPersonnel.salaryInfo();

        iPersonel.personnelInfo();
        iPersonel.workingInfo();
        iPersonel.salaryInfo();

        Undergraduate ugStudent = new Undergraduate("Ahmet", "Male", "Computer Eng.", 1, 3.5);
        ugStudent.studentInfo();
        ugStudent.undergraduateInfo();
        ugStudent.addLesson("Math");
        ugStudent.addLesson("Linear Algebra");
        ugStudent.addLesson("Programming");
        ugStudent.takeLesson("Math");
        ugStudent.addLesson("Physics");
        ugStudent.lessonsInfo();

        Master mStudent = new Master("Ayse", "Female", "Computer Eng.", "Artificial Intelligence", 3.0);
        mStudent.studentInfo();
        mStudent.departmentInfo();
        mStudent.masterInfo();
        mStudent.addLesson("Algorithm Analysis");
        mStudent.addLesson("Data Sciences");
        mStudent.addLesson("Thesis");
        mStudent.takeLesson("Data Sciences");
        mStudent.addLesson("Information Security");
        mStudent.lessonsInfo();
    }

}
