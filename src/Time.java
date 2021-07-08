public class Time {

    private int hour;
    private int min;

    public Time() {

    }

    public Time(int hour, int min) {
        if (hour >= 0 && hour <= 23) {
            this.hour = hour;
        }
        if (min >= 0 && min <= 59) {
            this.min = min;
        }
    }

    public int getHour() {
        return hour;


    }

    public void setHour(int hour) {
        if (hour >= 0 && hour <= 23) {
            this.hour = hour;
        }
    }

    public int getMin() {

        return min;
    }

    public void setMin(int min) {
        if (min >= 0 && min <= 59) {
            this.min = min;
        }
    }

    @Override
    public String toString() {
        String h = String.valueOf(hour).length()==1?"0"+hour:String.valueOf(hour);
        String m = String.valueOf(min).length()==1?"0"+min:String.valueOf(min);
        return  String.format("%s:%s",h,m);
    }
}
