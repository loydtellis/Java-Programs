/*Program name: Palindrome
 *Program statement: Check if a String is Palindrome or not(case insensitive).
 *
 *Sample Input 1: aibohphobia
 *Sample Output 1: aibohphobia is a Palindrome
 *
 *Sample Input 2: palindromeemordnialp
 *Sample Output 2: palindromeemordnilpa is not a Palindrome
*/

package javaPrograms;

import java.util.*;

public class Palindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String stringinput = sc.next();
		sc.close();
		String conStringInput=stringinput.toLowerCase();
		int strLength = conStringInput.length();
		int count = 0;

		String[] strArray = conStringInput.split("");
		for (int i = 0; i < strLength; i++) {
			if (strArray[i].equals(strArray[strLength - i - 1])) {
				count++;
			}
		}
		if (count == strLength) {
			System.out.println(stringinput+" is a Palindrome");
		} else {
			System.out.println(stringinput+" is not a Palindrome");
		}
	}
}
