import java.io.*;
import java.util.*;

public class Stackusinglinkedlist
{
  Node head = null;
  static class Node
  {
    Integer data;
    Node next;
      Node (int data)
    {
      this.data = data;
      this.next = null;
    }
  }

  void push (int dat)
  {
    Node toAdd = new Node (dat);
    Node temp = head;
    if (head == null)
      {
	head = toAdd;
	return;
      }
    else
      {
        toAdd.data=dat;
     toAdd.next=temp;
     temp=toAdd;
     head=temp;
        }
      }

  void pop ()
  {
    Node temp = head;
    if(head==null){
      System.out.println("Underflow !");
    }
    else{
          head=temp.next;
          temp=head;
      }
  }

  void print ()
  {
    Node temp = head;
    //Node prev=temp;
    if (head == null)
      {
	System.out.println ("The Stack is Empty !");
      }
    else
      {
	while (temp!= null)
	  {
	    System.out.println (temp.data);
	    temp = temp.next;
    }
    
      }
  }

  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    Stackusinglinkedlist st = new Stackusinglinkedlist ();
    Node head = null;
    while (true)
      {
	System.out.println ("Enter 1 to push , 2 to pop , 3 to print the data");
	System.out.println ("Enter your choice : ");
	int ch = sc.nextInt ();
	switch (ch)
	  {
	  case 1:
	    System.out.println ("Enter data to push : ");
	    int d = sc.nextInt ();
	    st.push (d);
	    break;
	  case 2:
	    st.pop ();
	    break;
	  case 3:
      System.out.println("The data are : - ");
      st.print ();
	    break;
	  }

      }
  }
}