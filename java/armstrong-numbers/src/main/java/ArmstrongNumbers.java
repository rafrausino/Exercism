import java.util.ArrayList;

public class ArmstrongNumbers {

	boolean isArmstrongNumber(int numberToCheck) {

		int size = numberToCheck;
		int convertSize = String.valueOf(numberToCheck).length();

		int total = 0;
		for (int i = 0; i < convertSize; i++) {
			if (size != 0) {
				int remainder = size % 10;
				total += (int) Math.pow(remainder, convertSize);
				size /= 10;
			}
		}
		return (total == numberToCheck);
	}
}
