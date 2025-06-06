
import java.util.*;

public class CompareNumbers {
    public static void main(String[] args) {
      
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Enter your first number: ");
       int a = sc.nextInt();
       
       System.out.println("Enter your second number: ");
       int b = sc.nextInt();
       
       if(a == b){
         System.out.println("Result: " + a + " is equal to " + b);
       }
       
       else if(a > b){
         System.out.println("Result: " + a + " is greater than " + b);
       }
       
       else if (b > a){
         System.out.print("Result: " + b + " is greater than " + a);
       }
       
       sc.close();
      
    }
}
