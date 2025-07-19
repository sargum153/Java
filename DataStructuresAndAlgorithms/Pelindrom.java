package DataStructuresAndAlgorithms;

import java.util.Scanner;
public class Pelindrom {
 
 public static void main(String[] args)  { 
  Scanner scn=new Scanner(System.in); 
  System.out.println("enter a number"); 
  int n =scn.nextInt(); // n = 123
  int t=n; // t=123 , n = 123 
  int rev=0; // rev = 0 , t = 123; n = 123
  int sum = 0;
  while (n!=0) { // true n = 123		n = 12
	  //System.out.println("n value " + n); // 123 n = 1
	   //System.out.println("rev value " +rev); // rev = 0		3		32
   rev=rev*10+(n%10); // 0*10+(123 % 10) = 3, rev = 3; n = 123 -- 3 * 10 + (12 % 10) = 32  rev = 321
   System.out.println(n%10);
  //sum = sum + (n%10);
   n=n/10; // n = 123/10 n = 12; rev = 3 ; n = 1 n = 0
   
   //System.out.println("n value " + n); // n = 12
   //System.out.println("rev value " +rev); // rev = 3 
  }
  if (rev==t) // 321 == 123
   System.out.println(t+" is a palindrome number"); 
  else 
  System.out.println(t+"is not a palindrome number"); 
  
  //System.out.println("sum " +sum);
 
   
 } 
}
// 32= 30 + 2 324= 0 + 4= 4		4 * 10 + 2 = 42  42 * 10 + 3 = 423 
// 12 = n % 10 =2; 1 % 10= 1
// n/10 = 1 
// System.out.println()
