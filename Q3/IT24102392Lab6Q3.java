import java.util.Scanner;
public class IT24102392Lab6Q3 
{
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
        double sumOfSquares = 0;
        int count = 0;

        System.out.println("Enter positive integers (terminate input with -99):");

        while (true) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            if (number == -99) {
                break;
            }

            if (number < 0) {
                System.out.println("Invalid input. Please enter a positive integer or -99 to terminate.");
                continue;
            }

            sumOfSquares += Math.pow(number, 2);
            count++;
        }

        if (count > 0) {
            double rms = Math.sqrt(sumOfSquares / count);
            System.out.printf("The Root Mean Square (RMS) is: %.10f\n", rms);
        } else {
            System.out.println("No positive numbers entered.");
        }

        scanner.close();
    }
}