
/**
 * Beschreiben Sie hier die Klasse Schluessel.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Schluessel extends Gegenstand
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private Tuer tuer;

    /**
     * Konstruktor für Objekte der Klasse Schluessel
     */
    public Schluessel()
    {
        
    }
    public Schluessel(Tuer pTuer)
    {
        tuer=pTuer;
    }
    //Methoden
    public void setTuer(Tuer pTuer)
    {
        tuer=pTuer;
    }
    public Tuer getTuer()
    {
        return tuer;
    }
    public boolean oeffne(Tuer pTuer)
    {
        if(pTuer==tuer)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
