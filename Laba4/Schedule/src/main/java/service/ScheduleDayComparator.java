package service;

import model.Lesson;
import model.ScheduleDay;

import java.util.Comparator;

public class ScheduleDayComparator implements Comparator<ScheduleDay> {

    public int compare(ScheduleDay day1, ScheduleDay day2){

        if(day1.getNumberDay()==day2.getNumberDay()) return 0;
        else if(day1.getNumberDay()>day2.getNumberDay()) return 1;
        else return -1;
    }
}
