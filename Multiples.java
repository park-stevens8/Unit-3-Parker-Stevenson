import java.util.Scanner;

public class Multiples {
  public static void main(String []args){

    Scanner scan = new Scanner(System.in);

    System.out.println("Enter a positive integer:");
    int input = scan.nextInt();
    System.out.println("Enter your limit #:");
    int limit = scan.nextInt();
    int test = 1;
    int multiples = (input);

    while (multiples <= limit){
      System.out.println(multiples);
      test++;
      multiples = (input*(test));

    }
    /* while( <= limit){
      int test = 1;
      int multiples = (input1*(test++));

      System.out.println(multiples);


    }
*/
    //multiply by 1++ in while loop until limit
    //print 5 then new line
    }
}
