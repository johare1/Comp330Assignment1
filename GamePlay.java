import java.util.*;
import java.util.Scanner;
import java.io.*;

public class GamePlay
{
  Scanner keyboard = new Scanner(System.in);

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
      checkWin(sectionList, p1, p2);
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
        System.out.println("This space has already been taken. Choose another" + "this is the counter + " + turnCounter); //testing
      }
    }

  }


  public void player2First()
  {
  Player p1 = new Player(false, "X", p1Name);
  Player p2 = new Player(true, "O", p2Name);

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
    checkWin(sectionList, p1, p2);
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
      System.out.println("This space has already been taken. Choose another" + "this is the counter + " + turnCounter); //testing
    }
  }


  }


  public void checkWin(List<Section> secList, Player p1, Player p2)
  {
    if(secList.get(0).value == secList.get(1).value && secList.get(1).value == secList.get(2).value)
    {
      if(secList.get(0).value == p1.symbol)
      {
        p1.Wins();
      }else
      {
        p2.Wins();
      }
    }
    if(secList.get(0).value == secList.get(3).value && secList.get(3).value == secList.get(6).value)
    {
      if(secList.get(0).value == p1.symbol)
      {
        p1.Wins();
      }else
      {
        p2.Wins();
      }
    }
    if(secList.get(6).value == secList.get(7).value && secList.get(7).value == secList.get(8).value)
    {
      if(secList.get(6).value == p1.symbol)
      {
        p1.Wins();
      }else
      {
        p2.Wins();
      }
    }
    if(secList.get(8).value == secList.get(5).value && secList.get(5).value == secList.get(2).value)
    {
      if(secList.get(8).value == p1.symbol)
      {
        p1.Wins();
      }else
      {
        p2.Wins();
      }
    }
    if(secList.get(3).value == secList.get(4).value && secList.get(4).value == secList.get(5).value)
    {
      if(secList.get(3).value == p1.symbol)
      {
        p1.Wins();
      }else
      {
        p2.Wins();
      }
    }
    if(secList.get(6).value == secList.get(7).value && secList.get(7).value == secList.get(8).value)
    {
      if(secList.get(6).value == p1.symbol)
      {
        p1.Wins();
      }else
      {
        p2.Wins();
      }
    }
    if(secList.get(0).value == secList.get(4).value && secList.get(4).value == secList.get(8).value)
    {
      if(secList.get(0).value == p1.symbol)
      {
        p1.Wins();
      }else
      {
        p2.Wins();
      }
    }
    if(secList.get(2).value == secList.get(4).value && secList.get(4).value == secList.get(6).value)
    {
      if(secList.get(2).value == p1.symbol)
      {
        p1.Wins();
      }else
      {
        p2.Wins();
      }
    }
    if(secList.get(1).value == secList.get(4).value && secList.get(4).value == secList.get(7).value)
    {
      if(secList.get(1).value == p1.symbol)
      {
        p1.Wins();
      }else
      {
        p2.Wins();
      }
    }

  }

  /*public void draw () //checks the objects in the arraylist
  {
    //objects in position dont matter since no one won
      //or we dont need this method and just do
        //if no winner
          then annouce draw



  } */


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
