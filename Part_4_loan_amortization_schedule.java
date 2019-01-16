package problem_3;

import java.util.Scanner;

public class Part_4_Wish_List {

	public static void main(String[] args) {
		
		Scanner loan_input = new Scanner(System.in);
		System.out.println("What is the loan amount?");
		String loan_amount_input = loan_input.nextLine();
		int loan_amount = Integer.parseInt(loan_amount_input);
		
		Scanner year_input = new Scanner(System.in);
		System.out.println("What is the the number of years?");
		String year_amount_input = year_input.nextLine();
		int year_amount = Integer.parseInt(year_amount_input);
		
		Scanner interest_input = new Scanner(System.in);
		System.out.println("What is the interest rate?");
		String interest_rate_input = interest_input.nextLine();
		int interest_rate = Integer.parseInt(interest_rate_input);
		
		int months = 12 * year_amount;
		int monthly_payment = loan_amount * (interest_rate * (1 + interest_rate)^ months/(1 + interest_rate)^ months - 1);
		
		int c = 0;
		while (c < months) {
			int interest = interest_rate * loan_amount;
			int principal = monthly_payment - interest;
			int balance = loan_amount - principal;
			c += 1;
			System.out.println("Payment #" + "\t\t" + "Interest" + "\t\t" + "Principal" + "\t\t" + "Balance");
			System.out.println(c + "\t\t" + interest + "\t\t" + principal + "\t\t" + balance);
		}
		
	}

}
