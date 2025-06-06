import java.util.Scanner;

public class AgeClassifier {
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Enter your age:");
      
      int age = sc.nextInt();
      
      System.out.println( age >= 13 && age <= 17 ?
        "Teen" : age >= 18 ? "Adult" : "Child");
        
    sc.close();
    }
}
