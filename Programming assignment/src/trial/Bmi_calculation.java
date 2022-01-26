package trial;

public class Bmi_calculation {

	public Bmi_calculation() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// I am to write a program that calculates the bmi of a person(Body_Mass_Index)
		//lets assume his weight is 85kg and 2.1metres tall
		String Name = "Micheal";// the name of the user is Micheal
		System.out.println(Name + " data related to your body mass index is stated below");
		// above we concatenated the name of user with the informative prompt from the program
		var weight = 85;//weight in kg
		var height = 2.1;//height in m 
		/*formula for calculating bmi is (weight/height**2) or (weight/(height*height)) */
		var b_m_i = weight/(height*height);//calculating bmi here
		double rounded_bmi = Math.round(b_m_i*100)/100.0;//rounding answer to two decimal places
		System.out.println(weight +"kg is your weight");
		System.out.println(height +"m is your height");
		System.out.println("Upon calculation your bmi evaluates to " + rounded_bmi );
		//printing the data for Micheal 
		
	}

}
