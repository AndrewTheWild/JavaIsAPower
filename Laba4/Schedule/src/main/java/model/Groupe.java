package model;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Groupe implements Serializable {
    private static final long serialVersionUID=3L;
    @NotNull
    private int numberGroupe;

    private List<ScheduleDay> WeekSchedule ;

    @Override
    public String toString() {
        String buf_str = "Number Groupe:"+numberGroupe+'\n';
        for (var day : WeekSchedule) {
            var d = (day.getNumberDay());
            buf_str = (buf_str
                    + (d + ("\n"
                    + (day.toString() + "\n-------------------------------------"))));
        }

        return buf_str;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Groupe groupe = (Groupe) o;
        return numberGroupe == groupe.numberGroupe &&
                Objects.equals(WeekSchedule, groupe.WeekSchedule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberGroupe, WeekSchedule);
    }

    public Groupe(){ }
    public Groupe(int numGr)
    {
        this.numberGroupe = numGr;
        WeekSchedule = new ArrayList<ScheduleDay>();
    }
    public int getNumberGroupe() {
        return numberGroupe;
    }

    public void setNumberGroupe(int numberGroupe) {
        this.numberGroupe = numberGroupe;
    }

    public List<ScheduleDay> getWeekSchedule() {
        return WeekSchedule;
    }

    public void setWeekSchedule(List<ScheduleDay> weekSchedule) {
        WeekSchedule = weekSchedule;
    }
}
