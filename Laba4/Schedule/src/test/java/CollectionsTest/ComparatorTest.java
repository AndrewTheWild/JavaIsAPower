package CollectionsTest;

import model.Lesson;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import service.LessonNumLesComparator;
import service.LessonTypeComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorTest {
    @Test(dataProvider = "LessonNumProvider")
     public void testSortList(List<Lesson> list1,List<Lesson> list2) {
        Collections.sort(list1,new LessonNumLesComparator());
        Assert.assertEquals(list1,list2);
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
        Collections.sort(list1,new LessonTypeComparator());
        Assert.assertEquals(list1,list2);
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
    @Test(dataProvider = "LessonNameProvider")
    public void testSortNameList(List<Lesson> list1,List<Lesson> list2) {
        Collections.sort(list1);
        Assert.assertEquals(list1,list2);
    }
    //
    @DataProvider
    public Object[][] LessonNameProvider() {
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
        SortLesson.add(lesson4);
        SortLesson.add(lesson1);
        SortLesson.add(lesson2);
        SortLesson.add(lesson3);
        return new Object[][]{{ListLesson,SortLesson}};


    }
}
