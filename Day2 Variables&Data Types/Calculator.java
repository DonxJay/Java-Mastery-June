import java.util.*;

public class Calculator {
    public static void main(String[] args) {
      
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Enter the first number: ");
        double a = sc.nextDouble();
        
        System.out.println("Enter the second number: ");
        double b = sc.nextDouble();
       
        double sum = a + b;
        double difference = a - b;
        double product = a * b;
       
        System.out.printf("\nSum: %.2f\n", sum);
        System.out.printf("Difference: %.2f\n", difference);
        System.out.printf("Product: %.2f\n", product);
        
        if(b!=0){
          double quotient = a / b;
          System.out.printf("Quotient: %.2f\n", quotient);
        }
        
        else{
          System.out.println("Quotient: Cannot divide by zero!");
        }

	sc.close();
      
    }
}