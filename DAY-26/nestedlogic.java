import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
      
        Scanner sc=new Scanner(System.in);
        int ad,am,ay,dd,dm,dy;
        ad=sc.nextInt();
        am=sc.nextInt();
        ay=sc.nextInt();
        dd=sc.nextInt();
        dm=sc.nextInt();
        dy=sc.nextInt();

 int fine = 0;

        if (ay > dy) fine = 10000;
        else if (ay == dy) {
            if (am > dm) fine = (am - dm) * 500;
            else if (am == dm && ad > dd) fine = (ad - dd) * 15;
        }

        System.out.println(fine);
    sc.close();
    }
}
