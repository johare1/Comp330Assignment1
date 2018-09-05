/*
The board for tic tac toe

Coded by Janeen Soria
Last modified September 3, 2018
*/

import javafx.application.Application;
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
import javafx.scene.paint.Color;
import java.util.*;

//import java.util.Scanner;

public class board extends Application
{
  public static void main(String[] args)
  {
      launch(args);
  }

  @Override public void start(Stage stage)
  {
    Canvas canvas = new Canvas(500, 500); //adds a Canvas (the window itself), graphics are put in it
    GraphicsContext gc = canvas.getGraphicsContext2D();

    Image image = new Image("file:numberedBoard.png");
    ImageView imageView1 = new ImageView();
    imageView1.setImage(image);
    imageView1.setFitWidth(500);
    imageView1.setFitHeight(500);
    imageView1.setPreserveRatio(true);
    imageView1.setSmooth(true);
    imageView1.setCache(true);

    HBox box = new HBox(); //helps manage sizing image
    box.getChildren().add(imageView1);

    Group root = new Group(); //holds observable children (what can be in a group)
    root.getChildren().add(box);
    root.getChildren().add(canvas);

    Scene scene = new Scene(root); //like the backgound of the canvas
    scene.setFill(Color.WHITE);

    stage.setTitle("Tic Tac Toe");
    stage.setWidth(415); //affects where the window will appear on screen
    stage.setHeight(200);
    stage.setScene(scene);
    stage.sizeToScene();
    stage.show();

    /*
    Circle node0 = new Circle();
    node0.setCenterX(453);
    node0.setCenterY(178);
    node0.setRadius(5);
    root.getChildren().add(node0);
    */
    Scanner keyboard = new Scanner (System.in);
    /*TODO set user input to these strings*/
    String p1Name = "";
    String p2Name = "";

    gamePlay play = new gamePlay();
    play.startDisplay();


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
