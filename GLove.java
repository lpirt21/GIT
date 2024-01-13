import acm.graphics.*;
import java.awt.*;


public class GLove extends GCompound {
		
	public GLove(double width) {
	double r = width/3.6;
		GRect rect = new GRect(0,0, width,width);
		Color pink = new Color(255,191,204);
		rect.setFilled(true);
		rect.setFillColor(pink);
		add(rect);
		
		GPolygon heart = createHeart(r);
		double hx =width - (width - heart.getWidth())/0.5;
		double hy = 85;
		add(heart,hx,hy);
		
		jText(r,hx,hy);
	}
	private void jText(double r,double x , double y) {
		GLabel me = new GLabel("I");
		me.setFont("Helvetica-20");
		me.setColor(Color.white);
		add(me,x-r*Math.sqrt(2),y - me.getHeight());
		GLabel lov = new GLabel("Love");
	    lov.setFont("Helvetica-20");
		lov.setColor(Color.white);
		add(lov,x-r*Math.sqrt(2) - lov.getWidth()/2,y-lov.getDescent());
		GLabel java = new GLabel("Java!");
		java.setFont("Helvetica-20");
		java.setColor(Color.white);
		add(java,x-r*Math.sqrt(2) - java.getWidth()/2,y + java.getAscent());
	}

	private GPolygon createHeart(double r) {
		GPolygon poly = new GPolygon();
		poly.addArc(2*r,2*r,-45,180);
	    poly.addArc(2*r,2*r,45,180);
	    poly.addPolarEdge(2*r,-45);
	    poly.addPolarEdge(2*r, 45);
	    poly.setFilled(true);
	    poly.setColor(Color.red);
	    return poly;
	}
}
