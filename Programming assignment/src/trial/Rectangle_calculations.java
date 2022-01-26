package trial;

public class Rectangle_calculations {

	public Rectangle_calculations() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//calculating perimeter and surface area of a rectangle
		//perimeter is the distance around the sides of a polygon
		//surface area = 2(LW + LH + HW)
		/*surface area is defined as the sum of the areas  of all faces of a 
		 * three dimensional figure*/
		double height = 4.5344; //implicit casting of float to double
		double length = 6.32; //implicit casting of float to double
		double width = 2; //implicit casting of integer to double
		
		double perimeter = 2*(height + length);//compute perimeter of rectangle
		double surface_area = 2*(length*width + length*height + height*width);
	    //above we were just computing the surface area of a rectangle
		
		//Here we do the casting perimeter
		int int_per = (int) ((int)perimeter);
		long long_per = (long) ((long)perimeter);
		short short_per = (short) ((short)perimeter);
		 /* .... explicit casting of a double to a float 
		  * so some decimal points will be lost
		 */
		
		//here we cast the surface area
	    double rounded_surface_area = Math.round(surface_area*10000)/10000.0;
	    int int_surface = (int) ((int)rounded_surface_area);
		long long_surface = (long) ((long)rounded_surface_area);
		short short_surface = (short) ((short)rounded_surface_area);
	    //above we are just rounding to 2 decimal places
	    System.out.println(int_per + " is perimeter as an int");
	    System.out.println(long_per  + " is perimeter as a long");
	    System.out.println(short_per  + " is perimeter as short");
	    System.out.println(perimeter  + " is perimeter as a double");
		System.out.println(int_surface + "metres squared, surface area --> type is int");
		System.out.println(long_surface + "metres squared, surface area --> type is long");
		System.out.println(short_surface + "metres squared, surface area --> type is short");
		System.out.println(rounded_surface_area + "metres squared, surface area --> type is double");
		//above we printed data related to the surface area of the rectangle
		/*JDK (java development kit)
		 * JRE (Java runtime environment --> is a software development environment used for 
		 * developing and running Java applications and applets
		 * JVM (Java virtual Machine)--> is a virtual machine that enables a 
		 * computer to run Java programs as well as programs written in other languages*/
		
		
		
	}

}
