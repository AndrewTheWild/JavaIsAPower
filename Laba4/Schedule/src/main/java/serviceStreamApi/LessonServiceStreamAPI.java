package serviceStreamApi;

import model.Lesson;
import service.LessonNumLesComparator;
import service.LessonTypeComparator;

import java.util.List;
import java.util.stream.Collectors;

public class LessonServiceStreamAPI {
    public static List<Lesson> sortLessonWithStream(List<Lesson> lessons){
        return lessons.stream().sorted(new LessonNumLesComparator()).collect(Collectors.toList());
    }
    //
    public static List<Lesson> sortLessonTypeWithStream(List<Lesson> lessons){
        return lessons.stream().sorted(new LessonTypeComparator()).collect(Collectors.toList());
    }
    //
}
