package model;

import validation.TypeLesson;

import java.io.Serializable;
import java.util.Objects;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Lesson implements Serializable,Comparable<Lesson> {
    private static final long serialVersionUID=1L;

    @NotEmpty(message = "Can't be empty")
    private String nameSubjects;

    //Type: Лек. Лаб. Сем. Фіз. ЗВ.
    @TypeLesson
    private String type;

    //Week 0,1,2
    @NotNull
    @Size(min=0, max = 2, message = "Number Week not correct")
    private int numberWeek;

    @NotEmpty(message = "Can't be empty name teacher")
    private String Teacher;

    @NotNull
    private String Auditory;

    @NotNull
    @Size(min=1, max = 8, message = "Number lesson")
    private int numLesson;

    @Override
    public String toString() {
        return "nameSubjects=" + nameSubjects + '\n' +
                "type=" + type + '\n' +
                "numberWeek=" + numberWeek +'\n'+
                "Teacher=" + Teacher + '\n' +
                "Auditory=" + Auditory + '\n' +
                "numLesson=" + numLesson+'\n';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lesson lesson = (Lesson) o;
        return numberWeek == lesson.numberWeek &&
                numLesson == lesson.numLesson &&
                Objects.equals(nameSubjects, lesson.nameSubjects) &&
                Objects.equals(type, lesson.type) &&
                Objects.equals(Teacher, lesson.Teacher) &&
                Objects.equals(Auditory, lesson.Auditory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameSubjects, type, numberWeek, Teacher, Auditory, numLesson);
    }

    @Override
    public int compareTo(Lesson les) {
        return nameSubjects.compareTo(les.getNameSubjects());
    }

    //
    public static class Builder {
        private Lesson newLesson;

        public Builder() {
            newLesson = new Lesson();
        }

        public Builder withName(String nameSubjects){
            newLesson.nameSubjects = nameSubjects;
            return this;
        }

        public Builder withType(String type){
            newLesson.type = type;
            return this;
        }

        public Builder withNumberWeek(int numberWeek){
            newLesson.numberWeek = numberWeek;
            return this;
        }

        public Builder withTeacher(String teacher){
            newLesson.Teacher = teacher;
            return this;
        }

        public Builder withAuditory(String auditory){
            newLesson.Auditory = auditory;
            return this;
        }

        public Builder withNumLesson(int numLesson){
            newLesson.numLesson = numLesson;
            return this;
        }

        public Lesson  build(){
            return newLesson;
        }

    }
    //
    public void setNameSubjects(String nameSubjects) {
        this.nameSubjects = nameSubjects;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setNumberWeek(int numberWeek) {
        this.numberWeek = numberWeek;
    }

    public void setTeacher(String teacher) {
        Teacher = teacher;
    }

    public void setAuditory(String auditory) {
        Auditory = auditory;
    }

    public void setNumLesson(int numLesson) {
        this.numLesson = numLesson;
    }

    public String getNameSubjects() {
        return nameSubjects;
    }

    public String getType() {
        return type;
    }

    public int getNumberWeek() {
        return numberWeek;
    }

    public String getTeacher() {
        return Teacher;
    }

    public String getAuditory() {
        return Auditory;
    }

    public int getNumLesson() {
        return numLesson;
    }
}
