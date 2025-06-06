import java.util.Scanner;

public class PasswordLogin{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter Username: ");
    String UserName = sc.nextLine();

    System.out.println("Enter Password: ");
    int password = sc.nextInt();

    System.out.println(
    "admin".equals(UserName) && password == 1234 ? "Welcome" : "Access Denied"
);

     sc.close();



  }

}
