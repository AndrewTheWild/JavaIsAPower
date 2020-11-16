package serviceStreamApi;

import model.Lesson;
import model.ScheduleDay;
import service.LessonTypeComparator;

import java.util.List;
import java.util.stream.Collectors;

public class ScheduleDayServiceStreamApi {
    public static List<Lesson> onlyTypeWithStream(ScheduleDay day){
        return day.getDayShedule().stream().filter(les->les.getType()=="лек.").collect(Collectors.toList());
    }
}
