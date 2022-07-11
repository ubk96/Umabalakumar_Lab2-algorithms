package qustion2;
import java.util.Scanner;
//import qustion2.MergeSorting;

public class Denominations {

	static void merge(int arr[], int beg, int mid, int end)    
	{    
	    int i, j, k;  
	    int n1 = mid - beg + 1;    
	    int n2 = end - mid;    
	      
	    int LeftArray[] = new int[n1];
	    int RightArray[] = new int[n2];  
	      
	    for (i = 0; i < n1; i++) {   
	        LeftArray[i] = arr[beg + i]; 
	    }
	    
	    for (j = 0; j < n2; j++) {
	    	RightArray[j] = arr[mid + 1 + j];
	    }
	      
	    i = 0; 
	    j = 0;  
	    k = beg; 
	      
	    while (i < n1 && j < n2)    
	    {    
	        if(LeftArray[i] <= RightArray[j])    
	        {    
	            arr[k] = LeftArray[i];    
	            i++;    
	        }    
	        else    
	        {    
	            arr[k] = RightArray[j];    
	            j++;    
	        }    
	        k++;    
	    }    
	    while (i<n1)    
	    {    
	        arr[k] = LeftArray[i];    
	        i++;    
	        k++;    
	    }    
	      
	    while (j<n2)    
	    {    
	        arr[k] = RightArray[j];    
	        j++;    
	        k++;    
	    }    
	}    
	
	static void mergeSort(int arr[], int beg, int end)  
	{  
	    if (beg < end)   
	    {  
	        int mid = (beg + end) / 2;  
	        mergeSort(arr, beg, mid);  
	        mergeSort(arr, mid + 1, end);  
	        merge(arr, beg, mid, end);
	    }  
	}  
	
	public static void main(String[] args) {
//		MergeSorting me = new MergeSorting();
		try(Scanner sc = new Scanner(System.in)){
			int size,amount = 0,remain = 0;
			
			//Currency denominations
			System.out.println("Enter the size of currency denominations");
			size = sc.nextInt();
			int arr[] = new int[size];
			int q[] = new int[size],j = 0;
			
			//Currency denomination values
			System.out.println("Enter the currency denominations value");
			for(int i=0; i<size; i++) {
				arr[i] = sc.nextInt();
			}
			
			//Amount want to paid
			System.out.println("Enter the amount you want to pay");
			amount = sc.nextInt();
			
			mergeSort(arr, 0, size-1);
			
			q[j] = amount/arr[size-1];
			remain = amount - (q[j] * arr[size-1]);
			j++;
			for(int i=size;  i>=0 ; i--) {
				if(remain <= arr[i]) {
					q[j] = remain/arr[i];
					remain = remain%arr[i];
					j++;
					i=size-1;
				}
			}
			
			for(int i=0; i<size; i++) {
			   System.out.println(arr[i]);
			}
		}
	}

}
