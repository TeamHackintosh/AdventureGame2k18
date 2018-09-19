
/**
 * Team-Hackintosh
 * V 0.1 
 * Diese Klasse beinhaltet alle gemeinsamen Attribute der Lebewesen. Egal ob Monster oder Held usw..
 */
public class Lebewesen
{
    // Bezugsobjekte

    // Attribute
    private int maxLebenspunkte;
    private int aktLebenspunkte;
    private int erfPunkte;
    private Gegenstand inHand;
    private int maxRüstung;
    private int aktRüstung;
    private int positionX;
    private int positionY;
    
    
    
    // Konstruktor
    public Lebewesen()
    {
        
    }

    // Dienste
    public int getMaxLebenspunkte()
    {
        return maxLebenspunkte;
    }
    
    public void setMaxLebenspunkte (int pMaxLebenspunkte)
    {
        maxLebenspunkte=pMaxLebenspunkte;
    }
    
    public int getAktLebenspunkte()
    {
        return aktLebenspunkte;
    }
    
    public void setAktLebenspunkte (int pAktLebenspunkte)
    {
        aktLebenspunkte=pAktLebenspunkte;
    }
    
       public int getErfPunkte()
    {
        return erfPunkte;
    }
    
    public void setErfPunkte (int pErfPunkte)
    {
        erfPunkte=pErfPunkte;
    }
    
    public Gegenstand getInHand()
    {
        return inHand;
    }
    
    public void setInHand (Gegenstand pInHand)
    {   
        inHand=pInHand;
    }
    
       public int getMaxRüstung()
    {
        return maxRüstung;
    }
    
    public void setMaxRüstung (int pMaxRüstung)
    {
        maxRüstung=pMaxRüstung;
    }
    
       public int getAktRüstung()
    {
        return aktRüstung;
    }
    
    public void setAktRüstung (int pAktRüstung)
    {
        aktRüstung=pAktRüstung;
    }
    
    public int getPosX()
    {
        return positionX;
    }
    
    public void setPosX (int pPosX)
    {
        positionX=pPosX;
    }
    
       public int getPosY()
    {
        return positionY;
    }
    
    public void setPosY (int pPosY)
    {
        positionY=pPosY;
    }
    
    
   
}
