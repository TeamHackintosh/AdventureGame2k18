
/**
 * Team-Hackintosh
 * V 0.1 
 * Diese Klasse beinhaltet alle gemeinsamen Attribute der Lebewesen. Egal ob Monster oder Held usw..
 */
public class Lebewesen
{
    // Bezugsobjekte

    // Attribute
    private int maxAusdauer; 
    private int aktAusdauer; // Ausdauer bezeichnet zugleich auch die Lebenspunkte, ist die Ausdauer = 0, stirbt das Lebewesen
    private int staerke; // bezeichnet die Kampfstaerke, bei Monstern eine Konstante, der Held sammelt im Laufe des Spiels zusätzliche Erfahrung, wodurch sich seine Staerke steigert
    private Gegenstand inHand;
    private int posX,posY;
    
    
    // Konstruktor
    public Lebewesen()
    {
        
    }
    public Lebewesen(int pMaxAusdauer, int pAktAusdauer, int pStaerke, int pPosX, int pPosY)
    {
        maxAusdauer=pMaxAusdauer;
        aktAusdauer=pAktAusdauer;
        staerke=pStaerke;
        posX=pPosX;
        posY=pPosY;
    }
    
    // Dienste
    public int getMaxAusdauer()
    {
        return maxAusdauer;
    }
    
    public void setMaxAusdauer (int pMaxAusdauer)
    {
        maxAusdauer=pMaxAusdauer;
    }
    
    public int getAktAusdauer()
    {
        return aktAusdauer;
    }
    
    public void setAktAusdauer (int pAktAusdauer)
    {
        aktAusdauer=pAktAusdauer;
    }
    
       public int getStaerke()
    {
        return staerke;
    }
    
    public void setStaerke (int pStaerke)
    {
        staerke=pStaerke;
    }
    
    public Gegenstand getInHand()
    {
        return inHand;
    }
    
    public void setInHand (Gegenstand pInHand)
    {   
        inHand=pInHand;
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
