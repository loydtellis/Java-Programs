/*Program name: CamelCase to Snake_Case
 *Program statement: Convert CamelCase string(s) to a snake_case string(s).
 *
 *Sample Input 1: 1 stringArray
 *Sample Output 1: string_array
 *
 *Sample Input 2: 2 stringArray JavaEclipse
 *Sample Output 2: string_array java_eclipse
 */

package javaPrograms;

import java.util.*;

public class CamelcaseToSnakecase {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the count of Strings to be entered: ");
		int n = sc.nextInt();

		String[] strArray = new String[n];
		String regex = "([a-z])([A-Z]+)";
		String replacement = "$1_$2";

		for (int i = 0; i < n; i++) {
			strArray[i] = sc.next();
		}
		sc.close();

		for (int i = 0; i < n; i++) {
			strArray[i] = strArray[i].replaceAll(regex, replacement)
					.toLowerCase();
		}
		System.out.println("\nCoverted string are: ");
		for (int i = 0; i < n; i++) {
			System.out.println(strArray[i]);
		}

	}
}
