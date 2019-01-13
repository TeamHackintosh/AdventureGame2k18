
/**
 * @Team-Hackintosh
 * @version 
 */
public class Mensch  extends Lebewesen
{
    
    // Attribute
    private String name;
    // Konstruktor
    public Mensch()
    {
        super("mensch");
    }
    public Mensch(int pPosX, int pPosY, String pArt, String pName, int pRichtung, Gegenstand pInHand)
    {
        super(pPosX, pPosY, "held", pRichtung, pInHand);
        name=pName;
    }
    // Dienste
    public String getName(){
        return name;
    }
    public void setName(String pName){
        name=pName;
    }
}
