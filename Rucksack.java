
/**
 * @author 
 * @version 
 */
public class Rucksack extends Gegenstand
{
    // Bezugsobjekte

    // Attribute
    private Gegenstand[] inhalt;
    private int groesse;
    // Konstruktor
    public Rucksack()
    {
        super("rucksack");
        groesse=10;
        inhalt=new Gegenstand[groesse];
    }
    public Rucksack(int pGroesse)
    {
        super("rucksack");
        groesse=pGroesse;
        inhalt=new Gegenstand[groesse];
    }
    // Dienste
    public void setGroesse(int pGroesse)
    {
        groesse=pGroesse;
    }
    public int getGroesse()
    {
        return groesse;
    }
    public boolean packeEin(Gegenstand pGegenstand)
    {
        for(int i=0; i<groesse; i++)
        {
            if(inhalt[i]==null)
            {
                inhalt[i]=pGegenstand;
                return true;
            }
        }
        return false;
    }
    public int sucheGegenstand(Gegenstand pGegenstand) // wenn die Methode als Position die Größe des Rucksacks zurückgibt, ist der Gegenstand nicht im Rucksack
    {
        int pos=groesse;
        for(int i=0; i<groesse; i++)
        {
            if(inhalt[i]==pGegenstand)
            {
                pos=i;
                break;
            }
        }
        return pos;
    }
    public boolean packeAus(Gegenstand pGegenstand)
    {
        int pos=sucheGegenstand(pGegenstand);
        if(pos==groesse)
        {
            return false;
        }
        else
        {
            inhalt[pos]=null;
            return true;
        }
    }
}
