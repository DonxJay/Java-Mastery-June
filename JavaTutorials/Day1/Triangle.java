import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int rows = 3; //number of rows of the triangle
      
      for (int i = 1; i <= rows; ++i){
        for( int j = i; j < rows; ++j){       
          System.out.print(" ");            //adds spaces before the stars
        }
        
        for (int k = 1; k <= (2 * i -1); ++k){
          System.out.print("*");                   //prints the stars
        }
        
      System.out.println(" ");
      }
      
  }
}
