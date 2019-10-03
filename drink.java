import java.util.Scanner;
public class drink{
  public static void main(String []args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter Age");

    int age = scan.nextInt();

    if(age >= 17){
      System.out.println("You can drive");
      if(age >= 21){
      System.out.println("You can also drink!");
}
    }
    else
      System.out.println("You cannot drive or drink");
  }
}
