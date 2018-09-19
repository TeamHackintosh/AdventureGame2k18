

import javax.microedition.midlet.MIDlet;

/**
 * Klasse Wand - Beschreiben Sie Ihr MIDlet hier
 *
 * @author     (Ihr Name)
 * @version    (eine Versionsnummer oder ein Datum)
 */
public class Wand extends MIDlet
{
   /**
    * Wird von der Anwendungs-Management-Software (AMS) aufgerufen, wenn
    * die Ausführung des MIDlets beginnt. Die AMS ist die Software auf
    * einem Gerät, die den Download und den Lebenszyklus der MIDlets
    * verwaltet. Wenn dieser Konstruktor zurückkehrt, versetzt die AMS
    * dieses MIDlet in den Zustand "pausiert".
    */
    public Wand()
    {
        // Implementieren Sie alle notwendigen Initialisierung für Ihr MIDlet.
    }

   /**
    * Wird von der AMS aufgerufen, um das MIDlet vom Zustand "pausiert" in 
    * den Zustand "aktiv" zu versetzten. Während das MIDlet aktiv ist, kann
    * die AMS seine Ausführung durch Aufruf von pauseApp() suspendieren.
    */
    public void startApp()
    {
        // Belegen Sie gemeinsame Resourcen wie z.B. Netzwerkverbindungen oder Geräte.
    }

   /**
    * Wird von der AMS aufgerufen, um das MIDlet vom Zustand "aktiv" in 
    * den Zustand "pausiert" zu versetzten. Während das MIDlet pausiert, 
    * kann die AMS seine Ausführung durch Aufruf von startApp() fortsetzen.
    * Die AMS kann den Zustand des MIDlets während seiner Ausführung 
    * beliebig oft zwischen aktiv und pausiert hin und her wechseln.
    */
    public void pauseApp()
    {
        // Geben Sie die in startApp() belegten gemeinsamen Resourcen wieder frei.
    }

   /**
    * Wird von der AMS aufgerufen, um die Ausführung des MIDlets zu beenden.
    * Wenn diese Methode zurückkehrt, geht dieses MIDlet in den Zustand 
    * "zerstört" über.
    *
    * @param unconditional   Ob das MIDlet zerstört werden soll. Wenn wahr,
    *                        wird das MIDlet unabhängig vom Ergebnis dieser 
    *                        Methode in den Zustand "zerstört" versetzt. Wenn
    *                        falsch, kann das MIDlet eine MIDletStateChangeException
    *                        erzeugen, um mitzuteilen, dass es noch nicht zerstört
    *                        werden möchte.
    */
    public void destroyApp(boolean unconditional)
    {
        // Geben Sie die im Kosntrutor belegten Resourcen wieder frei.
    }
}
