import java.io.*;
import java.util.*;
public class newarray{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);{
            System.out.println("Enter the size of the array:");
            int size=sc.nextInt();
            int i;
            int ele[]=new int[size];
            System.out.println("Enter the elements of the array:");
            for(i=0; i<size; i++){
                 ele[i]=sc.nextInt();
            }
            System.out.println("enter the number of elements you want ot shift:");
            int shift=sc.nextInt();
            System.out.println();
            for(i=0; i<(shift*size)-shift; i++){
                int temp1 = ele[i%size];
                ele[i%size]= ele[(i+1)%size];
                ele[(i+1)%size]=temp1;
            }
            for(i=0; i<size; i++){
                System.out.println(ele[i]);
            }
    }
}
}
/*2
3
6
4
5
1*/