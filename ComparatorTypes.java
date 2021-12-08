package subscriberImplementsComparator;

import java.util.Comparator;

// this class to compare between subcriber's firstName and if they are equals so lastName
public class ComparatorTypes implements Comparator<Subscriber> {

	@Override
	public int compare(Subscriber o1, Subscriber o2) {
		int firstNameComp = o1.firstName.compareTo(o2.firstName);
		int lastNameComp = o1.lastName.compareTo(o2.lastName);
		if (o1.firstName != o2.firstName)
			return firstNameComp;
		else
			return lastNameComp;
	}

}
// this class compare between subsriber's time 
class ComparatorTime implements Comparator<Subscriber> {

	@Override
	public int compare(Subscriber o1, Subscriber o2) {
	if(o1.t.hour < o2.t.hour  || (o1.t.hour == o2.t.hour && o1.t.minutes < o2.t.minutes ))
		   return -1;
		else if(o1.t.hour > o2.t.hour  || (o1.t.hour == o2.t.hour && o1.t.minutes > o2.t.minutes ))
		    return 1 ;
		else 
			return 0;
	}
}
