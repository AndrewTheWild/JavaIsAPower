import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import serialize.JsonIO;
import serialize.TxtIO;
import serialize.XmlIO;
import model.*;
import service.LessonNumLesComparator;
import service.LessonTypeComparator;
import serviceStreamApi.LessonServiceStreamAPI;
import serviceStreamApi.ScheduleDayServiceStreamApi;

public class Program {
    public static void main (String args[])throws Exception{

        var lesson1=new Lesson.Builder()
                .withNumLesson(1)
                .withAuditory("10к 1 корп.")
                .withName("Англійська")
                .withNumberWeek(0)
                .withTeacher("Петренко Марія Михайлівна")
                .withType("практ.")
                .build();
        var lesson2=new Lesson.Builder()
                .withNumLesson(5)
                .withAuditory("30к 1 корп.")
                .withName("Математика")
                .withNumberWeek(0)
                .withTeacher("Тодор Інна Вікторівна")
                .withType("практ.")
                .build();
        var lesson3=new Lesson.Builder()
                .withNumLesson(6)
                .withAuditory("1к 3 корп.")
                .withName("Програмування")
                .withNumberWeek(0)
                .withTeacher("Чижик Петро Богданович")
                .withType("лек.")
                .build();
        var lesson4=new Lesson.Builder()
                .withNumLesson(3)
                .withAuditory("45к 2 корп.")
                .withName("Аналітична геометрія")
                .withNumberWeek(0)
                .withTeacher("Невалід Іннеса Дональдівна")
                .withType("лек.")
                .build();
        //System.out.println(lesson.toString());
        var ListLesson=new ArrayList<Lesson>();
        ListLesson.add(lesson1);
        ListLesson.add(lesson2);
        ListLesson.add(lesson3);
        ListLesson.add(lesson4);
        //

            var daySchedule=new ScheduleDay.Builder()
                .withName(1)
                .withType(ListLesson)
                .build();
        //
        //var ListDays=new ArrayList<ScheduleDay>();
       // ListDays.add(daySchedule);
        //var groupeSchedule=new Groupe(322);
        //groupeSchedule.setWeekSchedule(ListDays);
        System.out.println("----------------------");
        for(var p : ScheduleDayServiceStreamApi.onlyTypeWithStream(daySchedule)) {

            System.out.println(p);
        }
    }
}
