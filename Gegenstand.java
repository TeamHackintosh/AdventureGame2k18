
/**
 * Team-Hackintosh 
 * V 0.1
 * Diese Klasse beinhaltet alle Gegenstände des Spieles. Egal ob Waffe oder Fackel.
 */
public class Gegenstand
{
    // Bezugsobjekte

    // Attribute
    private int Haltbarkeit;
    private int Schaden;
    
    // Konstruktor
    public Gegenstand()
    {

    }

    // Dienste
    public void setHaltbarkeit(int pHaltbarkeit)
    {
        Haltbarkeit=pHaltbarkeit;
    }  
    
    public void setSchaden(int pSchaden)
    {
        Schaden=pSchaden;
    }    

}
