import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the factorial function below.
    static int factorial(int n) {
       
        if(n<=1){
            return 1;
        }else{
        return n*factorial(n-1);
        }
       }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        int s=scanner.nextInt();
         scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int n;
        int result;
        if(s>=2 && s<=12){
            n=s;
            result = factorial(n);
        
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();
        bufferedWriter.close();

        }else{System.out.println("0");}
       
        
        
        

        
        scanner.close();
    }
}
