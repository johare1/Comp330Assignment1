/*
The board for tic tac toe

Coded by Janeen Soria
Last modified September 3, 2018
*/

/*import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.layout.HBox;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color; */

import java.util.*;
import java.util.Scanner;

public class gamePlay
{
  public void startDisplay()
  {
    //testing
    String p1Name = "";
    String p2Name = "";
    Player p1 = new Player(true ,"X", p1Name); //turn, symbol, name
    Player p2 = new Player(false ,"O", p2Name);
    Scanner keyboard = new Scanner (System.in);

    System.out.println("Welcome to Tic Tac Toe. There will be two players in this game. Enter Player 1's name:");
    pl.getName()= keyboard.nextLine().toUpperCase();
    System.out.println(p1Name);





    //initialize players and sections of board

    Section s0 = new Section(0,"",false); //index, value, if taken
    Section s1 = new Section(1,"",false);
    Section s2 = new Section(2,"",false);
    Section s3 = new Section(3,"",false);
    Section s4 = new Section(4,"",false);
    Section s5 = new Section(5,"",false);
    Section s6 = new Section(6,"",false);
    Section s7 = new Section(7,"",false);
    Section s8 = new Section(8,"",false);

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





  }







}
