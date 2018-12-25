import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.text.DefaultCaret;
/**
 * Beschreiben Sie hier die Klasse GUI.
 * 
 * @author TeamHackintosh 2018 
 * @version AdventureGUI 2.0beta (ohne ActionListener)
 */
public class GUI extends JFrame implements ActionListener
{
    private static int currentHours, currentMinutes, currentSeconds;
    private static int startHours, startMinutes, startSeconds;
    private java.util.Date now; 
    private Held aktHeld;
    private Welt aktWelt;
    private Monster monster1, monster2, monster3;
    private Random random;
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private JFrame meinJFrame;
    private JLabel xFeld, yFeld;
    private JPanel richtungPanel, positionPanel, hauptPanel, feldPanel, gegenstandPanel, personPanel, handPanel, handButtonPanel, inventarPanel, untenPanel;
    private JButton nordButton, suedButton, westButton, ostButton, geheButton, nimmButton, kampfButton, inInvButton, ausHandButton, inHandButton, ausInvButton, hilfeButton, beendeButton;
    private JLabel xLabel, yLabel, nordLabel, pfeilLabel, nimmLabel, personLabel, inHandLabel;
    private ImageIcon rechtsP, linksP, hochP, runterP, hilfe;
    private JComboBox<Object> inventarBox;
    private FlowLayout standardLayout;
    /**
     * Konstruktor für Objekte der Klasse GUI
     */
    public GUI()
    {
        aktHeld = new Held(100, 100, 1, 3, 11); // Spawn (3|11)
        aktWelt = new Welt();
        monster1 = new Monster(5, 5, 3, 23, 2); // Spawn (23|2)
        monster2 = new Monster(5, 5, 3, 28, 2); // Spawn (28|2)
        monster3 = new Monster(5, 5, 3, 25, 3); // Spawn (25|3)
        now = new java.util.Date();
        startHours = now.getHours();
        startMinutes = now.getMinutes(); 
        startSeconds = now.getSeconds(); 
        random = new Random();
        //neues Game-Objekt erzeugt
        meinJFrame = new JFrame();
        meinJFrame.setTitle("AdventureGUI 2.0");
        meinJFrame.setSize(800, 600);
        richtungPanel = new JPanel();
        positionPanel = new JPanel();
        hauptPanel = new JPanel();
        feldPanel = new JPanel();
        standardLayout = new FlowLayout(FlowLayout.LEFT,5,5);
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
        xFeld = new JLabel(aktHeld.getPosXString());
        yFeld = new JLabel(aktHeld.getPosYString());
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
        nimmLabel = new JLabel("");
        nimmButton = new JButton("Aufnehmen");
        nimmButton.addActionListener(this);
        gegenstandPanel.setVisible(false);
        gegenstandPanel.add(nimmLabel);
        gegenstandPanel.add(nimmButton);
        
        personPanel = new JPanel();
        personLabel = new JLabel("");
        kampfButton = new JButton("Angreifen");
        kampfButton.addActionListener(this);
        personPanel.setVisible(false);

        feldPanel.add(gegenstandPanel);
        feldPanel.add(personPanel);
        
        feldPanel.setBorder(BorderFactory.createTitledBorder("Dieses Feld"));
        
        //inHand-Panel
        handPanel = new JPanel();
        handPanel.setLayout(standardLayout);
        handPanel.setBorder(BorderFactory.createTitledBorder("In Hand"));
        handButtonPanel = new JPanel();
        ausHandButton = new JButton("Wegwerfen");
        ausHandButton.addActionListener(this);
        inInvButton = new JButton("Ins Inventar verschieben");
        inInvButton.addActionListener(this);
        handButtonPanel.add(inInvButton);
        handButtonPanel.add(ausHandButton);
        
        inHandLabel = new JLabel("leer");
        handButtonPanel.setVisible(false);
        
        handPanel.add(inHandLabel);
        handPanel.add(handButtonPanel);
        
        //Inventar-Panel
        inventarPanel = new JPanel();
        inventarPanel.setLayout(standardLayout);
        inventarPanel.setBorder(BorderFactory.createTitledBorder("Inventar"));
        ausInvButton = new JButton("Wegwerfen");
        ausInvButton.addActionListener(this);
        inHandButton = new JButton("In die Hand nehmen");
        inHandButton.addActionListener(this);
        inventarBox = new JComboBox<Object>();
        
        inventarPanel.add(inventarBox);
        inventarPanel.add(ausInvButton);
        inventarPanel.add(inHandButton);
        inventarPanel.setVisible(false);
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
        hauptPanel.add(inventarPanel);
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
     * Print out some help information.
     * Here we print some stupid, cryptic message and a list of the 
     * command words.
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
    //dreheRButton, dreheLButton, geheButton, nimmButton, kampfButton, inInvButton, ausHandButton, inHandButton, ausInvButton, hilfeButton, beendeButton
    
    public void actionPerformed(ActionEvent e){
      if(e.getSource() == this.nordButton)
      {
          aktHeld.setRichtung(1);
          pfeilLabel.setIcon(hochP);
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
          heldGeht();
      }
      else if(e.getSource() == this.nimmButton)
      {
          heldNimmt();
      }
      else if(e.getSource() == this.ausHandButton)
      {
          aufFeld(aktHeld.getInHand());
          ausHand();
      }
      else if(e.getSource() == this.hilfeButton)
      {
          help();
      }
      else if(e.getSource() == this.beendeButton)
      {
          JOptionPane.showMessageDialog(null,"Danke, dass du dieses Spiel von TeamHackintosh gespielt hast.", "Auf Wiedersehen!",JOptionPane.INFORMATION_MESSAGE);
          System.exit(0);
      }
    }
    
    
    public void heldGeht()
    {
        int ausgabe=1;
        int pRichtung = aktHeld.getRichtung();
        int neuePosX=aktHeld.getPosX();
        int neuePosY=aktHeld.getPosY();
        switch(pRichtung)
        {   case 0:
            neuePosX=neuePosX+1;
            if(aktWelt.feldIstBegehbar(neuePosX, neuePosY)==false){
                  ausgabe=1;
               }
               else{
                   aktHeld.setPosX(neuePosX);
                   ausgabe=0;
            }
            break;
            
            case 1:
            neuePosY=neuePosY-1;
            if(aktWelt.feldIstBegehbar(neuePosX, neuePosY)==false){
                  ausgabe=1;
               }
               else{
                   aktHeld.setPosY(neuePosY);
                   ausgabe=0;
             
            }
            break;
            
            case 2:
            neuePosX=neuePosX-1;
            if(aktWelt.feldIstBegehbar(neuePosX, neuePosY)==false){
                  ausgabe=1;
               }
               else{
                   aktHeld.setPosX(neuePosX);
                   ausgabe=0;
              
            }
            break;
            
            case 3:
            neuePosY=neuePosY+1;
            if(aktWelt.feldIstBegehbar(neuePosX, neuePosY)==false){
                  ausgabe=1;
               }
               else{
                   aktHeld.setPosY(neuePosY);
                   ausgabe=0;
              
            }
            break;
        }
        if(ausgabe==0){
              if(!aktWelt.feldIstLeer(aktHeld.getPosX(), aktHeld.getPosY())){
                  nimmLabel.setText(aktWelt.getFeld(aktHeld.getPosX(), aktHeld.getPosY()).getName());
                  gegenstandPanel.setVisible(true);
              }
              else{
                gegenstandPanel.setVisible(false);
                }
          }
          else{
              JOptionPane.showMessageDialog(null, "Du kannst nicht auf dieses Feld gehen, da sich dort ein Hindernis befindet.","Fehlermeldung",JOptionPane.ERROR_MESSAGE);
          }
        xFeld.setText(aktHeld.getPosXString());
        yFeld.setText(aktHeld.getPosYString());
    }  
    public void heldNimmt()
    {
        int aktX = aktHeld.getPosX();
        int aktY = aktHeld.getPosY();
        Gegenstand aktFeld = aktWelt.getFeld(aktX, aktY);
            if(aktHeld.handIstLeer()){
                inHand(aktFeld);
                vonFeld();
            }
            else{
                JOptionPane.showMessageDialog(null,"Du hast bereits einen Gegenstand in der Hand.","Fehlermeldung",JOptionPane.ERROR_MESSAGE);
            }
    }
    public void ausHand(){
        aktHeld.leereInHand();
        inHandLabel.setText("leer");
        handButtonPanel.setVisible(false);
    }
    public void inHand(Gegenstand pGegenstand){
       aktHeld.setInHand(pGegenstand);
       inHandLabel.setText(pGegenstand.getName());
       handButtonPanel.setVisible(true);
    }
    public void vonFeld(){
        int aktX = aktHeld.getPosX();
        int aktY = aktHeld.getPosY();
        aktWelt.leereFeld(aktX, aktY);
        gegenstandPanel.setVisible(false);
    }
    public void aufFeld(Gegenstand pGegenstand){
        int aktX = aktHeld.getPosX();
        int aktY = aktHeld.getPosY();
        aktWelt.setFeld(aktX, aktY, pGegenstand);
        nimmLabel.setText(pGegenstand.getName());
        gegenstandPanel.setVisible(true);
    }
        /*public void Kampf(Monster pMonster)
    {
        if(random.nextInt(2) == 0)
        {
            aktHeld.setAktLeben(aktHeld.getAktLeben()-pMonster.getStaerke());
        }
        else
        {
            pMonster.setAktLeben(pMonster.getAktLeben()-aktHeld.getStaerke());
        }
        while(aktHeld.getAktLeben()>0 || pMonster.getAktLeben()>0)
        {
            if(random.nextInt(5)!=0)
            {
                pMonster.setAktLeben(pMonster.getAktLeben()-aktHeld.getStaerke());
                ausgabeFeld.append("Du hast das Monster angegriffen. Es verliert "+aktHeld.getStaerke()+"Leben. \n Das Monster hat noch "+pMonster.getAktLeben()+"Leben.");
            }
            else
            {
                ausgabeFeld.append("Du hast das Monster nicht getroffen.\n Das Monster hat noch "+pMonster.getAktLeben()+"Leben.");
            }
            if(random.nextInt(5)!=0)
            {
                aktHeld.setAktLeben(aktHeld.getAktLeben()-pMonster.getStaerke());
                ausgabeFeld.append("Das Monster hat dich angegriffen. Du verlierst "+pMonster.getStaerke()+"Leben.\n Du hast noch "+aktHeld.getAktLeben()+"Leben."); 
            }
            else
            {
                ausgabeFeld.append("Du bist dem Monster ausgewichen. \n Du hast noch "+aktHeld.getAktLeben()+"Leben.");
            }
               
                JOptionPane.showOptionDialog(null, "Die Runde ist beendet. Möchtest du eine weitere Runde kämpfen?","Weiterkämpfen?",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, 
                new String[]{"Weiterkämpfen", "Flüchten"}, "Weiterkämpfen");;
        }
    }*/
}
