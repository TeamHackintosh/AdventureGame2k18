import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.text.DefaultCaret;
/**
 * Beschreiben Sie hier die Klasse GUI.
 * 
 * @Team-Hackintosh
 * @v2.0
 */
public class GUI extends JFrame implements ActionListener
{
    private static int currentHours, currentMinutes, currentSeconds;
    private static int startHours, startMinutes, startSeconds;
    private java.util.Date now; 
    private Held aktHeld;
    private Welt aktWelt;
    private Monster monster1, monster2, monster3;
    private Lebewesen[] akteure; 
    private Lebewesen aktLebewesen; //das Lebewesen, dass sich auf dem gleichen Feld, wie der Held befindet, kann auch null sein
    private Random random;
    //GUI
    private JFrame meinJFrame;
    private JLabel xFeld, yFeld;
    private JPanel richtungPanel, positionPanel, hauptPanel, feldPanel, gegenstandPanel, personPanel, handPanel, handButtonPanel, rucksackPanel, untenPanel, waffenPanel;
    private JButton nordButton, suedButton, westButton, ostButton, geheButton, nimmButton, kampfButton, inRButton, ausHandButton, inHandButton, ausRButton, hilfeButton, beendeButton;
    private JLabel xLabel, yLabel, nordLabel, pfeilLabel, nimmLabel, personLabel, inHandLabel, haltbarkeitLabel, schadenLabel;
    private ImageIcon rechtsP, linksP, hochP, runterP, hilfe, schwerter;
    private JComboBox<Object> rucksackBox;
    private FlowLayout standardLayout;
    
