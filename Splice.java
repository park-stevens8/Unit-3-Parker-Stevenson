import java.util.Scanner;

public class Splice{
  public static void main(String []args){

    Scanner scan = new Scanner(System.in);

    System.out.println("Enter a word");

    String input = scan.nextLine();
    int length = input.length();
    int num = 0;

    while(num < length){
      System.out.println(input.charAt(num));
      num++;

    }




  }
}
