import java.util.*;
import java.util.Scanner;
import java.io.*;

public class GamePlay
{
  Scanner keyboard = new Scanner(System.in);
  boolean gameOver;

  String p1Name = "";
  String p2Name = "";

  Section s0 = new Section(0, "0", false);
  Section s1 = new Section(1, "1", false);
  Section s2 = new Section(2, "2", false);
  Section s3 = new Section(3, "3", false);
  Section s4 = new Section(4, "4", false);
  Section s5 = new Section(5, "5", false);
  Section s6 = new Section(6, "6", false);
  Section s7 = new Section(7, "7", false);
  Section s8 = new Section(8, "8", false);
  List<Section> sectionList = new ArrayList<Section>();


  public void choosePlayers()
  {
    System.out.println("Welcome to Tic Tac Toe. There will be two players in this game. Enter Player 1's name:");
    p1Name = keyboard.nextLine().toUpperCase();
    System.out.println("Enter Player 2's name:");
    p2Name = keyboard.nextLine().toUpperCase();
  }

  public void player1First()
  {
    //DONE set user input to these strings
    //initialize players and sections of board
    Player p1 = new Player(true, "X", p1Name);
    Player p2 = new Player(false, "O", p2Name);

    sectionList.add(s0);
    sectionList.add(s1);
    sectionList.add(s2);
    sectionList.add(s3);
    sectionList.add(s4);
    sectionList.add(s5);
    sectionList.add(s6);
    sectionList.add(s7);
    sectionList.add(s8);

    int turnCounter = 0;
    int selSection1;
    int selSection2;

    while (turnCounter <= 9) //fix
    {

      printBox(sectionList); //fix
      //TODO set loop to put the following game mechanics in
      System.out.println(p1.name + ": please select your move");
      selSection1 = keyboard.nextInt();

      if (sectionList.get(selSection1).isTaken == false)
      {
        turnCounter++;
        sectionList.get(selSection1).value = p1.symbol;
        sectionList.get(selSection1).isTaken = true;
        //TODO run method here to set board position
        printBox(sectionList);
      }
      else
      {
        System.out.println("This space has already been taken. Choose another");
      }
      gameOver = checkWin(sectionList, p1, p2);
      if(gameOver == true)
      {
        break;
      }

      System.out.println(p2.name + ": please select your move");
      selSection2 = keyboard.nextInt();

      if (sectionList.get(selSection2).isTaken == false)
      {
        turnCounter++;
        sectionList.get(selSection2).value = p2.symbol;
        sectionList.get(selSection2).isTaken = true;
        //TODO run method here to set board position
        printBox(sectionList);
      }
      else
      {
        System.out.println("This space has already been taken. Choose another" + " this is the counter: " + turnCounter); //testing
      }
      gameOver = checkWin(sectionList, p1, p2);
      if(gameOver == true)
      {

        break;
      }
    }

  }


  public void player2First()
  {
  Player p1 = new Player(false, "O", p1Name);
  Player p2 = new Player(true, "X", p2Name);

  sectionList.add(s0);
  sectionList.add(s1);
  sectionList.add(s2);
  sectionList.add(s3);
  sectionList.add(s4);
  sectionList.add(s5);
  sectionList.add(s6);
  sectionList.add(s7);
  sectionList.add(s8);

  int turnCounter = 0;
  int selSection1;
  int selSection2;

  while (turnCounter <= 9) //fix, have game stop
  {

    printBox(sectionList); //fix
    //TODO set loop to put the following game mechanics in
    System.out.println(p2.name + ": please select your move");
    selSection1 = keyboard.nextInt();

    if (sectionList.get(selSection1).isTaken == false)
    {
      sectionList.get(selSection1).value = p2.symbol;
      sectionList.get(selSection1).isTaken = true;
      turnCounter++;
      //TODO run method here to set board position
      printBox(sectionList);
    }
    else
    {
      System.out.println("This space has already been taken. Choose another");
    }

    gameOver = checkWin(sectionList, p1, p2);
    if(gameOver == true)
    {

      break;
    }
    System.out.println(p1.name + ": please select your move");
    selSection2 = keyboard.nextInt();

    if (sectionList.get(selSection2).isTaken == false)
    {
      turnCounter++;
      sectionList.get(selSection2).value = p1.symbol;
      sectionList.get(selSection2).isTaken = true;
      //TODO run method here to set board position
      printBox(sectionList);
    }
    else
    {
      System.out.println("This space has already been taken. Choose another" + " this is the counter " + turnCounter); //testing
    }

    gameOver = checkWin(sectionList, p1, p2);
    if(gameOver == true)
    {
      break;
    }
  }


  }


