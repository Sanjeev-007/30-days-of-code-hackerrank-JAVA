import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        int a;
        a=scan.nextInt();
        double b;
        b=scan.nextDouble();
        String c;
        scan.nextLine();
        c=scan.nextLine();
        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        
        /* Print the sum of both integer variables on a new line. */
        System.out.println(a+i);
        System.out.println(b+d);
        /* Print the sum of the double variables on a new line. */
		//System.out.print(s);
        System.out.println(s+c);
                /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */

        scan.close();
