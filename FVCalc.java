// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){

		Integer currentValue = Integer.parseInt(args[0]);
		Double rate = Double.parseDouble(args[1]) / 100;
		Integer n = Integer.parseInt(args[2]);

		Double futureValue = currentValue * Math.pow((1+rate), n);

		System.out.println("After " + n + " years, a $" + currentValue + " saved at " + rate * 100 + "% will yield $" + (int) futureValue.doubleValue());

	}
}