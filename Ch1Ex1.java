//the art and science of java chapter 1 exercise 1

import acm.program.*;
import acm.graphics.*;

public class Ch1Ex1 extends GraphicsProgram{
		public void run() {
			GLabel label = new GLabel("I love java!");
			label.setFont("Serif-50");
			double x = (getWidth() - label.getWidth())/2;
			double y = (getHeight() - label.getHeight())/2 ;
			add(label,x,y);
			GLabel signature = new GLabel("Lizi Pirtskhalava");
			double xS = getWidth() - signature.getWidth();
			double yS = getHeight() - signature.getHeight();
			add(signature,xS,yS);
		}
}
