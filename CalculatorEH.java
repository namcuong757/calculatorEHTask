package CoreJava9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorEH implements Calculator{
	public CalculatorEH() {};
	
	@Override
	public void calculator()
	{
		Scanner scanner = new Scanner(System.in);
        int cont = 0;

        do {
            try {
                System.out.print("Enter num1: ");
                int num1 = scanner.nextInt();
                System.out.print("\nEnter num2: ");
                int num2 = scanner.nextInt();

                scanner.nextLine();
                System.out.print("\nEnter operation: ");
                String operation = scanner.nextLine();

                switch (operation) {
                    case "+":
                        int sum = num1 + num2;
                        System.out.print("\nSum: " + sum);
                        break;
                    case "-":
                        int minus = num1 - num2;
                        System.out.print("\nMinus: " + minus);
                        break;
                    case "*":
                        int multi = num1 * num2; // Fixed multiplication operator
                        System.out.print("\nMultiply: " + multi);
                        break;
                    case "/":
                        int quotient = num1 / num2; // Fixed division operator
                        System.out.print("\nQuotient: " + quotient);
                        break;
                    case "%":
                        int mod = num1 % num2;
                        System.out.print("\nModule: " + mod);
                        break;
                    default:
                        System.out.print("\nOperation not available");
                }
            } catch(InputMismatchException im){
            	System.out.println("Error: Please enter numbers only");
            	scanner.next();
            }
            catch (Exception e) {
                System.out.println("Error: " + e);
            }
            System.out.print("\nWant to repeat? Enter 0 for Yes, any other number for No: ");
            cont = scanner.nextInt();
            scanner.nextLine(); 

        } while (cont == 0);

        scanner.close();
		
	}
}
