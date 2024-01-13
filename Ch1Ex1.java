//the art and science of java chapter 1 exercise 1

import acm.program.*;
import acm.graphics.*;

public class Ch1Ex1 extends GraphicsProgram{
	public void run() {
		GLabel label = new GLabel("I love java!");
		label.setFont("Serif-50");
		double width = label.getWidth();
		double height = label.getHeight()/2;
		double x = (getWidth()-width)/2;
		double y = (getHeight()-height)/2 ;
		add(label,x,y);
		GLabel signature = new GLabel("Lizi Pirtskhalava");
		signature.setFont("Helvetica-10");
		double sWidth = signature.getWidth();
		double sHeight = signature.getHeight();
		double xS = getWidth() - sWidth;
		double yS = getHeight() - sHeight;
		add(signature,xS,yS);
	}
}
