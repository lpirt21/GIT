import acm.program.*;

import java.awt.Color;

import acm.graphics.*;


public class Assignment7 extends GraphicsProgram{

	public void run() {
		drawNine();
	}
	
	private void drawNine() {
		double x=0;
		double y = 0;
		int size = fibonacci(7)*10;
		add(drawRect(size),x,y);
		x = size;
		size = fibonacci(6)*10;
		add(drawRect(size),x,y);
		y+=size;
		size = fibonacci(3)*10;
		add(drawRect(size),x,y);
		y+=size;
		size = fibonacci(4)*10;
		add(drawRect(size),x,y);
		y -=fibonacci(3)*10;
		x += fibonacci(3)*10;
		size = fibonacci(2)*10;
		add(drawRect(size),x,y);
		y+=size;
		size = fibonacci(1)*10;
		add(drawRect(size),x,y);
		x+=size;
		y-=size;
		size = fibonacci(5)*10;
		add(drawRect(size),x,y);
		x+=size;
		y-=fibonacci(6)*10;
		size = fibonacci(8)*10;
		add(drawRect(size),x,y);
	}
	
	private void amountThatFits() {
		double x=0;
		for(int i =1;;i++) {
			int size = fibonacci(i)*10;
			if((x+size)>getWidth())break;
			add(drawRect(size),x,0);
			x += size;
		}
	}
	
	
	private void drawFive() {
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
