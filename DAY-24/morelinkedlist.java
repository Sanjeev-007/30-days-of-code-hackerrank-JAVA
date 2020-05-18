import java.io.*;
import java.util.*;
class Node{
	int data;
	Node next;
	Node(int d){
        data=d;
        next=null;
    }
	
}
class Solution
{

    public static Node removeDuplicates(Node head) {
      //Write your code here
        Node cur=head;
        Node temp=head;
        HashSet<Integer> nums=new HashSet<Integer>();
        int n=1;
        while(cur!=null){
            if(!nums.contains(cur.data)){
                temp=cur;
                nums.add(cur.data);
                cur=cur.next;
            }
            else{
                temp.next=cur.next;
                cur=cur.next;
            }
        }
        return head;
    }

	 public static  Node insert(Node head,int data)
