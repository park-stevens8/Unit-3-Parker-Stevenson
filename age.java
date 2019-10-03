import java.util.Scanner;
public class age{
  public static void main(String []args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter Age");

    int age = scan.nextInt();

    if(age >= 21){
      System.out.println("You can drink");
    }
    else
      System.out.println("You cannot drink");
  }
}
