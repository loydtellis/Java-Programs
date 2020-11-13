/*Program name: Largest sum of consecutive integers
 *Program statement: Find the largest sum of consecutive integers in an array.
 *
 *Sample Input 1: 8   
 *		 -2 -3 4 -1 -2 1 5 -3
 *Sample Output 1: 7
 *
 *Sample Input 2: 10
 *		 2 -9 -1 12 7 -2 5 -15 -2 12
 *Sample Output 2: 22
 */

package javaPrograms;

import java.util.Scanner;

public class LargestConsSum {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int n = sc.nextInt();
		int[] intarray = new int[n];
		int arrlength = intarray.length;
		int totalmax = intarray[0];
		System.out.print("Enter the array element: ");
		for (int i = 0; i < n; i++) {
			intarray[i] = sc.nextInt();
		}
		sc.close();

		if (arrlength != 0) {
			for (int j = 0; j < arrlength; j++) {
				int sum = 0;
				int max = intarray[j];
				for (int i = j; i < arrlength; i++) {
					sum = sum + intarray[i];
					if (max < sum) {
						max = sum;
						if (totalmax < max) {
							totalmax = max;
						}
					}
				}
			}
		}

		System.out.println("Largest consecutive sum is: " + totalmax);

	}

}
