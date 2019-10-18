import java.util.Scanner;

public class PalindromeTester{
  public static void main(String []args){

    Scanner input = new Scanner(System.in);

    System.out.println("Would you like to enter a palindrome? ('yes' for yes, 'no' for no)");

    String question = input.next();
    String yes = "yes";
    String no = "no";
    compare = String.compareTo(yes question);

    if (String.compareTo(yes question) == 0){

      System.out.println("Type your Palindrome");
      String palindrome = input.next();
      String palindromelc = palindrome.toLowerCase();

      System.out.println(palindromelc);

    }
    if (question == no){
      System.out.println("Ok, Bye");

    }



    //boolean answer

    //make whole thing lowercase
    //get string length String(Length);
    //make new string with reassigned order same length charAt

    //compare strings to check for same unicode values




  }
}
