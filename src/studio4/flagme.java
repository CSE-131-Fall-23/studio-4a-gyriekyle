package studio4;
import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class flagme {

	public static void main(String[] args) {
		
		Color pen = new Color (100,40,70);
		
		StdDraw.setPenColor(pen);
		
		StdDraw.filledRectangle(0.5, 0.5, 0.4, 0.4);
		StdDraw.setPenColor(Color.PINK);
		
		StdDraw.filledCircle(0.5, 0.5, 0.15); 
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.filledCircle(0.5, 0.5, 0.11); 
	}

}
