/**
 * Team-Hackintosh 
 * V 0.1
 * Diese Klasse beinhaltet alle Gegenstände des Spieles. Egal ob Waffe oder Fackel.
 */
public class Gegenstand
{
    // Bezugsobjekte

    // Attribute
    private String name;
    //private int posX,posY;
    // Konstruktor
    public Gegenstand()
    {

    }
    
     // Konstruktor
    public Gegenstand(String pName)
    {
        name = pName;
    }

    // Dienste
    
    public void setName(String pName)
    {
        name=pName;
    } 
    public String getName()
    {
        return name;
    }



    /*public int getPosX()
    {
        return posX;
    }
    public int getPosY()
    {
        return posY;
    }
    public void setPosX(int pPosX)
    {
        posX=pPosX;
    }
    public void setPosY(int pPosY)
    {
        posY=pPosY;
    }*/
}
