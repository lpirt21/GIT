import acm.program.*;
import acm.graphics.*;
import java.awt.*;


public class Assignment6 extends GraphicsProgram{

	public void run() {
		double size = 200;
		double x = (getWidth()-size)/2;
		double y = (getHeight()-size)/2;
		add(drawRect(size,Color.pink,true),x,y);
		
	}
	
	private GRect drawRect(double size, Color color, boolean flag) {
		GRect rect = new GRect(size,size);
		rect.setFilled(flag);
		rect.setColor(color);
		return rect;
	}
}
