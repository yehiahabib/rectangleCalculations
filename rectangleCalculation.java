import java.util.Scanner;

public class rectangleCalculation {
  
  public static void main(String[] args) {
    
	Scanner kbinput = new Scanner(System.in); 	// Creates a scanner object kbinput
    System.out.print("Enter the width and height of a rectangle: ");    // Outputs prompt to user
    
	double height = kbinput.nextDouble();		// creates a variable height to store the input of a double from the keyboard
    double width = kbinput.nextDouble();		// creates a variable width to store the input of a double from the keyboard
    double perimeter = 2 * height + 2 * width; 	// creates a variable perimeter to store the value of ((2*height)+(2*width))
    
	System.out.println("The perimeter is " + perimeter);	// Outputs perimeter to user
    
	double area = height * width;					// creates a variable area to store the value of height times width
    
	System.out.println("The area is " + area);			// Outputs area to user
    
	double diagonal = Math.sqrt(Math.pow(height, 2) + Math.pow(width, 2));// creates variable diagonal to start the value of the square root of (height^2+width^2)
    
	System.out.println("The length of the diagonal is " + diagonal);// outputs length of diagonal to user
    
	kbinput.close(); //closes user input
  }
}
