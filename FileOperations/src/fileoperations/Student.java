package fileoperations;

import java.util.ArrayList;

public class Student {
    private String name;
    private String surname;
    private String schoolNo;
    ArrayList<Lesson> lessons = new ArrayList<>(6);
    
    Student(){}
    
    public void gradeAverage(){
        int total = 0;
        for (int i = 0; i < this.lessons.size(); i++) {
            Lesson temp = this.lessons.get(i);
            total += temp.getGrade();
        }
        System.out.println("Grade Average: " + (double)total/this.lessons.size());
    }
    
    public void listLessons(){
        for (int i = 0; i < this.lessons.size(); i++) {
            Lesson temp = this.lessons.get(i);
            System.out.println("Lesson  " + (i+1) + ": " + temp.getName() + " " + temp.getTerm() + " " + temp.getGrade());
        }
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getSchoolNo() {
        return schoolNo;
    }

    public ArrayList<Lesson> getLessons() {
        return lessons;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSchoolNo(String schoolNo) {
        this.schoolNo = schoolNo;
    }

    public void setLessons(ArrayList<Lesson> lessons) {
        this.lessons = lessons;
    }
    
}
