import java .util.Scanner;
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//variable declaration
		int n, i, j, temp;
		 // create an object of scanner
		Scanner in = new Scanner(System.in);
		System.out.println("Input number of elements to sort");
		 // Input value
		n = in.nextInt();
		int array[] = new int[n];
		System.out.println("Enter " + n + " integers");
		for (i = 0; i < n; i++) 
		      array[i] = in.nextInt();
		//access each element of the array
		for (i = 0; i < ( n - 1 ); i++) {
			 // second loop performs the comparison in each iteration
			for (j = 0; j < n - 1; j++) {
				if (array[j] > array[j+1]) 
				 {
					// swap if left element is greater than right
					temp       = array[j];
					array[j]   = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		System.out.println("Sorted list of numbers");
		//getting sorted final array
		for (i = 0; i < n; i++) 
		      System.out.println(array[i]);

	}

}
