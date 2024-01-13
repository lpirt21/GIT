
import java.awt.Color;

import acm.graphics.*;

public class GStar extends GPolygon {
	
	public GStar(double width) {
		double dx = width/2;
		double dy = dx * GMath.tanDegrees(18);
		double edge = dx - dy *GMath.tanDegrees(36);
		addVertex(-dx,-dy);
		double angle = 0;
		for(int i = 0; i <5; i++) {
			addPolarEdge(edge, angle);
			addPolarEdge(edge,angle+72);
			angle-=72; 
		}
	}


	public GStar (double width, boolean flag) {
		this(width);
		setFilled(true);
	}
	

	public GStar (double width, Color color) {
		this(width);
		setColor(color);
	}
	
	public GStar (double width, boolean flag, Color color) {
		this(width);
		setFilled(true);
		setColor(color);
	}
}