  public boolean checkWin(List<Section> secList, Player p1, Player p2)
  {
    if (secList.get(0).value != "0" && secList.get(1).value != "1" && secList.get(2).value != "2" && secList.get(3).value != "3"
    && secList.get(4).value != "4" && secList.get(5).value != "5" && secList.get(6).value != "6" && secList.get(7).value != "7"
            && secList.get(8).value != "8")
    {
      p1.Draw();
    }
    if(secList.get(0).value == secList.get(1).value && secList.get(1).value == secList.get(2).value) //top row
    {
      if(secList.get(0).value == p1.symbol)
      {
        p1.Wins();
      }
      else if(secList.get(0).value == p2.symbol)
      {
        p2.Wins();
      }
    }

    if(secList.get(0).value == secList.get(3).value && secList.get(3).value == secList.get(6).value) //first column (left)
    {
      if(secList.get(0).value == p1.symbol)
      {
        p1.Wins();
      }
      else if(secList.get(0).value == p2.symbol)
      {
        p2.Wins();
      }
    }

    if(secList.get(6).value == secList.get(7).value && secList.get(7).value == secList.get(8).value) //bottom row
    {
      if(secList.get(6).value == p1.symbol)
      {
        p1.Wins();
      }
      else if(secList.get(6).value == p2.symbol)
      {
        p2.Wins();
      }
    }

    if(secList.get(8).value == secList.get(5).value && secList.get(5).value == secList.get(2).value) //last column (right)
    {
      if(secList.get(8).value == p1.symbol)
      {
        p1.Wins();
      }
      else if(secList.get(8).value == p2.symbol)
      {
        p2.Wins();
      }
    }

    if(secList.get(3).value == secList.get(4).value && secList.get(4).value == secList.get(5).value) //middle row
    {
      if(secList.get(3).value == p1.symbol)
      {
        p1.Wins();
      }
      else if(secList.get(3).value == p2.symbol)
      {
        p2.Wins();
      }
    }

    if(secList.get(0).value == secList.get(4).value && secList.get(4).value == secList.get(8).value) //diagnol from top left
    {
      if(secList.get(0).value == p1.symbol)
      {
        p1.Wins();
      }
      else if(secList.get(0).value == p2.symbol)
      {
        p2.Wins();
      }
    }

    if(secList.get(2).value == secList.get(4).value && secList.get(4).value == secList.get(6).value) //diagnol from top right
    {
      if(secList.get(2).value == p1.symbol)
      {
        p1.Wins();
      }
      else if(secList.get(2).value == p2.symbol)
      {
        p2.Wins();
      }
    }

    if(secList.get(1).value == secList.get(4).value && secList.get(4).value == secList.get(7).value) //middle column
    {
      if(secList.get(1).value == p1.symbol)
      {
        p1.Wins();
      }
      else if(secList.get(1).value == p2.symbol)
      {
        p2.Wins();
      }
    }

    if(p1.hasWon == true || p2.hasWon == true)
    {
      return true;
    }else if(p1.isDraw == true){
      return true;
    }else
    {
      return false;
    }

  }


  public void printBox(List<Section> secList) //leaving here for testing purposes
  {

    System.out.println(  "\n\n\t\t" + secList.get(0).value + "   | " + secList.get(1).value + "  | " + secList.get(2).value);
    System.out.println(  " \t\t    |    |   " );
    System.out.println(  " \t\t ___|____|___ " );
    System.out.println(  "\n\n\t\t" + secList.get(3).value + "   | " + secList.get(4).value + "  | " + secList.get(5).value);
    System.out.println(  " \t\t    |    |   " );
    System.out.println(  " \t\t ___|____|___ " );
    System.out.println(  "\n\n\t\t" + secList.get(6).value+ "   | " +secList.get(7).value + "  | " + secList.get(8).value);
    System.out.println(  " \t\t    |    |   " );
    System.out.println(  " \t\t    |    |   " );

  }




}
