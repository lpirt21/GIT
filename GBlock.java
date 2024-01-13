import acm.graphics.*;
import java.awt.*;


public class GBlock extends GCompound {

	public GBlock(double width) {
		double w = width/9; 
		double c = width;
		for(int i = 0; i<5; i++) {
			GRect rect1 = new GRect(i*w,i*w,(c-w),w);
			GRect rect2 = new GRect(width*((double)(8-i)/9),i*w,w,(c-w));
			GRect rect3 = new GRect(w+ i*w,width*((double)(8-i)/9),(c-w),w);
			GRect rect4 = new GRect(i*w, w+i*w,w,(c-w));
			GRect rect5 = new GRect(4*w, 4*w,w,w);
			rect1.setFilled(true);
			rect2.setFilled(true);
			rect3.setFilled(true);
			rect4.setFilled(true);
			rect5.setFilled(true);
			rect1.setFillColor(Color.green);
			rect2.setFillColor(Color.green);
			rect3.setFillColor(Color.green);
			rect4.setFillColor(Color.green);
			rect5.setFillColor(Color.green);

			add(rect1);
			add(rect2);
			add(rect3);
			add(rect4);
			add(rect5);
			c -= 2*w;
		}
		
	}
}