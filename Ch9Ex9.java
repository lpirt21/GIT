//the art and science of java chapter 9 exercise 9

import acm.program.*;
import acm.graphics.*;

public class Ch9Ex9 extends GraphicsProgram{

	public void run() {
		double days = getWidth()/19;
		drawDays(getWidth(),days);
		drawCalendar(getWidth(), getHeight() - days);
		
	}
	

	
	private void drawCalendar(double width, double height) {
		double start = getWidth()/19;
		double dy = (getHeight()-start)/6;
		double dx = getWidth()/7;
		for(int i =0; i<7; i++) {
			for(int j=0; j<6; j++) {
				add(new GLine(0,start +j*dy, getWidth(),start + j*dy));
				add(new GLine(i*dx,start, i*dx, getHeight()));  
			}
		}
		int f = DAY_MONTH_STARTS;
		for(int l =0; l<DAY_IN_MONTH;l++) {
			int k = f%7;
			f++;
			add(numbers(l+1), k*dx, (1+((l+DAY_MONTH_STARTS)/7))*dy);
			}
	}
	
	
	private GLabel numbers(int n) {
	  switch(n) {
	    default: return new GLabel(" " + n + "");
	  }
  }
	
	
	
	private void drawDays(double width, double height) {
		double dw = width/7;
		for(int i =0; i<7 ; i++) {
		double dx = (width/7 - label(i).getWidth())/2;	
	    double dy = height - (label(i).getHeight()+label(i).getDescent())/2;
		add(label(i),dw*i +dx,dy);
		
		}
	}
	
	private GLabel label(int n) {
		switch(n) {
		case 0 : return new GLabel("SUN");
		case 1 : return new GLabel("MON");
		case 2 : return new GLabel("TUE");
		case 3 : return new GLabel("WED");
		case 4 : return new GLabel("THU");
		case 5 : return new GLabel("FRI");
		case 6 : return new GLabel("SAT");
		default : return new GLabel("null");
		}
	}
	
	
	private static final int DAY_IN_MONTH = 31;
	private static final int DAY_MONTH_STARTS = 4;
	
}






