package subscriberImplementsComparator;

public class Subscriber  {
	String firstName ;
	String lastName;
	String fullName ;
	Time t ;
	public Subscriber(String firstName, String lastName, Time t) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.fullName = getFirstName().concat(getLastName());
//		this.t.hour = t.hour;    // -------> error
//		this.t.minutes = t.minutes ;
//		setTime(t);
	}
	@Override
	public String toString() {
		return "Subscriber [firstName=" + getFirstName()+ ", lastName=" + getLastName() + ", fullName=" + getFullName() 
				+ "]";
	}
	public void displaySubscriberNameAndTime() {
		 this.t.displayTime();
		
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName() {
		this.fullName = getFirstName().concat(getLastName());
	}
	public Time getTime() {
		return t;
	}
//	public void setTime(Time t) {
//		   t.setHourAndMinutes(int hour, int minutes);;
//	}
	
	
	
}
