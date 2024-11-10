// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    
		int	fullNumber = Integer.parseInt(args [0]) ;

		int hundreds = fullNumber / 100;
		int tens = (fullNumber - hundreds * 100)/10;
		int ones = fullNumber - hundreds * 100 - tens * 10;

		System.out.println(hundreds + " hundreds, " + tens + " tens, and " + ones + " ones.");
	}
}
