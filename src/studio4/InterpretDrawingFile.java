package studio4;

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
	
	//ellipse 73 0 146 false 0.5 0.5 0.2 0.2
	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		String shapeType=in.next();
		

         if(shapeType.equals("rectangle")){
        	int redComponent=in.nextInt();
     		int greenComponent=in.nextInt();
     		int blueComponent=in.nextInt();
     		boolean isFilled=in.nextBoolean(); 
     		double parameterOne=in.nextDouble(); 
     		double parameterTwo=in.nextDouble(); 
     		double parameterThree=in.nextDouble(); 
     		double parameterFour=in.nextDouble();
            StdDraw.setPenColor(redComponent, greenComponent,blueComponent);

        	if(isFilled==true)
        	 { 
        		 StdDraw.filledRectangle(parameterOne, parameterTwo, parameterThree, parameterFour);
        	 }
        	else {
        	StdDraw.rectangle(parameterOne, parameterTwo, parameterThree, parameterFour); 
        	 }
         }
         if(shapeType.equals("triangle")){
        	int redComponent=in.nextInt();
      		int greenComponent=in.nextInt();
      		int blueComponent=in.nextInt();
      		boolean isFilled=in.nextBoolean(); 
      		double parameterOne=in.nextDouble(); 
      		double parameterTwo=in.nextDouble(); 
      		double parameterThree=in.nextDouble(); 
      		double parameterFour=in.nextDouble();
      		double parameterFive=in.nextDouble();
      		double parameterSix=in.nextDouble();
      		double[] a = new double[3];
      		double[] b = new double[3];
      		a[0]=parameterOne;
      		b[0]=parameterTwo;
      		a[1]=parameterThree;
      		b[1]=parameterFour;
      		a[2]=parameterFive;
      		b[2]=parameterSix;
        	if(isFilled==true)
        	 {
        		 StdDraw.filledPolygon(a, b);
        	 }
        	else {
        		 StdDraw.polygon(a, b);
        	 }
         }
         
 }
		
		  
		
		
	}

