package com.LinkedList;

import java.util.List;
import java.util.Stack;

public class Subtraction {

   static class ListNode{
       int val;
       ListNode next;
       public ListNode(int val){
           this.val = val;

       }
   }



   public static void solve(ListNode A){

       ListNode slow = A;
       ListNode fast = A;
       int  i =1;
       while(fast!=null&& fast.next!=null){
           slow = slow.next;
           fast = fast.next.next;
           i++;
       }

       ListNode curr = A;

       Stack<ListNode> stack = new Stack <>();
       while(slow!=null){
           stack.push(slow);
           slow = slow.next;
       }

       while (!stack.isEmpty()){
           if(stack.peek()==curr){
               curr = curr.next;
               stack.pop();
               continue;
           }
           curr.val = (stack.pop().val-curr.val);
           curr = curr.next;

       }





   }

   public static void traverse(ListNode n){
     ListNode node  = n;
       while (node!=null){
           System.out.println(node.val);
           node = node.next;
       }
   }

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        //node.next.next.next = new ListNode(4);
        //node.next.next.next.next = new ListNode(5);


        solve(node);


        traverse(node);




    }
}
