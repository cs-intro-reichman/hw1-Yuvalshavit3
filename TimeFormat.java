// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		// In Java, the command-line arguments args[0], args[1], ... are represented
		// each by a string. In this program, the single "hh:mm" input is represented
		// by the single command-line string argument args[0]. 
		//   
		// The following statement handles the hours part of the input.
		// It concatenates the empty string "" with the leftmost hour-digit. 
		// It then concatenates the resulting string with the rightmost hour-digit,
		// and then uses parseInt to cast the resulting string as an int.
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		// Does the same with the minutes part of the input.
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        
		String minutesToPrint;

		//adds 0 to the total minutes value to minutes smaller than 10 (turns 9 to 09)
		if (minutes < 10) {
			minutesToPrint = "0" + String.valueOf(minutes);
		} else {
			minutesToPrint = String.valueOf(minutes);
		}

		//turns hour to AM\PM format (turn 21 to 9)
		Integer hoursToPrint;
		if (hours > 12) {
			hoursToPrint = hours - 12;
		} else {
			hoursToPrint = hours;
		}

		// decides between AM and PM
		String AmPm;
		if (hours > 12) {
			AmPm = "PM";
		} else {
			AmPm = "AM";
		}

		System.out.println(hoursToPrint + ":" + minutesToPrint + " " + AmPm);
		
	}
}