package javaPrograms;

import java.util.Scanner;

public class Longest_common_prefix {
	static String commonPrefixUtil(String str1, String str2) { 
        String result = ""; 
        int n1 = str1.length(), n2 = str2.length(); 
    
        for (int i = 0, j = 0; i <= n1 - 1 && j <= n2 - 1; i++, j++) { 
            if (str1.charAt(i) != str2.charAt(j)) { 
  
                break; 
            } 
            result += str1.charAt(i); 
        }
  
        return (result); 
    }  
    static String commonPrefix(String arr[], int n) { 
        String prefix = arr[0]; 
  
        for (int i = 1; i <= n - 1; i++) { 
            prefix = commonPrefixUtil(prefix, arr[i]); 
        } 
  
        return (prefix); 
    }  
    public static void main(String[] args) { 
         @SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
          int n= s.nextInt();
        String arr[] = new String[n];
        for(int i=0;i<n;i++){
            arr[i]=s.next();
        }
        
        int len = arr.length; 
        
        String ans = commonPrefix(arr, len); 
  
        if (ans.length() > 0) { 
            System.out.printf(ans); 
        } else { 
            System.out.printf("-1"); 
        } 
    } 
} 