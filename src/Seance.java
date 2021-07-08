import java.util.Comparator;

public class Seance implements Comparable<Seance> {

    private Movie movie;
    private Time startTime;
    private Time endTime;

    public Seance(Movie movie, Time startTime) {
        this.movie = movie;
        this.startTime = startTime;
        this.endTime =setEndTime();
    }

    public Seance() {

    }

    public Time setEndTime(){
        int endHours = startTime.getHour()+movie.getDuration().getHour();
        int sumMin = startTime.getMin()+movie.getDuration().getMin();
        int counter = 0;
        while (sumMin-60>=0){
            sumMin-=60;
            counter++;
        }
        endHours+=counter;
        int endMin = sumMin;
        return this.endTime = new Time(endHours,endMin);
    }

    public Movie getMovie() {
        return movie;
    }
    public Movie getMovie(Movie movie) {
        return movie;
    }

    public Time getStartTime() {
        return startTime;
    }

    public Time getEndTime() {
        return endTime;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    public int getSrartMinutes(){
        int sum = startTime.getHour()*60+startTime.getMin();
        return  sum;
    }



    @Override
    public String toString() {
        return movie + ", start time:" + startTime + ", end time: " + endTime+"\n";
    }


    @Override
    public int compareTo(Seance o) {
        return this.getSrartMinutes()-o.getSrartMinutes();
    }
}
