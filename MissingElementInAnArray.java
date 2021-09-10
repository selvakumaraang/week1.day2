package week1.day2;

import java.util.Arrays;

public class MissingElementInAnArray {
	public static void main(String[] args) {

		int[] arr = { 0,1, 2, 3, 4, 7, 5,6, 9 };
		
		Arrays.sort(arr);

		for (int i = 0; i <= arr.length; i++) {

			if (i!=arr[i-0]) {
				System.out.println("The missing element is "+i);
				break;
			}
			
			
		}
	}


}
