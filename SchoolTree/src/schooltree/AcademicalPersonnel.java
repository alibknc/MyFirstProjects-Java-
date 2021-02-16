package schooltree;

public class AcademicalPersonnel extends Staff {

    String degree;
    String givenLesson;

    AcademicalPersonnel(String name, String gender, int age, String degree, String lesson, int workingYears, boolean isMarried) {
        super.name = name;
        super.gender = gender;
        super.age = age;
        super.workingYear = workingYears;
        super.isMarried = isMarried;
        this.degree = degree;
        this.givenLesson = lesson;
    }

    void academicalInfo() {
        System.out.println("Degree: " + this.degree + " Given Lesson: " + this.givenLesson);
    }

}
