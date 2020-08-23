import java.util.*;
public class array{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);{
System.out.println("Enter the size of the array:");
int size=sc.nextInt();
int j;
System.out.println("enter the elements of the array:");
int ele[] = new int[size];
for(int i=0; i<size; i++){
ele[i]=sc.nextInt();
}
System.out.println();
System.out.println("enter the number of elements you want to shift:");
int shift=sc.nextInt();
System.out.println();
for(int i=0; i<shift; i++){
int temp=ele[0];
for(j=0; j<size-1; j++){
ele[j]=ele[j+1];
}
//System.out.println(j);
ele[j]=temp;
}
for(int i=0; i<size; i++){
System.out.println(ele[i]);
}
}
}
}
//123456
//345612