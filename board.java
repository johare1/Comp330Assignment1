import java.util.*;
import java.util.Scanner;

public class board
{
  public static void main(String[] args)
  {
    String[] box = {"0", "1", "2", "3", "4", "5", "6", "7", "8"};

    System.out.println(  "\n\n\t\t" + box[0] + "   | " + box[1] + "  | " + box[2]);
    System.out.println(  " \t\t    |    |   " );
    System.out.println(  " \t\t ___|____|___ " );
    System.out.println(  "\n\n\t\t" + box[3] + "   | " + box[4] + "  | " + box[5]);
    System.out.println(  " \t\t    |    |   " );
    System.out.println(  " \t\t ___|____|___ " );
    System.out.println(  "\n\n\t\t" + box[6]+ "   | " +box[7] + "  | " + box[8]);
    System.out.println(  " \t\t    |    |   " );
    System.out.println(  " \t\t    |    |   " );


    Scanner keyboard = new Scanner (System.in);
    /*TODO set user input to these strings*/
    String p1Name = "";
    String p2Name = "";

    //gamePlay play = new gamePlay();
    //play.startDisplay();


    /*initialize players and sections of board*/
    Player p1 = new Player(true ,"X", p1Name);
    Player p2 = new Player(false ,"O", p2Name);

    Section s0 = new Section(0,"",false);
    Section s1 = new Section(1,"",false);
    Section s2 = new Section(2,"",false);
    Section s3 = new Section(3,"",false);
    Section s4 = new Section(4,"",false);
    Section s5 = new Section(5,"",false);
    Section s6 = new Section(6,"",false);
    Section s7 = new Section(7,"",false);
    Section s8 = new Section(8,"",false);
    int selSection;

    List<Section> sectionList = new ArrayList<Section>();

    sectionList.add(s0);
    sectionList.add(s1);
    sectionList.add(s2);
    sectionList.add(s3);
    sectionList.add(s4);
    sectionList.add(s5);
    sectionList.add(s6);
    sectionList.add(s7);
    sectionList.add(s8);

    //TODO set loop to put the following game mechanics in
    System.out.println("Player 1: please select your move");
    selSection = keyboard.nextInt();

    if(sectionList.get(selSection).isTaken == false){
      sectionList.get(selSection).value = p1.symbol;
      sectionList.get(selSection).isTaken = true;
      //TODO run method here to set board position
    }
    else
    {
      System.out.println("This space has already been taken. Choose another");
    }
  }
}
