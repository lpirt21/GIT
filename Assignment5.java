import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class Assignment5 extends GraphicsProgram{

	public void run() {
		int w = getWidth();
		int h = getHeight();
		GLabel label = new GLabel("width: " + w + ", height: " + h);
		label.setFont("London-42");
		label.setColor(Color.red);
		double labelW = label.getWidth();
		double labelH = label.getHeight();
		double x = (w-labelW)/2;
		double y = h/2 -label.getDescent();
		add(label,x,y);
		GLabel label2 = new GLabel("width: " + labelW + ", height: " + labelH + ", x: " + x + ", y: " + y);
		add(label2,0,h-label2.getDescent());
	}
}
