import java.util.*;

/**
 *  This class is the main class of the "World of Zuul" application. 
 *  "World of Zuul" is a very simple, text based adventure game.  Users 
 *  can walk around some scenery. That's all. It should really be extended 
 *  to make it more interesting!
 * 
 *  To play this game, create an instance of this class and call the "play"
 *  method.
 * 
 *  This main class creates and initialises all the others: it creates all
 *  rooms, creates the parser and starts the game.  It also evaluates and
 *  executes the commands that the parser returns.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 2011.07.31
 * @adapted by TeamHackintosh
 * @version 1.0
 */

public class Game 
{
    private Parser parser;
    private static int currentHours, currentMinutes, currentSeconds;
    private static int startHours, startMinutes, startSeconds;
    private java.util.Date now; 
    private Held aktHeld;
    private Welt aktWelt;
    /**
     * Create the game and initialise its internal map.
     */
    public Game() 
    {
        //uc new Welt();
        aktHeld = new Held(100, 100, 1, 3, 11); // Spawn (3|11)
        aktWelt = new Welt();
        parser = new Parser();
        now = new java.util.Date();
        startHours = now.getHours();
        startMinutes = now.getMinutes(); 
        startSeconds = now.getSeconds(); 
    } 
    public static void main(String[] args) {
     Game newGame = new Game();
     newGame.play();         
    }
    
    
    /**
     *  Main play routine.  Loops until end of play.
     */
    public void play() 
    {            
        printWelcome();

        // Enter the main command loop.  Here we repeatedly read commands and
        // execute them until the game is over.
                
        boolean finished = false;
        while (! finished) {
            Command command = parser.getCommand();
            finished = processCommand(command);
        }
        String ausgabe="Danke, dass du dieses Spiel gespielt hast. Auf Wiedersehen!";
        gibAus(ausgabe);
        System.exit(0);
    }
    public void gibAus(String pAusgabe)
    {
        System.out.println(pAusgabe);
    }
    public static String getTime() {
        Date now2 = new java.util.Date();
        //currentHours = now2.getHours();
        currentMinutes = now2.getMinutes();
        //currentSeconds = now2.getSeconds(); 
        String timePlayed = (currentMinutes - startMinutes) + " Minuten.";
        return timePlayed;
        
    }
        
    /*public int getTime2() {
        return now.getHours();  
       
        
    }
    */
    
    /**
     * Print out the opening message for the player.
     */
    private void printWelcome()
    {
        String ausgabe="";
        ausgabe+="Willkommen zum unglaublichen AdventureGame von TeamHackintosh";
        ausgabe+="\n";
        ausgabe+="Gib 'hilfe' ein, um eine Anleitung zu erhalten.";
        ausgabe+="\n";
        ausgabe+="Du befindest dich bei: "+aktHeld.getPosX()+"|"+aktHeld.getPosY();
        gibAus(ausgabe);
    }

