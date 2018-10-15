
/**
 * Team-Hackintosh   
 * V 0.1
 * Diese Klasse ist die Oberklasse aller Waffen. Hier werden die gemeinsamen Attribute festgelegt. 
 */
public class Waffe extends Gegenstand
{
    // Bezugsobjekte
    private int posX,posY;
    // Attribute
    // Konstruktor
    public Waffe()
    {
        super(0,0,"Waffe");
    }

    public int getPosX()
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
    }
}
