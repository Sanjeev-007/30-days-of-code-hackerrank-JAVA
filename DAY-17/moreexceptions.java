import java.util.*;
import java.io.*;
import java.lang.Math;
//Write your code here
class Calculator{
    

        int n,p;
        
public int power(int s,int a) throws Exception{
    n=s;
    p=a;
    if(n<0 || p<0){
        throw new Exception("n and p should be non-negative");
    }else{
        return ((int)Math.pow(n,p));
    }
} 
}
class Solution{
