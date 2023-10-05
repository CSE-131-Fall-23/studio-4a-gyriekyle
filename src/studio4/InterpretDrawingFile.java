package studio4;
import java.util.Scanner;
import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		String shapetype = in.next();
		int red = in.nextInt();
		int green = in.nextInt();
		int blue = in.nextInt();
		String isfilled = in.next();
		double xcenter = in.nextDouble();
		double ycenter = in.nextDouble();
		double halfwid = in.nextDouble();
		double halflen = in.nextDouble();
		Color pen = new Color (red, green, blue);
		StdDraw.setPenColor(pen);
		if (isfilled == "false") {
			StdDraw.rectangle(xcenter, ycenter, halfwid, halflen);
		}
		else {
			StdDraw.filledRectangle(xcenter, ycenter, halfwid, halflen);
		}
		
		
	}
}
