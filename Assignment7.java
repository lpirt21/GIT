import acm.program.*;

import java.awt.Color;

import acm.graphics.*;


public class Assignment7 extends GraphicsProgram{

	public void run() {
		double x=0;
		for(int i =1; i<6; i++) {
			int size = fibonacci(i)*10;
			add(drawRect(size),x,0);
			x += size + 10;
		}
	}
	
	private GRect drawRect(double size) {
		GRect rect = new GRect(size,size);
		return rect;
	}
	
	private int fibonacci(int n) {
		int f1 = 0;
		int f2 = 1;
		int fi = 0;
		for(int i = 0; i < n; i++) {
			fi = f1 + f2;
			f1 = f2;
			f2 = fi;
		}
		return f1;
	}
}
