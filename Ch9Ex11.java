//the art and science of java chapter 9 exercise 11

import acm.program.*;
import acm.graphics.*;

public class Ch9Ex11 extends GraphicsProgram{

	
	private static final double cube = 151;
	public static final int APPLICATION_HEIGHT = 472;
	
	public void run() {
		for(int i=0; i <5; i++) {
			for(int j = 0; j<3; j++) {
				if((i+j) %3==0 || i+j == 0) {
					add(new GBlock(cube), i*cube,j*cube);
				}else if(i+j == 2 || i+j == 5) {
					add(new GLove(cube), i*cube, j *cube);
				}else if(i+j == 1 || i+j == 4) {
					add(new GNest(cube), i*cube, j*cube);
				}
			}
		}
		
	}
}
