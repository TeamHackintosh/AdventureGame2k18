
/**
 * @Team-Hackintosh
 * @1.0 
 */
public class Tuer extends Gegenstand
{
    private boolean offen;
    public Tuer()
    {
        super("tuer");
        offen=false;
    }
    public boolean getOffen(){
        return offen;
    }
    public void setOffen(boolean pOffen){
        offen=pOffen;
    }
}
