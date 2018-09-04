/*
The board for tic tac toe

Board coded by Janeen Soria
Last modified September 4, 2018
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

    //location of where the points will be
    Circle box0 = new Circle();
    box0.opacityProperty().set(0.5);
    box0.setCenterX(73); //lower number makes it appear more to the left
    box0.setCenterY(87); //lower number makes it appear higher
    box0.setRadius(20);
    root.getChildren().add(box0);

    Circle box1 = new Circle();
    box1.opacityProperty().set(0.5);
    box1.setCenterX(250);
    box1.setCenterY(87);
    box1.setRadius(20);
    root.getChildren().add(box1);

    Circle box2 = new Circle();
    box2.opacityProperty().set(0.5);
    box2.setCenterX(417);
    box2.setCenterY(87);
    box2.setRadius(20);
    root.getChildren().add(box2);

    Circle box3 = new Circle();
    box3.opacityProperty().set(0.5);
    box3.setCenterX(73);
    box3.setCenterY(250);
    box3.setRadius(20);
    root.getChildren().add(box3);

    Circle box4 = new Circle();
    box4.opacityProperty().set(0.5);
    box4.setCenterX(250);
    box4.setCenterY(250);
    box4.setRadius(20);
    root.getChildren().add(box4);

    Circle box5 = new Circle();
    box5.opacityProperty().set(0.5);
    box5.setCenterX(417);
    box5.setCenterY(250);
    box5.setRadius(20);
    root.getChildren().add(box5);

    Circle box6 = new Circle();
    box6.opacityProperty().set(0.5);
    box6.setCenterX(417);
    box6.setCenterY(420);
    box6.setRadius(20);
    root.getChildren().add(box6);

    Circle box7 = new Circle();
    box7.opacityProperty().set(0.5);
    box7.setCenterX(250);
    box7.setCenterY(420);
    box7.setRadius(20);
    root.getChildren().add(box7);

    Circle box8 = new Circle();
    box8.opacityProperty().set(0.5);
    box8.setCenterX(73);
    box8.setCenterY(420);
    box8.setRadius(20);
    root.getChildren().add(box8);


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
