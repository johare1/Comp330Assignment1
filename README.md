# Tic Tac Toe
This assignment is coded by John O'Hare and Janeen Soria for our Software Engineering course, and it is based on the game Tic Tac Toe, which can be fully explained here: https://www.exploratorium.edu/brain_explorer/tictactoe.html

## Our Process
###### System Functionality
- We coded this project in Java because it is a language we are both familiar in, it easily allows us to implement object-oriented programming and data structures, and IDEs and text editors support it.
- John chose to use an IDE, IntelliJ, to test and run the program while Janeen used a text editor, Atom, and the command prompt to test and run the code.

###### How to Run the Code
You need Java installed in your device in order to run the program. There are four classes: board, GamePlay, Player, and Section. You must compile the Player class and the Section class. Then you compile the GamePlay class. Once you compile those classes, you compile the board class and then you run the board class since it contains the main method.

###### Our Approach
- The board
  - We considered using JavaFX and making the board a thread so the board does not have to updated and print after every move.
    - We decided to use a text-based board because it would be simpler to create a List and have the players' symbols be stored in it. A List was more flexible because it can be easily accessed in multiple methods.
- Separate classes
  - We created a Section class so the program can check if it is occupied, and we created a Player class to allow users to input their name, have the "X" or "O" symbol, and to manage whose turn it is.
  - The GamePlay class was created so the game logic was separate from the main method. The GamePlay class contains methods that depend on each other, and it is simpler to have the dependencies when they are in the same class.
