import java.io.*;
import java.util.*;
public class LinkedList{
    Node head=null;
    static class Node{
        int data;
        Node next;
      
        Node(int data){
        this.data=data;
        this.next=null;
     } 
    }                                             
     void add(int data){
        Node toAdd=new Node(data);
        Node temp=head;
        if(head==null){
            head=toAdd;
            return;
        }
        else{
          while(temp.next!=null){
            temp=temp.next;
         }
        temp.next=toAdd;
    }
  }
    void print(){
        if(head==null){
            System.out.println("The List is Empty !");
        }
        else{
            System.out.println("The datas are: ");
            Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
  }
  void delete(int q){
      Node temp=head;
      Node prev=temp;
      if(q==head.data){
          head=temp.next;
          temp=null;
      }else{
      while(temp.data!=q){
          prev=temp;
          temp=temp.next;
      }
      prev.next=temp.next;
      temp=null;
  }
  }
  void addpos(int pos, int dat){
     Node toAdd=new Node(dat);
     Node temp=head;
     if(pos==1){
         Node cur=temp;
         head=toAdd;
         toAdd.next=cur;
     }else{
     //Node cur=null;
     int count=2;
     while(count<pos){
         //cur=temp;
         temp=temp.next;
         count++;
     }
     toAdd.next=temp.next;
     temp.next=toAdd;
  }
}
 void reverse(){
    Node temp=head;
    Node prev=null;
    Node next=null;
    while(temp!=null){
        next=temp.next;
        temp.next=prev;
        prev=temp;
        temp=next;
    }
    head=prev;
    //return head;
}
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);{
        LinkedList ll=new LinkedList();
        Node head=null;
    while(true){
        System.out.println("Enter 1 to  Add data at the end(if empty then at the first)");
        System.out.println("Enter 2 to print the data present in the LimkedList");
        System.out.println("Enter 3 to delete data from the LinkedList ");
        System.out.println("Enter 4 to Add data at any position ");
        System.out.println("Enter 5 to reverse the Linked List");
        System.out.println("Enter your chice:");
        int ch=sc.nextInt();
         switch(ch){
             case 1:
             System.out.println("Enter data to Add :");
             int ele=sc.nextInt();
             //Add();
             ll.add(ele);
             break;
             case 2:
             ll.print();
             break;
             case 3:
             System.out.println("Enter the data to delete from the List :");
             int delpos=sc.nextInt();
             ll.delete(delpos);
             break;
             case 4:
             System.out.println("Enter the position to Add data :");
             int position=sc.nextInt();
             System.out.println("Enter data to enter into the LinkedList :");
             int dat=sc.nextInt();
             ll.addpos(position,dat);
             break;
             case 5:
             ll.reverse();
             break;
         }
       }
    }
   }
}
