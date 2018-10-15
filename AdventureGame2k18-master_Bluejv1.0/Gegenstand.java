/**
 * Team-Hackintosh 
 * V 0.1
 * Diese Klasse beinhaltet alle Gegenstände des Spieles. Egal ob Waffe oder Fackel.
 */
public class Gegenstand
{
    // Bezugsobjekte

    // Attribute
    private int haltbarkeit;
    private int schaden;
    private String name;
    
    // Konstruktor
    public Gegenstand()
    {

    }
    
     // Konstruktor
    public Gegenstand(int pHaltbarkeit, int pSchaden, String pName)
    {
        haltbarkeit = pHaltbarkeit;
        schaden = pSchaden;
        name = pName;
    }

    // Dienste
    public void setHaltbarkeit(int pHaltbarkeit)
    {
        haltbarkeit=pHaltbarkeit;
    }  
    
    public void setSchaden(int pSchaden)
    {
        schaden=pSchaden;
    }    
    public void setName(String pName)
    {
        name=pName;
    } 
    public String getName()
    {
        return name;
    }
}
