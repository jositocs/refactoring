package refactoring;


import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Customer {

	private String name;
	private Vector _rentals = new Vector();
	private ArrayList rentals = new ArrayList();

	public Customer(String inname) {
		name = inname;
	};

	public void addRental(Rental arg) {
		rentals.add(arg);
		_rentals.addElement(arg);
	}

	public String getName() {
		return name;
	}

	public String statement() {
		double totalAmount = 0;
		int frequentRenterPoints = 0;
		Enumeration rentals = _rentals.elements();
		String result = "Rental Record for " + getName() + "\n";
		while (rentals.hasMoreElements()) {
			double thisAmount = 0;
			Rental each = (Rental) rentals.nextElement();
			frequentRenterPoints += each.getFrequentRenterPoints();

			// show figures for this rental
			result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(each.getCharge()) + "\n";
			totalAmount += each.getCharge();
		}
		// add footer lines

		result += "Amount owed is " + String.valueOf(getTotalCharge()) + "\n";
		result += "You earned " + String.valueOf(getTotalFrequentRenterPoints()) + " frequent renter points";
		return result;
	}

	private double getTotalCharge() {
		double result = 0;
		Enumeration rentals = _rentals.elements();
		while (rentals.hasMoreElements()) {
			Rental each = (Rental) rentals.nextElement();
			result += each.getCharge();
		}
		return result;
	}

	private int getTotalFrequentRenterPoints() {
		int result = 0;
		Enumeration rentals = _rentals.elements();
		while (rentals.hasMoreElements()) {
			Rental each = (Rental) rentals.nextElement();
			result += each.getFrequentRenterPoints();
		}
		return result;
	}

	private double amountFor(Rental aRental) {
		return aRental.getCharge();
	}

	public String htmlStatement() {
		Enumeration rentals = _rentals.elements();
		String result = "<H1>Rentals for <EM>" + getName() + "</EM></H1><P>\n";
		while (rentals.hasMoreElements()) {
			Rental each = (Rental) rentals.nextElement();
			// show figures for each rental
			result += each.getMovie().getTitle() + ": " + String.valueOf(each.getCharge()) + "<BR>\n";
		}
		// add footer lines
		result += "<P>You owe <EM>" + String.valueOf(getTotalCharge()) + "</EM><P>\n";
		result += "On this rental rental you earned <EM>" + String.valueOf(getTotalFrequentRenterPoints())
				+ "</EM> frequent renter points<P>";

		return result;
	}

}