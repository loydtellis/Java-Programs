/*Program name: Delete range of elements from an array
 *Program statement: Trim / delete the the range of elements an array 
 *
 *Sample Input 1: 4
 *				 2 3
 *				1 2 3 4 
 *Sample Output 1: [1,2]
 *
 *Sample Input 2: 5
 *				 3 5
 *Sample Output 2: Index entered is not in the range of the size of the array
 */


package javaPrograms;

import java.util.*;

public class ArraylistTrimIndex {
	
		public static void main(String args[]){
			ArrayList<Integer> a=new ArrayList<Integer>();
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter the size of an array: ");
			int n=sc.nextInt();
			System.out.print("Enter the starting index of an array that needs to be deleted: ");
			int s=sc.nextInt();
			System.out.print("Enter the last index of an array that needs to be deleted: ");
			int l=sc.nextInt();
			
			if(s>0 && l < (n-1)){
				System.out.print("Enter the array integers: ");
				for (int i=0;i<n;i++){
					a.add(sc.nextInt());
				}
				sc.close();
				a.trimToSize();
				for(int i=l;i>=s;i--){
					a.remove(i);
				}
				System.out.println(a);
			}else{
				System.out.println("Index entered is not in the range of the size of the array");
			}
			
		}
	}


