
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
    private int posX;
    private int posY;
    
    
    
    // Konstruktor
    public Lebewesen()
    {
        
    }
    
    public Lebewesen(int pMaxLebenspunkte, int pAktLebenspunkte, int pErfPunkte, int pMaxRüstung, int pAktRüstung, int pPosX,int pPosY)
    {
        maxLebenspunkte=pMaxLebenspunkte;
        aktLebenspunkte=pAktLebenspunkte;
        erfPunkte=pErfPunkte;
        maxRüstung=pMaxRüstung;
        aktRüstung=pAktRüstung;
        posX=pPosX;
        posY=pPosY;
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
        return posX;
    }
    
    public void setPosX (int pPosX)
    {
        posX=pPosX;
    }
    
       public int getPosY()
    {
        return posY;
    }
    
    public void setPosY (int pPosY)
    {
        posY=pPosY;
    }
}
