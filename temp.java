import java.util.Scanner;
public class temp{
  public static void main(String []args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter Temperature");

    int temp = scan.nextInt();

    if(temp > 83)
      System.out.println("Hot");
    else if(83 >= temp && temp >= 68)
      System.out.println("Ideal");
    else if(67 >= temp && temp >= 45)
      System.out.println("Cool");

    else
      System.out.println("Cold");

  }

}
