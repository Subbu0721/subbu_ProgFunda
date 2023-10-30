package question2;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		//input for Number
		System.out.println("Enter the Number");
		int num1 = scanner.nextInt();

		//input for power
		System.out.println("Enter the Power");
		int num2 = scanner.nextInt();
		scanner.close();

		//creating an object of PowerOfNumber_Recursion class 
		PowerOfNumberRecursion obj = new PowerOfNumberRecursion();

		//printing the output by calling power method from PowerOfNumber_Recursion class by passing the arguments
		System.out.println(obj.power(num1, num2));
	}
}


