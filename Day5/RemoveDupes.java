import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.List;

public class RemoveDupes{
  public static void main (String[] args){
    
    List<String> ListWithDupes = new ArrayList<String>(List.of("A", "B", "A", "C", "B")); // Create a MUTABLE ArrayList
    
    
    // Convert to LinkedHashSet to remove duplicates
    Set<String> set = new LinkedHashSet<>(ListWithDupes);
    
    //Convert back to ArrayList
    List<String> listWithoutDupes = new ArrayList<>(set);
    
    System.out.println("New List without duplicates: " + listWithoutDupes);
    
    

  }
}