import java.util.Scanner;

public class ternOper {
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Enter a number:");
      
      int num = sc.nextInt();
      
      System.out.println(num % 2 != 0 ?
        "Number is Odd" : "Number is Even");
        
    sc.close();
    }
}
