//the art and science of java chapter 4 exercise 14

import acm.program.*;
import java.awt.*;
import acm.graphics.*;

public class Ch4Ex14 extends GraphicsProgram{
	
	private static final int ROWS = 8;
	private static final int COLLUMNS = 8;
	
	public void run() {
		double size = (double)getHeight()/ROWS;
		double circle = (size - 8);
		double x = (getWidth() - COLLUMNS*size)/2;
		drawTable(size,x);
		double dx = (size-circle)/2;
		drawOvals(circle,size,dx,x,3,Color.orange);
		drawOvals(circle,size,dx,x,8,Color.black);
	}
	
	private void drawTable(double size,double x) {
		for(int i=0; i<COLLUMNS; i++) {
			for(int j=0; j< ROWS; j++) {
				double x1 = x + i*size;
				double y = j*size;
				GRect rect = new GRect(x1,y,size,size);
				rect.setFilled((j+i)%2 !=0);
				rect.setFillColor(Color.gray);
				add(rect);
			}
		}
	}
	
	private void drawOvals(double size,double square, double dx,double x,int num,Color color) {
		 double x1 =0;
		 for(int k = num - 3; k<num; k++) {
			for(int l = 0 ; l< 8; l+=2) {
				if(k%2!=0) {
			     x1 = x+ l * square + dx;
				}else {
					x1 = x+ (l+1)* square + dx;
				}
			 double y = square * k + dx;
			 GOval oval = new GOval(x1,y,size,size);
			 oval.setFilled(true);
			 oval.setFillColor(color);
			 add(oval);
			}
		}	
	}
}
