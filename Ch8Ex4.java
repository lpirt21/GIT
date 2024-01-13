//the art and science of java chapter 8 exercise 4

import acm.program.*;
import acm.util.*;

public class Ch8Ex4 extends ConsoleProgram{
	
	RandomGenerator rgen = RandomGenerator.getInstance();
	
	public void run() {
		println("This program writes a date you enter.");
	    int day = readInt("Enter the day: ");
	    int month = readInt("Enter a month: ");
		int year = readInt("Enter the year: ");
		if(month>0 && month<13 && returnDay(month, day)) {
		println(createDateString(day, month, year));
		}else {
			println("The month or the day you entered doesn't exist.");
		}
	}
	
	private String createDateString(int day, int month, int year) {
		String ye = Integer.toString(year);
		int m = ye.length();
		ye = ye.substring(m-2);
		return day + "-" + returnMonth(month) + "-" + ye;
	}
	
	
	private String returnMonth(int n) {
		switch(n) {
		case 1 : return "Jan";
		case 2 : return "Feb";
		case 3 : return "Mar";
		case 4 : return "Apr";
		case 5 : return "May";
		case 6 : return "Jun";
		case 7 : return "Jul";
		case 8 : return "Aug";
		case 9 : return "Sep";
		case 10 : return "Opt";
		case 11 : return "Nov";
		case 12 : return "Dec";
		default : return "This month doesn't exist";
		}
	}
	

	private boolean returnDay(int month, int day) {
		switch(month) {
		case 1 : return (0<day && day<=31);
		case 2 : return (0<day && day<=28);
		case 3 : return (0<day && day<=31);
		case 4 : return (0<day && day<=30);
		case 5 : return (0<day && day<=31);
		case 6 : return (0<day && day<=30);
		case 7 : return (0<day && day<=31);
		case 8 : return (0<day && day<=31);
		case 9 : return (0<day && day<=30);
		case 10 : return (0<day && day<=31);
		case 11 : return (0<day && day<=30);
		case 12 : return (0<day && day<=31);
		default : return false;
		}
	}
}

