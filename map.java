import java.util.*;
public class map{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);{
        HashMap<String, String> people=new HashMap<String, String>();
        String ele1, ele2;
        System.out.println("Enter the number of entries:");
        int entries=sc.nextInt();
        System.out.println("Enter the keys & values:");
        for(int i=1; i<=entries; i++){
            //System.out.println("Enter the key: ");
             ele1=sc.next();
             //System.out.println("Enter the value: ");
             ele2=sc.next();
            people.put(ele1, ele2);
            //sc.nextLine();
        }
        for(String k: people.keySet()){
            System.out.println("Key: " + k + "  " + "Value: " +  people.get(k));
    }
  }
 } 
}