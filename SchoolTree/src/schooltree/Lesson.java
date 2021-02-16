package schooltree;

import java.util.ArrayList;

public abstract class Lesson {

    ArrayList<String> lessons = new ArrayList();

    void addLesson(String lesson) {
        this.lessons.add(lesson);
    }

    void takeLesson(String lesson) {
        this.lessons.remove(lesson);
    }

    ArrayList<String> chosenLessons() {
        return this.lessons;
    }
}
