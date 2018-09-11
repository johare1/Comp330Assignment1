public class Player
{
    /*fields*/
    boolean isCurrentTurn = false;
    String symbol = "";
    String name = "";
    boolean hasWon = false;

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
}
