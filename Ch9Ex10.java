//the art and science of java chapter 9 exercise 10

import acm.program.*;
import acm.graphics.*;


public class Ch9Ex10  extends GraphicsProgram{

	
	public void run() {
		double ovalr = getHeight()/20;
		double dx = 20;
		for(int i = 0; i <8; i++) {
			 for(int j = 0; j <= i; j++) {
				 int n = (int)combinations(i,j);
				 GOval oval = new GOval(getWidth()/2 - ovalr,10, ovalr*2, ovalr*2);
				 double ovalx =getWidth()/2 +1.6*ovalr*(2*j - i);
				 double ovaly =  dx+i*2.5*ovalr;
				add(oval,ovalx,ovaly);
				add(label(n),ovalx +ovalr- label(n).getWidth()/2, ovaly +ovalr + label(n).getAscent()/2.5);
			 }
		 }
	
	}
	
	
	private GLabel label(int n) {
		String str  = "";
		switch(n) {
		 default : str = ("" + n + "");break;
		}
		GLabel label = new GLabel(str);
		label.setFont("Helvetica-19");
		return label;
	}

	
	private double combinations(int n, int k) {
		return factorial(n)/(factorial(k)*factorial(n-k));
		
	}
	
	private int factorial(int n) {
		int result = 1;
		for(int i = 1; i <=n; i ++) {
			result*=i;
		}
		return result;
	}
	
}


