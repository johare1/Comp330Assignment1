public class Player {
    /*fields*/
    boolean isCurrentTurn = false;
    String symbol = "";
    String name = "";

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

}
