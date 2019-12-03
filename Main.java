import java.util.Random;
class Main {
  public static void main(String[] args) {
    Random random = new Random(100);
    int min = 0;
    int max = 100;
    int winningNum = random.nextInt(((max-min)+1)-min);
    System.out.println(winningNum);
  }
}