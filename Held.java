
/**
 * @author 
 * @version 
 */
public class Held extends Lebewesen
{
    // Bezugsobjekte

    // Attribute
    private int richtung;

    // Konstruktor
    public Held()
    {   setPosY(0);
        setPosX(0);

    }

    // Dienste
    public void gehe ()
    {
        
    }
    
    public int getRichtung()
    {
        return richtung;
    }
    
    public void setRichtung(int pRichtung)
    {
       richtung = pRichtung;
    }
    
    public void drehe (int pRichtung)
    {
        switch(pRichtung)
        {case 0: richtung= 0;
            System.out.println("Du blickst aktuell in Richtung Osten");
            
        case 1: richtung= 1;
            System.out.println("Du blickst aktuell in Richtung Norden");
            
        case 2: richtung= 2;
            System.out.println("Du blickst aktuell in Richtung Westen");
            
        case 3: richtung= 3;
            System.out.println("Du blickst aktuell in Richtung Süden");
        }
    }
}
