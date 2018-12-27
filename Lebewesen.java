
/**
 * Team-Hackintosh
 * V 0.1 
 * Diese Klasse beinhaltet alle gemeinsamen Attribute der Lebewesen. Egal ob Monster oder Held usw..
 */
public class Lebewesen
{
    // Bezugsobjekte

    // Attribute
    private int maxLeben; 
    private int aktLeben; // Leben bezeichnet zugleich auch die Lebenspunkte, ist die Leben = 0, stirbt das Lebewesen
    private int staerke; // bezeichnet die Kampfstaerke, bei Monstern eine Konstante, der Held sammelt im Laufe des Spiels zusätzliche Erfahrung, wodurch sich seine Staerke steigert
    private Gegenstand inHand;
    private int posX,posY;
    private String art;
    private int richtung;
    // Konstruktor
    public Lebewesen()
    {
        inHand=null;
    }
    public Lebewesen(int pMaxLeben, int pAktLeben, int pStaerke, int pPosX, int pPosY, String pArt, int pRichtung)
    {
        maxLeben=pMaxLeben;
        aktLeben=pAktLeben;
        staerke=pStaerke;
        posX=pPosX;
        posY=pPosY;
        inHand=null;
        art=pArt;
        richtung = pRichtung;
    }
    
    // Dienste
    public int getMaxLeben()
    {
        return maxLeben;
    }
    
    public void setMaxLeben (int pMaxLeben)
    {
        maxLeben=pMaxLeben;
    }
    
    public int getAktLeben()
    {
        return aktLeben;
    }
    
    public void setAktLeben (int pAktLeben)
    {
        aktLeben=pAktLeben;
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
    
    public boolean handIstLeer(){
        if(inHand==null)
        {
            return true;
        }
        else{
            return false;
        }
    }
    
    public void setInHand (Gegenstand pInHand)
    {   
        inHand=pInHand;
    }
    
    public void leereInHand(){
        inHand=null;
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
    
    public String getArt(){
        return art;
    }
    
    public void setArt(String pArt){
        art=pArt;
    }
    
    public int getRichtung()
    {
        return richtung;
    }
    
    public void setRichtung(int pRichtung)
    {
       richtung = pRichtung;
    }
}
