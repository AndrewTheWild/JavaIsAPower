package service;

import model.Lesson;

import java.util.Comparator;

public class LessonTypeComparator implements Comparator<Lesson> {
    public int compare(Lesson les1, Lesson les2){
        if(les1.getType()==les2.getType()) return 0;
        return (les1.getType()).compareTo(les2.getType());
    }
}
