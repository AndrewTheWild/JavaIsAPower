package StreamApiTest;

import model.Lesson;
import model.ScheduleDay;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import service.LessonNumLesComparator;
import service.LessonTypeComparator;
import serviceStreamApi.LessonServiceStreamAPI;
import serviceStreamApi.ScheduleDayServiceStreamApi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamApiTest {
    @Test(dataProvider = "LessonNumProvider")
    public void testSortListWithStream(List<Lesson> list1, List<Lesson> list2) {
        Assert.assertEquals(LessonServiceStreamAPI.sortLessonWithStream(list1),list2);
    }
    //
    @DataProvider
    public Object[][] LessonNumProvider() {
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
        var ListLesson=new ArrayList<Lesson>();
        ListLesson.add(lesson1);
        ListLesson.add(lesson2);
        ListLesson.add(lesson3);
        ListLesson.add(lesson4);
        var SortLesson=new ArrayList<Lesson>();
        SortLesson.add(lesson1);
        SortLesson.add(lesson4);
        SortLesson.add(lesson2);
        SortLesson.add(lesson3);
        return new Object[][]{{ListLesson,SortLesson}};


    }
    @Test(dataProvider = "LessonTypeProvider")
    public void testSortTypeList(List<Lesson> list1,List<Lesson> list2) {
        Assert.assertEquals(LessonServiceStreamAPI.sortLessonTypeWithStream(list1),list2);
    }
    //
    @DataProvider
    public Object[][] LessonTypeProvider() {
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
        var ListLesson=new ArrayList<Lesson>();
        ListLesson.add(lesson1);
        ListLesson.add(lesson2);
        ListLesson.add(lesson3);
        ListLesson.add(lesson4);
        var SortLesson=new ArrayList<Lesson>();
        SortLesson.add(lesson3);
        SortLesson.add(lesson4);
        SortLesson.add(lesson1);
        SortLesson.add(lesson2);
        return new Object[][]{{ListLesson,SortLesson}};


    }
    @Test(dataProvider = "DayTypeProvider")
    public void testSortTypeList(ScheduleDay day1,List<Lesson> list) {
        Assert.assertEquals(ScheduleDayServiceStreamApi.onlyTypeWithStream(day1),list);
    }
    //
    @DataProvider
    public Object[][] DayTypeProvider() {
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
        var ListLesson=new ArrayList<Lesson>();
        ListLesson.add(lesson1);
        ListLesson.add(lesson2);
        ListLesson.add(lesson3);
        ListLesson.add(lesson4);
        var day= new ScheduleDay.Builder()
                .withName(1)
                .withType(ListLesson)
                .build();
        var SortLesson=new ArrayList<Lesson>();
        SortLesson.add(lesson3);
        SortLesson.add(lesson4);
        return new Object[][]{{day,SortLesson}};


    }
}
