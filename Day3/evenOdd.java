import java.util.*;

public class evenOdd {
    public static void main(String[] args) {
      
       Scanner sc = new Scanner(System.in);
       
       System.out.print("Enter an integer: ");
        int a = sc.nextInt();
        
        if(a % 2 != 0){
          System.out.println(a + " is odd!");
        }
        
        else{
          System.out.println(a + " is even!");
        }
        
      sc.close();
    }
    
  
}