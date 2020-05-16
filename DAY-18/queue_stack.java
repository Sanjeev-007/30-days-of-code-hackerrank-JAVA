import java.io.*;
import java.util.*;

public class Solution {
    // Write your code here.
    LinkedList queue;
    Stack stack;
    Solution(){
        queue=new LinkedList();
        stack=new Stack();
    }
    public void pushCharacter(char c){
        stack.push(c);
    }
    public void enqueueCharacter(char d){
        queue.addLast(d);
    }
    public char popCharacter(){
        return (char)stack.pop();
    }
    public char dequeueCharacter(){
        return (char)queue.remove();
    }
 
    public static void main(String[] args) {
