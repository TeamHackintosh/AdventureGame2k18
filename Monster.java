
/**
 * @author 
 * @version 
 */
public class Monster extends Lebewesen
{
    // Bezugsobjekte

    // Attribute

    // Konstruktor
    public Monster()
    {
        super("monster");
    }
    public Monster(int pMaxAusdauer, int pAktAusdauer, int pStaerke, int pPosX, int pPosY, int pRichtung, Gegenstand pInHand)
    {
        super(pMaxAusdauer, pAktAusdauer, pStaerke, pPosX, pPosY, "monster", pRichtung, pInHand);
    }
    // Dienste

}
