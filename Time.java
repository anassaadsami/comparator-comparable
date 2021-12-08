package subscriberImplementsComparator;

import java.util.ArrayList;
import java.util.Collections;

public class Time implements Comparable<Time> {
	int hour;
	int minutes;
	static ArrayList<Time> reservationsTime = new ArrayList<Time>();

//		public void setHourAndMinutes(int hour, int minutes) {
//		for (int i = 0; i < reservationsTime.size(); i++) {
//			if (this.getHour() == Time.reservationsTime.get(i).hour
//					&& this.getMinutes() == Time.reservationsTime.get(i).minutes) {
//				System.out.println("this time is occured ");
////			this.getHour() = hour;
////			this.getMinutes() = minutes;
////		}
//			}
//			else {
//			this.hour = hour;
//			this.minutes = minutes;
//			}
//		}
//	}
	
		public void setHourAndMinutes(int hour, int minutes) {
		for (int i = 0; i < reservationsTime.size(); i++) {
			if(this.compareTo(reservationsTime.get(i)) != 0) {
				this.hour = hour ;
				this.minutes = minutes ;
			}
				
		}
		}
	

	public int getHour() {
		return hour;
	}

	public int getMinutes() {
		return minutes;
	}

	public Time(int hour, int minutes) {
		setHourAndMinutes(hour, minutes);
		reservationsTime.add(this);
	}

	public void displayTime() {
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return "Time [hour=" + this.hour + ", minutes=" + this.minutes + "]";
	}

	@Override
	public int compareTo(Time t) {
		if (this.getHour() == t.getHour() && this.getMinutes() == t.getMinutes())
			return 0;
		else
			return 1;

	}

}