    /**
     * Given a command, process (that is: execute) the command.
     * @param command The command to be processed.
     * @return true If the command ends the game, false otherwise.
     */
    private boolean processCommand(Command command) 
    {
        boolean wantToQuit = false;
        if(command.isUnknown()) {
            gibAus("Ich verstehe dich nicht...");
            return false;
        }
        
        String commandWord = command.getCommandWord();
        if(command.hasSecondWord())
        {
            String secondWord = command.getSecondWord();
            if (commandWord.equals("setzeRichtungAuf")) {
                    gibAus(aktHeld.setRichtung(secondWord));
            }
            else if (commandWord.equals("nimm")) {
                    gibAus(heldNimmt(secondWord));
            }
            else{
                    gibAus("Ich verstehe dich nicht...");
            }
        }
        else{        
            if (commandWord.equals("hilfe")) {
                printHelp();
            }
            else if (commandWord.equals("gehe")) {
                gibAus(heldGeht(aktHeld.getRichtung()));
            }
            else if (commandWord.equals("beende")) {
                wantToQuit = true;
            }
            else{
                gibAus("Ich verstehe dich nicht...");
            }
        }
        return wantToQuit;
    }
    /**
     * Print out some help information.
     * Here we print some stupid, cryptic message and a list of the 
     * command words.
     */
    private void printHelp() 
    {
        String ausgabe="";
        ausgabe+="Du stehst alleine auf weiter Flur in einer dir noch unbekannten Welt. Du bist noch sehr müde und erschöpft ";
        ausgabe+="von der langen Reise.";
        ausgabe+="Mögliche Kommandos sind:\n";
        ausgabe+="'gehe', 'beende', 'setzeRichtungAuf' Himmelsrichtung,  'hilfe', 'nimm' Gegenstand";
        gibAus(ausgabe);
    }
    // Methoden, die den Helden betreffen:
    public String heldNimmt(String pName)
    {
        Gegenstand aktFeld=aktWelt.getFeld(aktHeld.getPosX(), aktHeld.getPosY());
        String ausgabe="";
        try{
            if(aktFeld.getName().equals(pName)){
                aktHeld.setInHand(aktFeld);
                ausgabe="Du hast "+aktFeld.getName()+" aufgenommen.";
            }    
            else{
                ausgabe="Auf diesem Feld befindet sich nur: "+aktFeld.getName()+".";
            }
        }
        catch(NullPointerException e){
            ausgabe="Dieses Feld ist leer.";
        }
        return ausgabe;
    }
     public String heldGeht(int pRichtung)
    {
        String ausgabe="";
        int neuePosX=aktHeld.getPosX();
        int neuePosY=aktHeld.getPosY();
        switch(pRichtung)
        {   case 0:
            neuePosX=neuePosX+1;
            if(aktWelt.feldIstBegehbar(neuePosX, neuePosY)==false){
                  ausgabe="\nDu kannst nicht in diese Richtung gehen, weil dort ein Hindernis steht.";
               }
               else{
                   aktHeld.setPosX(neuePosX);
                   ausgabe="\nDu gehst einen Schritt nach Osten";
                   if(aktWelt.feldIstLeer(neuePosX, neuePosY)==false){
                   ausgabe+="\nAuf dem Feld, auf das du gehst, liegt ein "+aktWelt.getFeld(neuePosX, neuePosY).getName();
              }
            }
            break;
            
            case 1:
            neuePosY=neuePosY-1;
            if(aktWelt.feldIstBegehbar(neuePosX, neuePosY)==false){
                  ausgabe="\nDu kannst nicht in diese Richtung gehen, weil dort ein Hindernis steht.";
               }
               else{
                   aktHeld.setPosY(neuePosY);
                   ausgabe="\nDu gehst einen Schritt nach Norden";
                   if(aktWelt.feldIstLeer(neuePosX, neuePosY)==false){
                   ausgabe+="\nAuf dem Feld, auf das du gehst, liegt ein "+aktWelt.getFeld(neuePosX, neuePosY).getName();
              }
            }
            break;
            
            case 2:
            neuePosX=neuePosX-1;
            if(aktWelt.feldIstBegehbar(neuePosX, neuePosY)==false){
                  ausgabe="\nDu kannst nicht in diese Richtung gehen, weil dort ein Hindernis steht.";
               }
               else{
                   aktHeld.setPosX(neuePosX);
                   ausgabe="\nDu gehst einen Schritt nach Westen";
                   if(aktWelt.feldIstLeer(neuePosX, neuePosY)==false){
                   ausgabe+="\nAuf dem Feld, auf das du gehst, liegt ein "+aktWelt.getFeld(neuePosX, neuePosY).getName();
              }
            }
            break;
            
            case 3:
            neuePosY=neuePosY+1;
            if(aktWelt.feldIstBegehbar(neuePosX, neuePosY)==false){
                  ausgabe="\nDu kannst nicht in diese Richtung gehen, weil dort ein Hindernis steht.";
               }
               else{
                   aktHeld.setPosY(neuePosY);
                   ausgabe="\nDu gehst einen Schritt nach Sueden";
                   if(aktWelt.feldIstLeer(neuePosX, neuePosY)==false){
                   ausgabe+="\nAuf dem Feld, auf das du gehst, liegt ein "+aktWelt.getFeld(neuePosX, neuePosY).getName();
              }
            }
            break;
        }
        ausgabe+="\nDeine aktuelle Position ist: "+aktHeld.getPosX()+"|"+aktHeld.getPosY();
        return ausgabe;
    }   
}
