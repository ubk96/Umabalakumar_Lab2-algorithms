package Qustion1;
import java.util.Scanner;

public class PayMoney {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
		System.out.println("Enter the size of transaction array");
		int size = sc.nextInt();
		int target, target_value, flag =0, amount = 0;
		
		//Getting size for array
		int arr[] = new int[size];
		
		//Transactions amount values
		System.out.println("Enter the values of array");
		for(int i=0; i<size;i++) {
			arr[i] = sc.nextInt();
		}
		
		//Getting total number target to be achived	
		System.out.println("Enter the total no of targets that needs to be achieved");
			target = sc.nextInt();
			
			//Target Amount Value
			System.out.println("Enter the value of target");
			target_value = sc.nextInt();
			
			for(int i=0; i<size ;i++) {
				if(i+1 <= target) {
					if(amount < target_value) {
					    amount = amount + arr[i];
						flag++;
					}
				}
				
			}
			
			//Check the target meet out
			if((flag <= target) && (amount >= target_value)) {
				System.out.printf("Target achieved after %d transactions", flag);
			}else {
				System.out.println("Given target is not achieved");
			}
		}
	}

}
