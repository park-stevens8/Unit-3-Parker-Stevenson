import java.util.Scanner;
import java.text.DecimalFormat;

public class WinPercentage{
  public static void main(String []args){

    Scanner input = new Scanner(System.in);

    System.out.println("Enter total number of games played:");
    int games = input.nextInt();
    System.out.println("Enter total number of games won:");
    int gameswon = input.nextInt();
    DecimalFormat fmt = new DecimalFormat("##.0");

    while (games < 0){
      System.out.println("Error: Games Won and Games Played Must Be Greater Than Zero");
      System.out.println("Enter total number of games played:");
      games = input.nextInt();
      System.out.println("Enter total number of games won:");
      gameswon = input.nextInt();
    }

    while (gameswon < 0){
      System.out.println("Error: Games Won and Games Played Must Be Greater Than Zero");
      System.out.println("Enter total number of games played:");
      games = input.nextInt();
      System.out.println("Enter total number of games won:");
      gameswon = input.nextInt();
    }

    while (games < gameswon ){
      System.out.println("Error: Games Won must be < Total Games Played");
      System.out.println("Enter total number of games played:");
      games = input.nextInt();
      System.out.println("Enter total number of games won:");
      gameswon = input.nextInt();
    }


    double gw = gameswon;
    double g = games;
    double perc = (gw / g);
    double WinPerc = (Math.round(perc*10000) / 100.0);
    System.out.println((WinPerc) + "% Win Percentage");

  }
}
