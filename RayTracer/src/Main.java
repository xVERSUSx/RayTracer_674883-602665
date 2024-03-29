import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import utils.RayTracer;


public class Main {

	public static void main(String[] args) {
		File input = new File("./sceneCar.txt");
		File output = new File("./outputCar.bmp");
		RayTracer rt = new RayTracer();
		try {
			rt.readScene(input);
			rt.draw(output);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("TERMINE!!!");
	}

}
