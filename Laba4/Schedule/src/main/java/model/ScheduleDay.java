package model;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class ScheduleDay implements Serializable {
    private static final long serialVersionUID=2L;
    @NotNull
    private int numberDay;

    private List<Lesson> DayShedule;

    @Override
    public String toString() {

        String buf_str = "Day:Example\n";
        for (var les : DayShedule) {
            buf_str = (buf_str
                    + (les.toString() + "\n"));
        }

        return buf_str;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ScheduleDay that = (ScheduleDay) o;
        return numberDay == that.numberDay &&
                Objects.equals(DayShedule, that.DayShedule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberDay, DayShedule);
    }

    //
    public static class Builder {
        private ScheduleDay newScheduleDay;

        public Builder() {
            newScheduleDay = new ScheduleDay();
        }

        public ScheduleDay.Builder withName(int numberDay){
            newScheduleDay.numberDay = numberDay;
            return this;
        }

        public ScheduleDay.Builder withType(List<Lesson> DayShedule) {
            newScheduleDay.DayShedule = DayShedule;
            return this;
        }

        public ScheduleDay  build(){
            return newScheduleDay;
        }

    }
    //
    public int getNumberDay() {
        return numberDay;
    }

    public void setNumberDay(int numberDay) {
        this.numberDay = numberDay;
    }

    public List<Lesson> getDayShedule() {
        return DayShedule;
    }

    public void setDayShedule(List<Lesson> dayShedule) {
        DayShedule = dayShedule;
    }
}
