import java.util.ArrayList;

public class CarsArray {
  public static void main(String[] args){
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    
    //cars.clear();
    //cars.remove(0);
    
    for (String i : cars){
      System.out.println(i);
      
    }
    
    
  }
}

  