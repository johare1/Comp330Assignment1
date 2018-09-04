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

import java.util.Scanner;

public class gamePlay
{
  public void startDisplay()
  {
    String player1, player2, firstMove;
    Scanner keyboard = new Scanner (System.in);


    System.out.println("Welcome to Tic Tac Toe. There will be two players in this game. Enter Player 1's name:");
    player1 = keyboard.nextLine().toUpperCase();
    System.out.println("Enter Player 2's name:");
    player2 = keyboard.nextLine().toUpperCase();
    System.out.println("Player 1's name is " + player1 + " and Player 2's name is " + player2);
    System.out.println("Who will make the first move? Enter the player's name: ");
    firstMove = keyboard.nextLine().toUpperCase();
    if (firstMove.equals(player1))
    {
      System.out.println("Player 1-" + player1 + " will move first");
      player1 = firstMove;
    }
    else if (firstMove.equals(player2))
    {
      System.out.println("Player 2-" + player2 + " will move first");
      player2 = firstMove;
    }

    else
      System.out.println("That is not one of the player's names");




  }





}
