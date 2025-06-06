
import java.util.*;

public class Age {
    public static void main(String[] args) {
      
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Enter your age:");
       int age = sc.nextInt();
       
       if (age >= 18 && age <= 59){
         System.out.println("You’re an adult.");
       }
       
       else if(age >= 60){
         System.out.print("You’re a senior.");
       }
       
       else{
         System.out.println("You're a minor.");
       }
       
       sc.close();
      
    }
}
