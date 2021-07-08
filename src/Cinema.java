import java.lang.reflect.Array;
import java.util.*;

public class Cinema {
    private Map<Days, Schedule> cinema;
    private Time open;
    private Time close;

    public Cinema(Map<Days, Schedule> cinema, Time open, Time close) {
        this.cinema = new TreeMap<>();
        this.open = open;
        this.close = close;
    }


    public Map<Days, Schedule> getCinema() {
        return cinema;
    }

    public void setCinema(Map<Days, Schedule> cinema) {
        this.cinema = cinema;
    }

    public Time getOpen() {
        return open;
    }

    public void setOpen(Time open) {
        this.open = open;
    }

    public Time getClose() {
        return close;
    }

    public void setClose(Time close) {
        this.close = close;
    }

    public void addSeances(Days day, ArrayList<Seance> seance) {
        Schedule schedule = new Schedule(new TreeSet<>());
        for (Seance s : seance) {
            schedule.addSeance(s);
        }
        cinema.put(day, schedule);
    }

    public void addSeanse(Days day, Seance seance) {
        if (!cinema.isEmpty()) {
            if (cinema.containsKey(day)) {
                Schedule seances = cinema.get(day);
                seances.addSeance(seance);
                cinema.put(day, seances);
            } else {
                Schedule schedule = new Schedule(new TreeSet<>());
                schedule.addSeance(seance);
                cinema.put(day, schedule);
            }
        } else {
            Schedule schedule = new Schedule(new TreeSet<>());
            schedule.addSeance(seance);
            cinema.put(day, schedule);
        }
    }

    public void removeMovie(Movie movie) {

        for (Map.Entry<Days, Schedule> entry : cinema.entrySet()) {
            Schedule schedule = entry.getValue();
            Iterator<Seance> iterator = entry.getValue().getSchedule().iterator();
            while (iterator.hasNext()) {
                if (iterator.next().getMovie().getTitle().equalsIgnoreCase(movie.getTitle())) {
                    iterator.remove();
                }
            }
            cinema.put(entry.getKey(), schedule);
        }
    }

    public void removeSeance(Days day, Seance seance) {
        if (cinema.containsKey(day)) {
            Schedule seances = cinema.get(day);
            seances.removeSeance(seance);
            cinema.put(day, seances);
        }
    }

    @Override
    public String toString() {
        return "---------Сinema---------\n" + cinema + ", open in " + open + ", close in " + close;
    }

}
