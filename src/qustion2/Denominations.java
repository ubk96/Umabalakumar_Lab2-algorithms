package qustion2;
import java.util.Scanner;
import qustion2.MergeSorting;

public class Denominations {

	public static void main(String[] args) {
		MergeSorting me = new MergeSorting();
		try(Scanner sc = new Scanner(System.in)){
			int size,amount = 0;
			
			//Currency denominations
			System.out.println("Enter the size of currency denominations");
			size = sc.nextInt();
			int arr[] = new int[size];
			int denomi[] = new int[size+1];
			
			//Currency denomination values
			System.out.println("Enter the currency denominations value");
			for (int i=0; i<size; i++) {
				arr[i] = sc.nextInt();
			}
			
			//Amount want to paid
			System.out.println("Enter the amount you want to pay");
			amount = sc.nextInt();
			
			me.mergeSort(arr, 0, size-1);
			
			for (int i=0; i<size; i++) {
	            if(amount >= arr[i]) {
	                denomi[i] = amount / arr[i];
	                amount = amount % arr[i];
	            }
	        }
			
			System.out.println("Your payment approach in order to give min no of notes will be");
			for(int i=0; i<size; i++) {
				if(denomi[i] != 0) {
					System.out.println(arr[i] + ":" + denomi[i]);
				}
			}
		}
	}

}
