import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int x;
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        LinkedList<Integer> list=new LinkedList<>();
        for(int i=0; i<x; i++){
            int ele=sc.nextInt();
            list.add(ele);
        }
        int querry=sc.nextInt();
        for(int i=0; i<querry; i++){
            String action=sc.next();
            if(action.equals("Insert")){
             int index=sc.nextInt();
             int value=sc.nextInt();
             list.add(index, value);
            }
          else{
             int index=sc.nextInt();
             list.remove(index);
        }
        }
        for(Integer num: list){
        System.out.print(num+" ");
        }
        }
}
