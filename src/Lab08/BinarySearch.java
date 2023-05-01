package Lab08;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Your task is to write a Java program for this Binary Search algorithm. Submit the java code along with a screenshot of the output.
 */

public class BinarySearch {
	public static void main(String[] args) {
		int array[] = { 11, 22, 33, 44, 55, 66, 77 };
		Arrays.sort(array);
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the element u want to search : ");
		int item = scanner.nextInt();
		int start = 0, end = array.length - 1;
	    while (end - start > 1) {
	        int mid = (end + start) / 2;
	        if (array[mid] < item) {
	            start = mid + 1;
	        }
	        else {
	            end = mid;
	        }
	    }
	    if (array[start] == item) {
	      System.out.println("Found At Index " + start );
	    }
	    else if (array[end] == item) {
	        System.out.println("Found At Index " + end );
	    }
	    else {
	        System.out.println("Not Found" );
	    }
	}
}
