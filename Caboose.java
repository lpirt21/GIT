import java.awt.*;
import acm.graphics.*;

public class Caboose extends TrainCar {

	public Caboose() {
		super(Color.red);
		double x0 =   CONNECTOR + (CAR_WIDTH - CUPOLA_WIDTH)/2;
		double y0 =  CAR_BASELINE - CAR_HEIGHT-CUPOLA_HEIGHT;
		GRect rect = new GRect(x0,y0,CUPOLA_WIDTH,CUPOLA_HEIGHT);
		rect.setFilled(true);
		rect.setFillColor(Color.RED);
	}
	
	
	private static final double CUPOLA_WIDTH = 35;
	private static final double CUPOLA_HEIGHT = 8;


}
