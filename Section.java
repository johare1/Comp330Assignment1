public class Section
{
    /*fields*/
    boolean isTaken = false;
    String value = "";
    int id;

    /*constructor*/
    Section(int i, String v, boolean t)
    {
        this.id = i;
        this.value = v;
        this.isTaken = t;
    }

    public void Set(String v, boolean t)
    {
        this.value = v;
        this.isTaken = t;
    }
}
