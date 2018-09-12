public class Player
{
    /*fields*/
    boolean isCurrentTurn = false;
    String symbol = "";
    String name = "";
    boolean hasWon = false;
    boolean isDraw = false;

    /*constructor*/
    Player(boolean c, String s, String n)
    {
        this.isCurrentTurn = c;
        this.symbol = s;
        this.name = n;
    }

    String getName()
    {
        return this.name;
    }
    String getSymbol()
    {
        return this.symbol;
    }


    public void Wins()
    {
        System.out.println(name + " has Won the game.");
        hasWon = true;
    }

    public void Draw()
    {
        System.out.println("There is a draw.");
        isDraw = true;
    }
}
