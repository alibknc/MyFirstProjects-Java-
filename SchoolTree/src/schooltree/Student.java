package schooltree;

public abstract class Student extends Lesson implements Person {

    String studentName;
    String studentGender;
    double average;

    void studentInfo() {
        System.out.println("Name: " + this.studentName + " Gender: " + this.studentGender + " Average: " + this.average);
    }

    void lessonsInfo() {
        System.out.println("Chosen Lessons: " + super.chosenLessons().toString());
    }

    @Override
    public void personalInfo() {

    }
}
