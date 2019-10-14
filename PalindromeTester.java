import java.util.Scanner;

public class PalindromeTester{
  public static void main(String []args){

    Scanner input = new Scanner(System.in);

    System.out.println("Would you like to enter a palindrome?");

    String question1 = "yes";
    String question2 = "no";
    String yes = "yes";
    String no = "no";

    if (question1 == yes){

      String palindrome = input.next();
      String palindromelc = palindrome.toLowerCase();

      System.out.println(palindromelc);

    }
    if (question2 == no){
      System.out.println("Ok, Bye");

    }



    //boolean answer

    //make whole thing lowercase
    //get string length String(Length);
    //make new string with reassigned order same length charAt

    //compare strings to check for same unicode values




  }
}
