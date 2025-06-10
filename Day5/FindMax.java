import java.util.ArrayList;

public class FindMax{
  public static void main (String[] args){
    
    ArrayList<Integer> maxNum = new ArrayList<Integer>();
    maxNum.add(5);
    maxNum.add(8);
    maxNum.add(2);
    maxNum.add(10);
    maxNum.add(3);
    
    int max = maxNum.get(0);
    
    for (int i = 0; i < maxNum.size(); i++){
      if (maxNum.get(i) > max){
        max = maxNum.get(i);
        
      }
    }
    
    System.out.println("Max: " + max);
  }
}