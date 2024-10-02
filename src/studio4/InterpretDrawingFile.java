package studio4;

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
		

		
		  StdDraw.setCanvasSize(400, 400);
	        StdDraw.setXscale(0, 1);
	        StdDraw.setYscale(0, 1);
	        StdDraw.setPenColor(Color.CYAN);
	        
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		String c = in.next();
		int a = in.nextInt();
		int b = in.nextInt();
		int d = in.nextInt();
		boolean halfHeight = in.nextBoolean();
		double x = in.nextDouble();
		double y = in.nextDouble();
		double halfWidth = in.nextDouble();
		double z = in.nextDouble();
		
		
		
	
	}
}
