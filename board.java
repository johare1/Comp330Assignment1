import java.util.*;
import java.util.Scanner;

public class board
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    GamePlay aGame = new GamePlay();
    int goFirst;

    aGame.choosePlayers();
    System.out.println("Who will play first? Enter '1' or '2':");
    goFirst = keyboard.nextInt();
    if (goFirst == 1)
      aGame.player1First();
    else
      aGame.player2First();
  }
}
