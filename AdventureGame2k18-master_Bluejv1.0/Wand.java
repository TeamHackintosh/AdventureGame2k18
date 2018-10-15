
/**
 * @Sam Horn & Moritz Wagner 
 * @1.0 
 */
public class Wand extends Gegenstand
{
    private int posX,posY;
    
    public Wand()
    {
        super(0,0,"wand");
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
