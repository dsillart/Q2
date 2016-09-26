package Q1;
import java.util.Scanner;

public class TuitionCost {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	
		System.out.print("Enter the annual tuition: ");
			double tuition = input.nextDouble();
			
		System.out.print("Enter first year tuition interest rate (0-100%): ");
			double interestrate1 = 1+(input.nextDouble()/100);
		System.out.print("Enter second year tuition interest rate (0-100%): ");
			double interestrate2 = 1+(input.nextDouble()/100);
		System.out.print("Enter third year tuition interest rate (0-100%): ");
			double interestrate3 = 1+(input.nextDouble()/100);
			
			double tuition1 = tuition * interestrate1;
			double tuition2 = tuition1 * interestrate2;
			double tuition3 = tuition2 * interestrate3;
			double tuitionfinal = tuition + tuition1 + tuition2 + tuition3;

			System.out.print("The total tuition over four years will be $");
			System.out.printf("%7.2f" + ".", tuitionfinal);
			}
	}