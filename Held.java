
/**
 * @author 
 * @version 
 */
public class Held extends Lebewesen
{
    private Rucksack rucksack;
    public Held()
    {   
        super("held");
    }
    public Held(int pMaxAusdauer, int pAktAusdauer, int pStaerke, int pPosX, int pPosY, int pRichtung, Gegenstand pInHand)
    {
        super(pMaxAusdauer, pAktAusdauer, pStaerke, pPosX, pPosY, "held", pRichtung, pInHand);
    }
    public Rucksack getRucksack(){
        return rucksack;
    }
    public void setRucksack(Rucksack pRucksack){
        rucksack=pRucksack;
    }
}
