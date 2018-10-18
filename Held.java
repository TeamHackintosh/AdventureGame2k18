
/**
 * @author 
 * @version 
 */
public class Held extends Lebewesen
{
    private int richtung;
    public Held()
    {   
        
    }
    public Held(int pMaxAusdauer, int pAktAusdauer, int pStaerke, int pPosX, int pPosY)
    {
        super(pMaxAusdauer, pAktAusdauer, pStaerke, pPosX, pPosY);
    }
    public int getRichtung()
    {
        return richtung;
    }
    
    public void setRichtung(int pRichtung)
    {
       richtung = pRichtung;
    }
    
    public String setRichtung(String pRichtung){
            String ausgabe="";
            int richtung=4;
            switch (pRichtung)
            {
                case "Osten": richtung= 0;
                break;
                case "Norden": richtung= 1;
                break;
                case "Westen": richtung= 2;
                break;
                case "Sueden": richtung= 3;
                break;
            }
            if(richtung<4){
                setRichtung(richtung);
                ausgabe="Du schaust jetzt in Richtung "+pRichtung;
            }
            else{
                ausgabe="Dies ist keine zulässige Richtungsangabe.";
            }
            return ausgabe;
        }
}
