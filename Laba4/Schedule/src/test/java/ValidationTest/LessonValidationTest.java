package ValidationTest;

import model.Lesson;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LessonValidationTest {
    @Test(dataProvider = "LessonNameProvider")
    public void testLessonTypeValidator(Integer num,String aud,String name,Integer numWeek,
                                       String teacher,String type,String message) {
        try
        {
            var les=new Lesson.Builder()
                    .withNumLesson(num)
                    .withAuditory(aud)
                    .withName(name)
                    .withNumberWeek(numWeek)
                    .withTeacher(teacher)
                    .withType(type)
                    .build();
        }
        catch (Exception e){
            Assert.assertEquals(e.getMessage(),message);
        }
    }
    //
    @DataProvider
    public Object[][] LessonNameProvider() {
        return new Object[][]{{1,"10к 1 корп.","Англійська",0,"Петренко Марія Михайлівна","роб.","Not correct type of lesson"},
                {5,"30к 1 корп.","Математика",0,"Тодор Інна Вікторівна","практ.",""}};
    }

    @Test(dataProvider = "LessonTeacherProvider")
    public void testLessonTeacherValidator(Integer num,String aud,String name,Integer numWeek,
                                        String teacher,String type,String message) {
        try
        {
            var les=new Lesson.Builder()
                    .withNumLesson(num)
                    .withAuditory(aud)
                    .withName(name)
                    .withNumberWeek(numWeek)
                    .withTeacher(teacher)
                    .withType(type)
                    .build();
        }
        catch (Exception e){
            Assert.assertEquals(e.getMessage(),message);
        }
    }
    //
    @DataProvider
    public Object[][] LessonTeacherProvider() {
        return new Object[][]{{1,"10к 1 корп.","Англійська",0,"","лек.","Can't be empty name teacher"},
                {5,"30к 1 корп.","Математика",0,"Тодор Інна Вікторівна","практ.",""}};
    }

    @Test(dataProvider = "LessonWeekProvider")
    public void testLessonNumWeekValidator(Integer num,String aud,String name,Integer numWeek,
                                           String teacher,String type,String message) {
        try
        {
            var les=new Lesson.Builder()
                    .withNumLesson(num)
                    .withAuditory(aud)
                    .withName(name)
                    .withNumberWeek(numWeek)
                    .withTeacher(teacher)
                    .withType(type)
                    .build();
        }
        catch (Exception e){
            Assert.assertEquals(e.getMessage(),message);
        }
    }
    //
    @DataProvider
    public Object[][] LessonWeekProvider() {
        return new Object[][]{{1,"10к 1 корп.","Англійська",3,"Петренко Марія Михайлівна","лек.","Number Week not correct"},
                {5,"30к 1 корп.","Математика",0,"Тодор Інна Вікторівна","практ.",""}};
    }
}
