import javafx.scene.Scene;

import java.util.Set;
import java.util.TreeSet;

public class Schedule {
    private Set<Seance> schedule;

    public Schedule(Set<Seance> schedule) {
        this.schedule = new TreeSet<>();
    }


    public Set<Seance> getSchedule() {
        return schedule;
    }



    public void addSeance(Seance seance){
        this.schedule.add(seance);
    }
    public  void removeSeance(Seance seance){
        this.schedule.remove(seance);
    }
    @Override
    public String toString() {
        return "Schedule: " + schedule;
    }
}
