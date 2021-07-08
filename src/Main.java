import java.util.*;

public class Main {
    public static void main(String[] args) {

        Cinema cinema = new Cinema(new TreeMap<Days, Schedule>(), new Time(8, 0), new Time(23, 0));
        ArrayList seances = new ArrayList();
        seances.add(new Seance(new Movie("Fast and Furious", new Time(2, 10)), new Time(19, 10)));
        seances.add(new Seance(new Movie("Titanik", new Time(3, 10)), new Time(13, 20)));
        seances.add(new Seance(new Movie("Jumanji", new Time(1, 50)), new Time(17, 20)));
        cinema.addSeances(Days.MONDAY, seances);
        cinema.addSeanse(Days.MONDAY, new Seance(new Movie("Hoverla", new Time(3, 20)), new Time(10, 20)));
        cinema.addSeances(Days.THURSDAY, seances);
        cinema.addSeanse(Days.MONDAY, new Seance(new Movie("Hoverla", new Time(3, 10)), new Time(16, 20)));
        cinema.addSeanse(Days.MONDAY, new Seance(new Movie("Hoverla", new Time(2, 20)), new Time(9, 20)));
        cinema.addSeanse(Days.THURSDAY, new Seance(new Movie("Hoverla", new Time(3, 20)), new Time(10, 20)));
        print(cinema);
        System.out.println("After removing seanse:");
        cinema.removeMovie(new Movie("Hoverla", new Time(3, 20)));
        cinema.removeSeance(Days.THURSDAY,new Seance(new Movie("Hoverla", new Time(3, 20)), new Time(10, 20)));
        print(cinema);
    }

    public static void print(Cinema cinema) {
        System.out.println("\n");
        for (Map.Entry<Days, Schedule> entry : cinema.getCinema().entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println("\n");
    }
}
