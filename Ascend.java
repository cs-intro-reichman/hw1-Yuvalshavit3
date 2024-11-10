// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int lim = Integer.parseInt(args[0]);

		int a = (int) (lim * Math.random());
		int b = (int) (lim * Math.random());
		int c = (int) (lim * Math.random());
	
		//finds minimum of a,b,c
		int min = Math.min(Math.min(a,b), c);

		//finds max of a,b,c
		int max = Math.max(Math.max(a,b), c);

		//finds middle value of a,b,c
		int middle = a + b + c - min - max;

		System.out.println(a + " " + b + " " + c);
		System.out.println(min + " " + middle + " " + max);



	}
}
