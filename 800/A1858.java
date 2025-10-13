import java.util.Scanner;

public class ButtonGame {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt(); // Number of test cases
		while (t-- > 0) {
			long a = scanner.nextLong(); // Buttons only Anna can press
			long b = scanner.nextLong(); // Buttons only Katie can press
			long c = scanner.nextLong(); // Buttons either can press

			// Check if the number of buttons that can be pressed by either is odd
			if (c % 2 == 1) { // odd
				// If c is odd, the player with more exclusive buttons will win
				if (b > a) {
					System.out.println("Second"); // Katie wins
				} else {
					System.out.println("First"); // Anna wins
				}
			} else { // even
				// If c is even, the player with more exclusive buttons will win
				if (a > b) {
					System.out.println("First"); // Anna wins
				} else {
					System.out.println("Second"); // Katie wins
				}
			}
		}
		scanner.close();
	}
}

// Time Complexity (TC): O(1)
// Space Complexity (SC): O(1)