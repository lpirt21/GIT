
//the art and science of java chapter 9 exercise 13


import acm.graphics.GCompound;
public class Train extends GCompound {
	
public Train(){
	
}

public void append(TrainCar car) {
	double width = getWidth();
	double x = (width == 0)? 0 : width - TrainCar.CONNECTOR;
	add(car,x,0);
}
}
