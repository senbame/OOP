package lab3.Question5;

public class Time implements Comparable<Time> {
    private int hours, minutes, seconds;

    public Time(int h, int m, int s) {
        if (h < 0 || h > 23 || m < 0 || m > 59 || s < 0 || s > 59)
            throw new IllegalArgumentException("Invalid time");
        this.hours = h; this.minutes = m; this.seconds = s;
    }

    public int toSeconds() { return hours * 3600 + minutes * 60 + seconds; }

    @Override
    public int compareTo(Time other) {
        return Integer.compare(this.toSeconds(), other.toSeconds());
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
}
