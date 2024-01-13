import java.awt.*;
import acm.graphics.*;

public class Boxcar extends TrainCar {

	public Boxcar(Color color) {
		super(color);
		double xRightDoor = CONNECTOR +CAR_WIDTH/2;
		double xLeftDoor = xRightDoor - DOOR_WIDTH;
		double yDoor = -CAR_BASELINE-DOOR_HEIGHT;
		add(new GRect(xLeftDoor, yDoor,DOOR_WIDTH,DOOR_HEIGHT));
		add(new GRect(xRightDoor, yDoor,DOOR_WIDTH,DOOR_HEIGHT));	
	}

	
	private static final double DOOR_WIDTH = 18;
	private static final double DOOR_HEIGHT = 32;
}
