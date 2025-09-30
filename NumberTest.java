import java.util.Scanner;

public class NumberTest {
public static void main(String[] args) {
        // Create the Scanner 
        Scanner input = new Scanner(System.in);
        // Ask for an integer
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        // Check if the number is divisible by 5
        if (number % 5 == 0) {
            System.out.println("HiFive");
        }

        // Check if the number is divisible by 2
        if (number % 2 == 0) {
            System.out.println("HiEven");
        }

        // Finish
        input.close();
    }
}
