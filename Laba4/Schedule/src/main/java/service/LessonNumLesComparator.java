package service;

import model.Lesson;

import java.util.Comparator;

public class LessonNumLesComparator implements Comparator<Lesson> {

    public int compare(Lesson les1, Lesson les2){

        if(les1.getNumLesson()==les2.getNumLesson()) return 0;
        else if(les1.getNumLesson()>les2.getNumLesson()) return 1;
        else return -1;
    }
}
