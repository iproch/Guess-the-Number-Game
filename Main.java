import java.util.*;
class Main {
  public static void main(final String[] args) {
    Random random = new Random();
    int min = 0;
    int max = 100;
    int guessCount = 0;
    int winningNum = random.nextInt(((max - min) + 1) - min);
    Scanner userInput = new Scanner(System.in);
    boolean winner = false;

    while(!winner){
    System.out.println("Enter your guess:");
    int userGuess = userInput.nextInt();
    
    if(userGuess != winningNum){
      if(userGuess < winningNum){
        guessCount++;
        System.out.println("Try guessing higher!");
      }
      else{
        guessCount++;
        System.out.println("Try guessing lower!");
      }
    }
    else{
      winner = true;
      System.out.println("You guessed correctly after " + guessCount + " attempts!" + "The number was " + winningNum);
    }
    }
  }
}