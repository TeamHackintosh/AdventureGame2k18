
/**
 * @Sam Horn & Moritz Wagner 
 * @1.0
 */
public class Baum extends Gegenstand
{
    private int posX,posY;

    public Baum()
    {
        super(0,0,"baum");
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
