// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		
	    String name1 = args[0];
		String name2 = args[1];
		String name3 = args[2];
		
		Double sum1 = Double.parseDouble(args[3]);

		Double sumForEachOne = sum1 / 3;
		Double finalSum = Math.ceil(sumForEachOne);
		System.out.println("Dear " + name3 + ", " + name2 + ", and " + name1 + ": pay " + finalSum + " Shekels each");

	    
	}
}
