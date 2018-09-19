
/**
 * @author 
 * @version 
 */
public class Held extends Lebewesen
{
    private int richtung;
    
    public Held()
    {   setPosY(9);
        setPosX(9);

    }
    
    public void gehe (int pRichtung)
    {
        switch(pRichtung)
        {   case 0: richtung= 0;
            posX++;
            System.out.println("Du gehst einen Schritt nach Osten");
            break;
            
            case 1: richtung= 1;
            posY--;
            System.out.println("Du gehst einen Schritt nach Norden");
            break;
            
            case 2: richtung= 2;
            posX--;
            System.out.println("Du gehst einen Schritt nach Westen");
            break;
            
            case 3: richtung= 3;
            posY++;
            System.out.println("Du gehst einen Schritt nach Süden");
            break;
        }
    }
    
    public void drehe (int pRichtung)
    {
        switch(pRichtung)
        {   case 0: richtung= 0;
            System.out.println("Du blickst aktuell in Richtung Osten");
            
            case 1: richtung= 1;
            System.out.println("Du blickst aktuell in Richtung Norden");
            
            case 2: richtung= 2;
            System.out.println("Du blickst aktuell in Richtung Westen");
            
            case 3: richtung= 3;
            System.out.println("Du blickst aktuell in Richtung Süden");
        }
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