    /**
     * Konstruktor für Objekte der Klasse GUI
     */
    public GUI()
    {
        //Welt und Akteure erzeugen und positionieren
        aktHeld = new Held(100, 100, 1, 13, 0, 0, null); // Spawn (13|0)
        aktWelt = new Welt(); 
        monster1 = new Monster(5, 5, 3, 14, 4, 0, null); // Spawn (14|4)
        monster2 = new Monster(5, 5, 3, 28, 2, 0, null); // Spawn (28|2)
        monster3 = new Monster(5, 5, 3, 25, 3, 0, null); // Spawn (25|3)
        akteure = new Lebewesen[3];
        akteure[0] = monster1;
        akteure[1] = monster2;
        akteure[2] = monster3;
        //Hilfsobjekte
        now = new java.util.Date();
        startHours = now.getHours();
        startMinutes = now.getMinutes(); 
        startSeconds = now.getSeconds(); 
        random = new Random();
        //Elemente der GUI
        meinJFrame = new JFrame();
        meinJFrame.setTitle("AdventureGUI 2.0");
        meinJFrame.setSize(800, 600);
        richtungPanel = new JPanel();
        positionPanel = new JPanel();
        hauptPanel = new JPanel();
        feldPanel = new JPanel();
        standardLayout = new FlowLayout(FlowLayout.LEFT,5,5);
        schwerter = new ImageIcon("schwerter.svg");
        //Richtung-Panel
        richtungPanel.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        
        nordButton = new JButton("N");
        nordButton.addActionListener(this);
        c.gridx = 1;
        c.gridy = 0;
        richtungPanel.add(nordButton, c);
        
        ostButton = new JButton("O");
        ostButton.addActionListener(this);
        c.gridx = 2;
        c.gridy = 1;
        richtungPanel.add(ostButton, c);
        
        suedButton = new JButton("S");
        suedButton.addActionListener(this);
        c.gridx = 1;
        c.gridy = 2;
        richtungPanel.add(suedButton, c);
        
        westButton = new JButton("W");
        westButton.addActionListener(this);
        c.gridx = 0;
        c.gridy = 1;
        richtungPanel.add(westButton, c);
        
        rechtsP = new ImageIcon("ArrowRight.png");
        linksP = new ImageIcon("ArrowLeft.png");
        hochP = new ImageIcon("ArrowTop.png");
        runterP = new ImageIcon("ArrowBottom.png");
        
        pfeilLabel = new JLabel(rechtsP);
        
        c.insets = new Insets(10, 10, 10, 10);
        c.gridx = 1;
        c.gridy = 1;
        richtungPanel.add(pfeilLabel, c);
       
        richtungPanel.setBorder(BorderFactory.createTitledBorder("Richtung"));
        
        //Position-Panel
        positionPanel.setLayout(standardLayout);
        xLabel = new JLabel("x:");
        yLabel = new JLabel("y:");
        xFeld = new JLabel(intToString(aktHeld.getPosX()));
        yFeld = new JLabel(intToString(aktHeld.getPosY()));
        positionPanel.add(xLabel);
        positionPanel.add(xFeld);
        positionPanel.add(yLabel);
        positionPanel.add(yFeld);
        
        geheButton = new JButton("Gehe");
        geheButton.addActionListener(this);
        positionPanel.add(geheButton);
        
        positionPanel.setBorder(BorderFactory.createTitledBorder("Position"));
        
        //feld-Panel
        feldPanel.setLayout(standardLayout);
        gegenstandPanel = new JPanel();
        gegenstandPanel.setLayout(standardLayout);
        nimmLabel = new JLabel("leer");
        nimmButton = new JButton("Aufnehmen");
        nimmButton.addActionListener(this);
        gegenstandPanel.setVisible(false);
        gegenstandPanel.add(nimmLabel);
        gegenstandPanel.add(nimmButton);
        
        personPanel = new JPanel();
        personLabel = new JLabel("");
        kampfButton = new JButton("Angreifen");
        kampfButton.addActionListener(this);
        personPanel.add(personLabel);
        personPanel.add(kampfButton);
        personPanel.setVisible(false);

        feldPanel.add(gegenstandPanel);
        feldPanel.add(personPanel);
        
        feldPanel.setBorder(BorderFactory.createTitledBorder("Dieses Feld"));
        
        //inHand-Panel
        handPanel = new JPanel();
        handPanel.setLayout(standardLayout);
        handPanel.setBorder(BorderFactory.createTitledBorder("In Hand"));
        ausHandButton = new JButton("Wegwerfen");
        ausHandButton.addActionListener(this);
        ausHandButton.setVisible(false);
        inRButton = new JButton("In den Rucksack verschieben");
        inRButton.addActionListener(this);
        inRButton.setVisible(false);
        handPanel.add(inRButton);
        handPanel.add(ausHandButton);
        
        inHandLabel = new JLabel("");
        haltbarkeitLabel = new JLabel("");
        schadenLabel = new JLabel("");
        waffenPanel = new JPanel();
        waffenPanel.setVisible(false);
        
        waffenPanel.add(haltbarkeitLabel);
        waffenPanel.add(schadenLabel);
        handPanel.add(inHandLabel);
        handPanel.add(waffenPanel);
        
        
        //Rucksack-Panel
        rucksackPanel = new JPanel();
        rucksackPanel.setLayout(standardLayout);
        rucksackPanel.setBorder(BorderFactory.createTitledBorder("rucksack"));
        inHandButton = new JButton("In die Hand nehmen");
        inHandButton.addActionListener(this);
        rucksackBox = new JComboBox();
        
        rucksackPanel.add(rucksackBox);
        rucksackPanel.add(inHandButton);
        rucksackPanel.setVisible(false);
        //unterstes Panel
        untenPanel = new JPanel();
        untenPanel.setLayout(new FlowLayout(FlowLayout.CENTER,5, 5));
        hilfe = new ImageIcon("hilfe.png");
        hilfeButton = new JButton(hilfe);
        hilfeButton.addActionListener(this);
        beendeButton = new JButton("Beenden");
        beendeButton.addActionListener(this);
        
        untenPanel.add(beendeButton);
        untenPanel.add(hilfeButton);
        
        //Haupt-Panel
        hauptPanel.setLayout(new BoxLayout(hauptPanel, BoxLayout.PAGE_AXIS));
        hauptPanel.add(richtungPanel);
        hauptPanel.add(positionPanel);
        hauptPanel.add(feldPanel);
        hauptPanel.add(handPanel);
        hauptPanel.add(rucksackPanel);
        hauptPanel.add(untenPanel);
        
        meinJFrame.add(hauptPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        meinJFrame.setVisible(true);
        //alles "zusammenpacken"
        meinJFrame.pack();
    } 
    public static void main(String[] args) {
        GUI newGUI = new GUI();
        newGUI.printWelcome();         
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
   * Hilfsmethode um int in String umzuwandeln
   */
   public String intToString(int pInt){
       Integer obj = new Integer(pInt);
       return obj.toString();
   }
   /**
   * Print out some help information.
   * Here we print some stupid, cryptic message and information about the GUI
   */
    public void help() 
    {
        String ausgabe="";
        ausgabe+="Du stehst alleine auf weiter Flur in einer dir noch unbekannten Welt. Du bist noch sehr müde und erschöpft ";
        ausgabe+="von der langen Reise.";
        ausgabe+="In unserer GUI findest du verschiedene Schaltflächen:\n";
        ausgabe+="Noch in Arbeit...";
        JOptionPane.showMessageDialog(null, ausgabe, "Hilfe", JOptionPane.INFORMATION_MESSAGE, hilfe);
    }
    /**
     * Print out the opening message for the player.
     */
    public void printWelcome()
    {
        String ausgabe="";
        ausgabe+="Willkommen zum unglaublichen AdventureGame von TeamHackintosh";
        ausgabe+="\n";
        ausgabe+="Nutze den '?'-Button, um Hilfe zu erhalten.";
        JOptionPane.showMessageDialog(null, ausgabe, "Willkommen!", JOptionPane.INFORMATION_MESSAGE);
    }
    /** 
       Methode, die dafür sorgt, dass etwas passiert, wenn auf die Buttons gedrückt wird
       private JButton nordButton, suedButton, westButton, ostButton, geheButton, nimmButton, kampfButton, inRButton, ausHandButton, inHandButton, ausRButton, hilfeButton, beendeButton;
       */
    
    public void actionPerformed(ActionEvent e){
      if(e.getSource() == this.nordButton)
      {
          aktHeld.setRichtung(1);
          pfeilLabel.setIcon(hochP); //Pfeil-Logo wird gedreht
      }
      else if(e.getSource() == this.westButton)
      {
          aktHeld.setRichtung(2);
          pfeilLabel.setIcon(linksP);
      }
      else if(e.getSource() == this.suedButton)
      {
          aktHeld.setRichtung(3);
          pfeilLabel.setIcon(runterP);
      }
      else if(e.getSource() == this.ostButton)
      {
          aktHeld.setRichtung(0);
          pfeilLabel.setIcon(rechtsP);
      }
      else if(e.getSource() == this.geheButton)
      {
          int ausgabe=wesenGeht(aktHeld);
          heldGeht(ausgabe);
      }
      else if(e.getSource() == this.nimmButton)
      {
          if(nimmButton.getText().equals("Öffnen")){
          heldOeffnetTuer();
        }
        else{
          Gegenstand ausgabe=wesenNimmt(aktHeld); //wesenNimmt gibt den genommenen Gegenstand zurück
          if(ausgabe!=null){
              heldNimmt(ausgabe);
              gegenstandPanel.setVisible(false);
            }
          else{
              JOptionPane.showMessageDialog(null,"Du hast bereits einen Gegenstand in der Hand.","Fehlermeldung",JOptionPane.ERROR_MESSAGE);
            }
        }
      }
      else if(e.getSource() == this.ausHandButton)
      {
          Gegenstand ausgabe=wesenWirftWeg(aktHeld); //wesenWirftWeg gibt den weggeworfenen Gegenstand zurück
          if(ausgabe!=null){
          heldWirftWeg(ausgabe);
          gegenstandPanel.setVisible(true);
        }
        else{
          JOptionPane.showMessageDialog(null,"Auf diesem Feld befindet sich bereits ein Gegenstand.","Fehlermeldung",JOptionPane.ERROR_MESSAGE);
        }
      }
      else if(e.getSource() == this.inHandButton)
      {
          Gegenstand gegenstand = (Gegenstand) rucksackBox.getSelectedItem();
          if(gegenstand==null){
          JOptionPane.showMessageDialog(null,"Dein Rucksack ist leer." ,"Fehlermeldung",
          JOptionPane.ERROR_MESSAGE); 
        }
        else if(!aktHeld.handIstLeer()){
            JOptionPane.showMessageDialog(null,"Du hast bereits einen Gegenstand in der Hand.","Fehlermeldung",JOptionPane.ERROR_MESSAGE);
        }
        else{
          aktHeld.setInHand(gegenstand);
          heldNimmt(gegenstand);
          rucksackBox.removeItem(gegenstand);
          aktHeld.getRucksack().packeAus(gegenstand);
        }
      }
      else if(e.getSource() == this.inRButton)
      {
          Gegenstand gegenstand = aktHeld.getInHand();
          if(gegenstand==null){
            JOptionPane.showMessageDialog(null,"Deine Hand ist leer." ,"Fehlermeldung",
            JOptionPane.ERROR_MESSAGE); 
         }
         else{
          boolean ausgabe=aktHeld.getRucksack().packeEin(gegenstand);
          if(ausgabe==true){
            rucksackBox.addItem(gegenstand);
            aktHeld.leereInHand();
            heldWirftWeg(gegenstand);
         }
         else{
                JOptionPane.showMessageDialog(null,"Dein Rucksack ist voll." ,"Fehlermeldung",
                JOptionPane.ERROR_MESSAGE); 
         }
        }
      }
      else if(e.getSource() == this.kampfButton)
      {
          if(kampfButton.getText().equals("Angreifen")){
          Kampf neuerKampf = new Kampf(aktHeld, (Monster) aktLebewesen);
          if(aktLebewesen.getAktLeben()<=0){
              aktLebewesen = null;
              personPanel.setVisible(false);
            for(int i=0; i<akteure.length; i++){
                
                 //Befindet sich das Lebewesen an der gleichen Position wie der Held?
                  if(akteure[i].getPosX()==aktHeld.getPosX()&&akteure[i].getPosY()==aktHeld.getPosY()){
                     akteure[i]=null;
                }
            }
          }
        }
        else{
            Mensch aktMensch = (Mensch) aktLebewesen;
            JOptionPane.showMessageDialog(null,"Hallo ich bin "+aktMensch.getName()+". Ich habe eine(n) "+aktLebewesen.getInHand().getName()+" für dich." ,aktMensch.getName(),
            JOptionPane.INFORMATION_MESSAGE);
            nimmLabel.setText(aktMensch.getInHand().getName());
            wesenWirftWeg(aktMensch);
            gegenstandPanel.setVisible(true);
        }
      }
      else if(e.getSource() == this.hilfeButton)
      {
          help();
      }
      else if(e.getSource() == this.beendeButton)
      {
         Object[] options = {"Ja", "Nein"};
          int answer = JOptionPane.showOptionDialog(null,
          "Danke, dass du dieses Spiel von Team Hackintosh gespielt hast! Aber möchtest du wirklich beenden?",
          "Beenden?",
          JOptionPane.YES_NO_OPTION,
          JOptionPane.QUESTION_MESSAGE,
          null,     //do not use a custom Icon
          options,  //the titles of buttons
          options[1]); //Schlussnachricht
          if(answer==JOptionPane.YES_OPTION){
              System.exit(0);
        }
        
      }
    }
    
    //Methoden, die alle Lebewesen betreffen
    /** 
       Methode, die das als Parameter übergebene Lebewesen in die aktuelle Blickrichtung einen Schritt bewegt
       ausgabe=0: erfolgreich (kein Hindernis)
       ausgabe=1: nicht erfolgreich (Hindernis)
       Ich habe hier keine boolean verwendet, um die Möglichkeit offenzuhalten, noch mehr verschiedene Fälle zu unterscheiden.
       */
    public int wesenGeht(Lebewesen pLebewesen)
    {
        int ausgabe=1;
        int pRichtung = pLebewesen.getRichtung();
        int neuePosX=pLebewesen.getPosX();
        int neuePosY=pLebewesen.getPosY();
        switch(pRichtung)
        {   case 0:
            neuePosX=neuePosX+1;
            if(aktWelt.feldIstBegehbar(neuePosX, neuePosY)==false){
                  ausgabe=1;
               }
               else{
                   pLebewesen.setPosX(neuePosX);
                   ausgabe=0;
            }
            break;
            
            case 1:
            neuePosY=neuePosY-1;
            if(aktWelt.feldIstBegehbar(neuePosX, neuePosY)==false){
                  ausgabe=1;
               }
               else{
                   pLebewesen.setPosY(neuePosY);
                   ausgabe=0;
             
            }
            break;
            
            case 2:
            neuePosX=neuePosX-1;
            if(aktWelt.feldIstBegehbar(neuePosX, neuePosY)==false){
                  ausgabe=1;
               }
               else{
                   pLebewesen.setPosX(neuePosX);
                   ausgabe=0;
              
            }
            break;
            
            case 3:
            neuePosY=neuePosY+1;
            if(aktWelt.feldIstBegehbar(neuePosX, neuePosY)==false){
                  ausgabe=1;
               }
               else{
                   pLebewesen.setPosY(neuePosY);
                   ausgabe=0;
              
            }
            break;
        }
        return ausgabe;
    }  
    /** 
       Methode, die das als Parameter übergebene Lebewesen den Gegenstand nehmen lässt, der sich an der aktuellen Position des Lebewesens befindet. Sie gibt den genommenen Gegenstand zurück bzw.
       "null", wenn kein Gegenstand aufgenommen werden konnte.
       Da der "Nehmen"-Button nur erscheint, wenn ein Gegenstand auf dem entsprechenden Feld liegt, ist hier keine weitere Abfrage nötig.
       */
    public Gegenstand wesenNimmt(Lebewesen pLebewesen)
    {
        int aktX = pLebewesen.getPosX();
        int aktY = pLebewesen.getPosY();
        Gegenstand aktFeld = aktWelt.getFeld(aktX, aktY);
        Gegenstand ausgabe=null; 
        //Ist die Hand des Lebewesens überhaupt leer?
        if(pLebewesen.handIstLeer()){
                //Ja
                pLebewesen.setInHand(aktFeld);
                ausgabe=aktFeld;
                aktWelt.leereFeld(aktX, aktY);
        }
        //Nein: dann bleibt ausgabe auf "null" gesetzt
        return ausgabe;
    }
    /** 
       Methode, die das als Parameter übergebene Lebewesen den Gegenstand wegwerfen lässt, der sich in seiner Hand befindet.
       Sie gibt den weggeworfenen Gegenstand zurück bzw.
       "null", wenn kein Gegenstand weggeworfen werden konnte (--> sich bereits einer auf dem Feld befindet).
       Da der "Wegwerfen"-Button nur erscheint, wenn ein Gegenstand sich in der Hand des Helden befindet, ist hier keine weitere Abfrage nötig.
       */
    public Gegenstand wesenWirftWeg(Lebewesen pLebewesen){
        Gegenstand ausgabe = null;
        int aktX = pLebewesen.getPosX();
        int aktY = pLebewesen.getPosY();
        Gegenstand aktInHand = pLebewesen.getInHand();
        //Befindet sich auf dem Feld bereits ein Gegenstand?
        if(aktWelt.feldIstLeer(aktX, aktY)){
            //Ja
            aktWelt.setFeld(aktX, aktY, aktInHand);
            pLebewesen.leereInHand();
            ausgabe=aktInHand;
        }
        return ausgabe;
    }
    /** 
       Die Methode ist dafür zuständig alle Lebewesen außer dem Helden zufällig übers Feld zu bewegen.
       
    public void bewegeWesen(){
        for(int i=0; i<akteure.length; i++){
            Lebewesen lw = akteure[i];
            lw.setRichtung(random.nextInt(4));
            wesenGeht(lw); //wenn das Lebewesen nicht gehen kann, passiert halt nichts
            try{
                Thread.sleep(1000); //warte eine Sekunde, damit sich jedes Lebewesen einige Sekunden auf jedem Feld aufhält
            }
            catch(InterruptedException e){
                System.out.println("Interrupted Exception aufgefangen.");
            }
        }
    }
    */
    //Methoden, die den Helden betreffen
    /** 
       Methode, die den Helden bewegt. Aktualisiert die GUI und leitet evtl. den Kampf ein
       */
    public void heldGeht(int ausgabe){
        int aktX = aktHeld.getPosX();
        int aktY = aktHeld.getPosY();
        //Konnte der Held bewegt werden?
        if(ausgabe==0){
                //Ja
                //Befindet sich auf diesem Feld ein anderes Lebewesen?:
                //Array mit allen Lebewesen des Spiels wird durchlaufen
                boolean lebewesenAufFeld = false;
              for(int i=0; i<akteure.length; i++){
                
                 //Befindet sich das Lebewesen an der gleichen Position wie der Held?
                try{
                  if(akteure[i].getPosX()==aktX&&akteure[i].getPosY()==aktY){
                      aktLebewesen = akteure[i]; //speichere dieses Lebewesen in aktLebewesen (Instanzvariable) --> nötig um später den Kampf einleiten zu können
                      //Ist es ein Monster?
                      if(akteure[i].getArt().equals("monster")){
                          personLabel.setText("Monster");
                          kampfButton.setText("Angreifen");
                        }
                        else if(akteure[i].getArt().equals("mensch")){
                            personLabel.setText("Mensch");
                            kampfButton.setText("Ansprechen");
                        
                        }   
                        lebewesenAufFeld = true;
                        personPanel.setVisible(true);
                    }
                }
                catch(NullPointerException e){
                    //
                }
            }
            if(!lebewesenAufFeld){
                aktLebewesen = null;
                personPanel.setVisible(false);
            }
              //Befindet sich auf diesem Feld ein Gegenstand?
              if(!aktWelt.feldIstLeer(aktHeld.getPosX(), aktHeld.getPosY())){
                  //Ja
                  //Ist dieser Gegenstand eine Tür?
                if(aktWelt.getFeld(aktX, aktY).getName()=="tuer"){
                    Tuer aktFeld=(Tuer) aktWelt.getFeld(aktX, aktY);
                    if(aktFeld.getOffen()){
                        nimmLabel.setText("tuer: offen");
                        nimmButton.setVisible(false);
                    }
                    else{
                        nimmLabel.setText("tuer: geschlossen");
                        nimmButton.setText("Öffnen");
                    }
                    
                }
                else{
                    nimmLabel.setText(aktWelt.getFeld(aktHeld.getPosX(), aktHeld.getPosY()).getName());//zeige das in der GUI an
                    nimmButton.setText("Aufnehmen");
                    
                }
                gegenstandPanel.setVisible(true);
              }
              else{
                  //Nein
                  gegenstandPanel.setVisible(false);
                }
            }
            else{
              //Der Held konnte sich nicht bewegen wegen eines Hindernisses, also drucke eine Fehlermeldung
              JOptionPane.showMessageDialog(null, "Du kannst nicht auf dieses Feld gehen, da sich dort ein Hindernis befindet.","Fehlermeldung",JOptionPane.ERROR_MESSAGE);
          }
        
        //aktualisiere die Positionsangabe in der GUI
        xFeld.setText(intToString(aktHeld.getPosX()));
        yFeld.setText(intToString(aktHeld.getPosY()));
    }
    /** 
       Methode, die den Helden etwas nehmen lässt. Aktualisiert die GUI 
       */
    public void heldNimmt(Gegenstand ausgabe){

            if(ausgabe.getName().equals("rucksack")){
                aktHeld.setRucksack((Rucksack) aktHeld.getInHand());
                rucksackPanel.setVisible(true);
                aktHeld.leereInHand();
            }
            else{
                inHandLabel.setText(ausgabe.getName());
                inHandLabel.setVisible(true);
                ausHandButton.setVisible(true);
                if(aktHeld.getRucksack()==null){
                    inRButton.setVisible(false);
                }
                else{
                    inRButton.setVisible(true);
                }
                if(ausgabe.getName().equals("waffe")){
                    Waffe waffe = (Waffe) ausgabe;
                    haltbarkeitLabel.setText("Haltbarkeit: "+waffe.getAktHaltbarkeit()+"/"+waffe.getMaxHaltbarkeit());
                    schadenLabel.setText("Schaden: "+waffe.getSchaden());
                    waffenPanel.setVisible(true);
                }
            }

    }
    public void heldWirftWeg(Gegenstand ausgabe){
            ausHandButton.setVisible(false);
            inRButton.setVisible(false);
            inHandLabel.setVisible(false);
            waffenPanel.setVisible(false);
            nimmLabel.setText(ausgabe.getName());
            nimmButton.setText("Aufnehmen");
    }
    public void heldOeffnetTuer(){
        if(!aktHeld.handIstLeer()){
            if(aktHeld.getInHand().getName()=="schluessel"){
                Schluessel schluessel = (Schluessel) aktHeld.getInHand();
                Tuer tuer = (Tuer) aktWelt.getFeld(aktHeld.getPosX(), aktHeld.getPosY());
                boolean erfolgreich = schluessel.oeffne(tuer);
                if(erfolgreich==true){
                    tuer.setOffen(true);
                    nimmLabel.setText("tuer: offen");
                    nimmButton.setVisible(false);
                }
                else{
                    JOptionPane.showMessageDialog(null,"Der Schluessel passt nicht.","Fehlermeldung",JOptionPane.ERROR_MESSAGE);
                }
            }
            else{
                JOptionPane.showMessageDialog(null,"Du hast keinen Schlüssel in der Hand.","Fehlermeldung",JOptionPane.ERROR_MESSAGE);
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"Du hast keinen Schlüssel in der Hand.","Fehlermeldung",JOptionPane.ERROR_MESSAGE);
        }
    }
}
