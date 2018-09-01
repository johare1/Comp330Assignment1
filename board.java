/*
The board for tic tac toe

Coded by Janeen Soria
Last modified August 31, 2018
*/

import javafx.scene.canvas.GraphicsContext;
import javafx.application.Application;
import javafx.scene.image.ImageView;
import javafx.geometry.Rectangle2D;
import javafx.scene.canvas.Canvas;
import javafx.scene.shape.ArcType;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;

public class board extends Application
{
  @Override public void start(Stage stage)
  {
    Image image = new Image("file:boardImage.jpg");

    //adds a Canvas
    Canvas canvas = new Canvas(400, 300);

    //calls getGraphicsContext2D
    GraphicsContext gc = canvas.getGraphicsContext2D();

    ImageView imageView1 = new ImageView();
    imageView1.setImage(image);
    imageView1.setFitWidth(1000);
    imageView1.setFitHeight(1000);
    imageView1.setPreserveRatio(true);
    imageView1.setSmooth(true);
    imageView1.setCache(true);

    Group root = new Group();
    Scene scene = new Scene(root);
    scene.setFill(Color.BLACK);
    HBox box = new HBox();
    box.getChildren().add(imageView1);
    root.getChildren().add(box);
    root.getChildren().add(canvas);

    stage.setTitle("Please Don't Die Today");
    stage.setWidth(415);
    stage.setHeight(200);
    stage.setScene(scene);
    stage.sizeToScene();
    stage.show();


  }

  public static void main(String[] args)
  {
      launch(args);
  }





}
