// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		
	    String name1 = args[0];
		String name2 = args[1];
		String name3 = args[2];
		
		double sum1 = Double.parseDouble(args[3]);

		double sumForEach = Math.ceil(sum1 / 3);

		String formattedSum = String.format("%.1f", sumForEach);

		System.out.println("Dear " + name3 + ", " + name2 + ", and " + name1 + ": pay " + sumForEach + " Shekels each.");

	    
	}
}
