
/**
 * @Sam Horn & Moritz Wagner 
 * @1.0 
 */
public class Busch extends Gegenstand
{
    private int posX,posY;
    
    public Busch()
    {
        super(0,0,"busch");
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
