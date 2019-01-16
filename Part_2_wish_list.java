package problem_3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Part_2_wish_list {
	
	public static boolean isNumeric(String str)
	{
	    for (char c : str.toCharArray())
	    {
	        if (!Character.isDigit(c)) return false;
	    }
	    return true; }

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many items do you want in your wish list?");
		String item_amount = input.nextLine();
				
		
		if (isNumeric(item_amount) == false) {
			System.out.println("That is not a number, please enter a number and try again.");
			main(args);
		}
		else if (isNumeric(item_amount) == true) {
			int item_amount_float = Integer.parseInt(item_amount);
		
			if (item_amount_float > 2) {
				int item_amount_float = 2;
				
			Map<String, String> map = new HashMap<String, String>();
			IntStream.range(0, item_amount_float).forEach(
					i -> {
						Scanner item_name_input = new Scanner(System.in);
						System.out.println("What is the name of item number " + i + " ?");
						String item_name = item_name_input.nextLine();

						Scanner item_price_input = new Scanner(System.in);
						System.out.println("What is the price of item number " + i + " ?");
						String item_price = item_price_input.nextLine();
						
						map.put(item_name, item_price);
						System.out.println(Arrays.asList(map));

				    }
			);
		
			}
		}
		
	}
}



