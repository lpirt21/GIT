//the art and science of java chapter 11 exercise 12

import acm.graphics.*;
import acm.program.*;

public class Ch11Ex13 extends GraphicsProgram {
	
	private static final String imageName ="";
	
	public void run() {
		GImage image = new GImage(imageName);
		GImage newimage =rotateLeft(image);
		image.setSize(getWidth(),getHeight());
		newimage.setSize(getWidth(),getHeight());
		add(newimage);
	}	
	
	private GImage rotateLeft(GImage image) {
		int[][] pixelArray = image.getPixelArray();
		int height = pixelArray.length;
		int width = pixelArray[0].length;
		int[][] newPixel = new int[width][height];
		for(int i =0; i < height; i++) {
			for(int p1 =0; p1 < width; p1++) {
			int p2 = height/2 - width/2 + p1-1;
			int temp = pixelArray[i][p1];
			newPixel[p2][i] = temp;
			}
		}
		return new GImage(newPixel);

	}
	
}
