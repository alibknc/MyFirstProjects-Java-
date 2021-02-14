package fileoperations;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Logger;
import java.util.logging.Level;

public class FileOperations {

    public static void main(String[] args) {
        Student newStdnt = new Student();
        newStdnt.setName("Ali");
        newStdnt.setSurname("Bilge");
        newStdnt.setSchoolNo("190202064");
        
        Lesson[] lesson = new Lesson[6];
        
        lesson[0] = new Lesson();
        System.out.println(lesson[0]);

        Lesson lesson1 = new Lesson();
        lesson1.setName("Math");
        lesson1.setTerm("Winter 2008");
        lesson1.setGrade(95);
        newStdnt.lessons.add(lesson1);

        Lesson lesson2 = new Lesson();
        lesson2.setName("Computer Architecture");
        lesson2.setTerm("Spring 2007");
        lesson2.setGrade(80);
        newStdnt.lessons.add(lesson2);

        Lesson lesson3 = new Lesson();
        lesson3.setName("Operating Systems");
        lesson3.setTerm("Winter 2008");
        lesson3.setGrade(90);
        newStdnt.lessons.add(lesson3);

        Lesson lesson4 = new Lesson();
        lesson4.setName("Physics");
        lesson4.setTerm("Spring 2007");
        lesson4.setGrade(70);
        newStdnt.lessons.add(lesson4);

        Lesson lesson5 = new Lesson();
        lesson5.setName("Chemistry");
        lesson5.setTerm("Winter 2008");
        lesson5.setGrade(70);
        newStdnt.lessons.add(lesson5);

        Lesson lesson6 = new Lesson();
        lesson6.setName("Web Services");
        lesson6.setTerm("Winter 2008");
        lesson6.setGrade(90);
        newStdnt.lessons.add(lesson6);
        
        newStdnt.gradeAverage();
        newStdnt.listLessons();

        String fileName = "C:\\Users\\MuhammedAli\\Documents\\Github\\MyFirstProjects-Java-\\FileOperations\\src\\fileoperations\\ali_bilge.txt";
        try {
            FileWriter filew = new FileWriter(fileName);
            BufferedWriter output = new BufferedWriter(filew);
            output.write(newStdnt.getName() + " " + newStdnt.getSurname() + "\n");
            output.write(newStdnt.getSchoolNo() + "\n\n");
            for (int i = 0; i < newStdnt.lessons.size(); i++) {
                Lesson temp = newStdnt.lessons.get(i);
                output.write(temp.getName() + " " + temp.getTerm() + " " + temp.getGrade() + "\n");
            }
            output.close();
        } catch (FileNotFoundException e) {
            Logger.getLogger(FileOperations.class.getName()).log(Level.SEVERE, null, e);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
