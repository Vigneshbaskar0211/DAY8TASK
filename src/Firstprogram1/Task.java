package Firstprogram1;

public class Task {

	public static void main(String[] args) {
        // Declare and initialize four integer variables
        int a = 10;
        int b = 15;
        int c = 7;
        int d = 8;

        // Calculate the sums of a + b and c + d
        int sumAB = a + b;
        int sumCD = c + d;

        // Check if the sum of a and b is greater than the sum of c and d
        if (sumAB > sumCD) {
            System.out.println("The sum of a and b is greater than the sum of c and d.");
        } else {
            System.out.println("The sum of a and b is not greater than the sum of c and d.");
        }
    }
}
