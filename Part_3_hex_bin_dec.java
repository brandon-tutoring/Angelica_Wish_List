package problem_3;

import java.util.Scanner;

public class Part_3_with_list {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a hex (0x) or binary (0b) number:");
		String item_input = input.nextLine();
		
		if 
		
		if (item_input.startsWith("0b")){
			System.out.println(Integer.parseInt(item_input,2)); 
		}
		
		else if (item_input.startsWith("0x")){
			System.out.println(Integer.parseInt(item_input,16));  
		}
		
		else {
			System.out.println("I don't know how to covert that number.");
		}
	}

}
