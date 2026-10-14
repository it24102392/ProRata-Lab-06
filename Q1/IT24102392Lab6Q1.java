import java.util.Scanner;

    public class IT24102392Lab6Q1 
	{
        public static void main(String[] args)
		{
           Scanner scanner = new Scanner(System.in);
        double number;
		System.out.print("Enter a number: ");
        number = scanner.nextDouble();
      
		double square;
		double squareRoot;
        square = Math.pow(number, 2);
        squareRoot = Math.sqrt(number);

        System.out.println("The square of " + number + " is: " + square);
        System.out.println("The square root of " + number + " is: " + squareRoot);
    }
}