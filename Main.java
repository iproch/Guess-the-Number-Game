import java.util.*;
class Main {
  public static void main(final String[] args) {
    Random random = new Random();
    int min = 0;
    int max = 100;
    int winningNum = random.nextInt(((max - min) + 1) - min);
    Scanner userInput = new Scanner(System.in);
    boolean winner = false;

    while(!winner){
    System.out.println("Enter your guess.");
    System.out.println(winningNum);
    winner = true;
    }
  }
}