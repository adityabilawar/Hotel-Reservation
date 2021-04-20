	public class Reservation {
	public String name; // last name of the person reserving the room
	public double rate; // room rate for 1 night&#39;s stay
	public Reservation() {
	name = "Leapold";
	rate = 99.99;
	}
	public Reservation(String myName, double myRate) {
		name = myName;
		rate = myRate;
	}
	public  double getRate()
	{
		return rate;
	}
	public String getName() {
		return name;
	}
	public String toString() {
		return name + " " + rate;
	}
	}
	