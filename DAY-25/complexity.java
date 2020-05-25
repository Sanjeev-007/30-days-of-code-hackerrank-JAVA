import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int s[]=new int[n];
        for(int i=0;i<n;i++){
            s[i]=sc.nextInt();
        System.out.println(isPrime(s[i]) ? "Prime" : "Not prime");
  }

  sc.close();
 }

 static boolean isPrime(int n) {
  if (n < 2) {
   return false;
  }

  for (int i = 2; i * i <= n; i++) {
   if (n % i == 0) {
    return false;
   }
  }
    return true;
    }
}

