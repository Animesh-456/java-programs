//import java.io.*;
import java.util.HashMap;
//import java.util.*;
public class has {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);{
            HashMap<String, String> map = new HashMap<String, String>();
           System.out.println("Enter the number of elemets to be put inside the HashMap:");
            int n=sc.nextInt();
            System.out.println("Enter the elements to be put inside the list:");
            //map.put("England", "India");
            for(int i=0; i<n; i++){
                String ele1=sc.nextLine();
                String ele2=sc.nextLine();
                map.put(ele1, ele2);
                sc.nextLine();
            }
                System.out.print(map);
}
}
}