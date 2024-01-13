//the art and science of java chapter 2 exercise 5

import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class Ch2Ex5 extends GraphicsProgram{
	
	private static final int HEAD_WIDTH = 150;
	private static final int HEAD_HEIGHT = 300;
	
	private static final int MOUTH_WIDTH = 100;
	private static final int MOUTH_HEIGHT = 30;
	
	private static final int EYE = 30;
	
	private static final int EYE_DX = 20;
	private static final int EYE_DY = 50;
	
	private static final int NOSE_WIDTH = 8;
	private static final int NOSE_HEIGHT = 16;
	
	private static final int MOUTH_DY = 40;
	
	public void run() {
		drawHead();
		drawMouth();
		drawEyes();
		drawNose();
	}
	
	private void drawHead() {
		double x = (getWidth()-HEAD_WIDTH)/2;
		double y = (getHeight() - HEAD_HEIGHT)/2;
		GRect head = new GRect(x, y, HEAD_WIDTH, HEAD_HEIGHT);
		head.setFilled(true);
		head.setFillColor(Color.GRAY);
		add(head);
	}
	
	private void drawMouth() {
		double x = (getWidth() - MOUTH_WIDTH)/2;
		double y = (getHeight() + HEAD_HEIGHT)/2 - MOUTH_DY - MOUTH_HEIGHT;
		GRect mouth = new GRect(x,y,MOUTH_WIDTH, MOUTH_HEIGHT);
		mouth.setFilled(true);
		mouth.setColor(Color.white);
		add(mouth);
	}
	
	private void drawNose() {
		double x = (getWidth() - NOSE_WIDTH)/2;
		double y = (getHeight() - NOSE_HEIGHT)/2;
		GRect nose = new GRect(x,y,NOSE_WIDTH,NOSE_HEIGHT);
		nose.setFilled(true);
		add(nose);
	}
	
	private void drawEyes() {
		double x1 = (getWidth()-HEAD_WIDTH)/2 + EYE_DX;
		double y = (getHeight() - HEAD_HEIGHT)/2 + EYE_DY;
		double x2 = (getWidth() + HEAD_WIDTH)/2 -EYE-EYE_DX;
		GOval eye1 = new GOval(x1,y,EYE,EYE);
		eye1.setFilled(true);
		eye1.setColor(Color.orange);
		add(eye1);
		GOval eye2 = new GOval(x2,y,EYE,EYE);
		eye2.setFilled(true);
		eye2.setColor(Color.orange);
		add(eye2);
	}
}
