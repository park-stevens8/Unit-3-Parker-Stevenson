import java.util.Scanner;
public class minofthree{
  public static void main(String []args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter one integer digit");
    int num1 = scan.nextInt();
    System.out.println("Enter another integer digit");
    int num2 = scan.nextInt();
    System.out.println("Enter one more integer digit");
    int num3 = scan.nextInt();


    if(num1 > num2 && num2 > num3)
      System.out.println(num3 + " is the lowest number");
      else if (num1 > num3 && num3 > num2)
      System.out.println(num2 + " is the lowest number");
      else if (num2 > num3 && num3 > num1)
      System.out.println(num1 + " is the lowest number");
      else if (num2 > num1 && num1 > num3)
      System.out.println(num3 + " is the lowest number");
      else if (num3 > num1 && num1 > num2)
      System.out.println(num2 + " is the lowest number");
      else if (num3 > num2 && num2 > num1)
      System.out.println(num1 + " is the lowest number");

  }
}
