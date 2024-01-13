//the art and science of java chapter 11 exercise 12

import acm.graphics.*;
import acm.program.*;


public class Ch11Ex12 extends GraphicsProgram {
	
	private static final String imageName ="";
	
	public void run() {
		GImage image = new GImage(imageName);
		GImage newimage =flipHorizontal(image);
		image.setSize(getWidth(),getHeight());
		newimage.setSize(getWidth(),getHeight());
		add(newimage);
	}	
	
	private GImage flipHorizontal(GImage image) {
		int[][] pixelArray = image.getPixelArray();
		int height = pixelArray.length;
		int width = pixelArray[0].length;
		for(int i =0; i < height; i++) {
			for(int p1 =0; p1 < width/2; p1++) {
			int p2 = pixelArray[0].length - p1-1;
			int temp = pixelArray[i][p1];
			pixelArray[i][p1] = pixelArray[i][p2];
			pixelArray[i][p2] = temp;
			}
		}
		return new GImage(pixelArray);

	}
	
}

