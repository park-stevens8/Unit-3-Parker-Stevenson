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

    if(input < 0 || limit < 0){
      System.out.println("Must be positive a #");
    }

    if(input > limit){
      System.out.println("Upper limit must be > your positive integer");
    }

    while (multiples <= limit && input > 0 && limit > 0){
      if(multiples % 5 == 2){
      System.out.print("\n");
    }
      System.out.print(multiples + " ");
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
