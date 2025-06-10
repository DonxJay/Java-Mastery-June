import java.util.ArrayList;

public class SumList{
  public static void main (String[] args){
    
    ArrayList<Integer> mySum = new ArrayList<Integer>();
    mySum.add(10);
    mySum.add(20);
    mySum.add(30);
    mySum.add(40);
    
    int sum = 0;
    
    for (Integer num : mySum){
      sum += num;
    }
    
    System.out.println("Sum: " + sum);
  }
}