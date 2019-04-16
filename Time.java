package hw7;

public class Time implements Comparable<Time>, Calculable<Time>{
	private int hour;
	private int minute;
	private int seconds;
	public Time(int hour, int minute, int seconds) {
		int addTimeFromSeconds = seconds / 60; // gets added to minute
		int addTimeFromMinutes = minute / 60; // gets added to hours
		this.seconds = (seconds) % 60; // 
		this.minute = (minute + addTimeFromSeconds) % 60 ;
		this.hour = (hour + addTimeFromMinutes) % 24;
	}
	public Time (Time time) { // this is the deep copy constructor
		
	}
	public Time add(Time time) { // must return a new time object
		return null;
	}
	public Time subtract(Time time) { // new time object
		return null;
	}
	public int compareTo(Time time) {
		return 1;
	}
	public int getHour() {
		return this.hour;
	}
	public int getMinute() {
		return this.minute;
	}
	public int getSeconds() {
		return this.seconds;
	}
	public String toString() {
		String rep = "";
		if(minute < 10 & seconds < 10) {
			rep = "Time is: " + hour + ":0" + minute + ":0" + seconds;
			return rep;
		}
		else if(minute < 10) {
			rep = "Time is: " + hour + ":0" + minute + ":" + seconds;
			return rep;
		}
		else if(seconds < 10) {
			rep = "Time is: " + hour + ":" + minute + ":0" + seconds;
			return rep;
		}

		else {
			rep = "Time is: " + hour + ":" + minute + ":" + seconds;
			return rep;
		}
	}
}
