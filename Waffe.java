
/**
 * Team-Hackintosh   
 * V 0.1
 * Diese Klasse ist die Oberklasse aller Waffen. Hier werden die gemeinsamen Attribute festgelegt. 
 */
public class Waffe extends Gegenstand
{
    // Bezugsobjekte
    private int aktHaltbarkeit;
    private int maxHaltbarkeit;
    private int schaden;
    
    // Attribute
    // Konstruktor
    public Waffe()
    {
        super("waffe");
    }
    public Waffe(int pMaxHaltbarkeit, int pSchaden)
    {
        super("waffe");
        maxHaltbarkeit = pMaxHaltbarkeit;
        aktHaltbarkeit = maxHaltbarkeit;
        schaden = pSchaden;
    }
    public void setMaxHaltbarkeit(int pMaxHaltbarkeit)
    {
        maxHaltbarkeit=pMaxHaltbarkeit;
    }  
    public void setAktHaltbarkeit(int pAktHaltbarkeit)
    {
        aktHaltbarkeit=pAktHaltbarkeit;
    }  
    public void setSchaden(int pSchaden)
    {
        schaden=pSchaden;
    }    
    public int getMaxHaltbarkeit()
    {
        return maxHaltbarkeit;
    }  
    public int getAktHaltbarkeit()
    {
        return aktHaltbarkeit;
    }  
    public int getSchaden()
    {
        return schaden;
    }   
}
