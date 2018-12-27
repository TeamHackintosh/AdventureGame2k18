import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.text.DefaultCaret;
/**
 * Beschreiben Sie hier die Klasse Kampf.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Kampf extends JFrame implements ActionListener
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private ImageIcon schwerter;
    private JTextArea ausgabeFeld;
    private JFrame kampfFrame;
    private JLabel heldLeben, heldLebenAkt, heldLebenMax, heldStaerke, monsterLeben, monsterLebenAkt, monsterLebenMax, monsterStaerke;
    private JPanel kampfPanel, held, monster;
    private JButton zuschlagen, fluechten;
    private Held aktHeld;
    private Monster aktMonster;
    private Random random;
    /**
    * Konstruktor für Objekte der Klasse Kampf
    */
    public Kampf(Held pHeld, Monster pMonster)
    {
        aktHeld = pHeld;
        aktMonster = pMonster;
        random = new Random();
        schwerter = new ImageIcon("schwerter.svg");
        kampfFrame = new JFrame();
        ausgabeFeld = new JTextArea("Kampfablauf:\n",5,5);
        kampfPanel = new JPanel();
        kampfPanel.setLayout(new BoxLayout(kampfPanel, BoxLayout.PAGE_AXIS));
        zuschlagen = new JButton("Zuschlagen");
        zuschlagen.addActionListener(this);
        fluechten = new JButton("Fluechten");
        fluechten.addActionListener(this);
        held = new JPanel();
        monster = new JPanel();
        held.setBorder(BorderFactory.createTitledBorder("Held"));
        monster.setBorder(BorderFactory.createTitledBorder("Monster"));
        heldLeben = new JLabel("Leben: ");
        heldLebenAkt = new JLabel(intToString(aktHeld.getAktLeben()));
        heldLebenMax = new JLabel("/"+intToString(aktHeld.getMaxLeben()));
        heldStaerke = new JLabel("Staerke: "+intToString(aktHeld.getStaerke()));
        held.add(heldLeben);
        held.add(heldLebenAkt);
        held.add(heldLebenMax);
        held.add(heldStaerke);
        monsterLeben = new JLabel("Leben: ");
        monsterLebenAkt = new JLabel(intToString(aktMonster.getAktLeben()));
        monsterLebenMax = new JLabel("/"+intToString(aktMonster.getMaxLeben()));
        monsterStaerke = new JLabel("Staerke: "+intToString(aktMonster.getStaerke()));
        monster.add(monsterLeben);
        monster.add(monsterLebenAkt);
        monster.add(monsterLebenMax);
        monster.add(monsterStaerke);
        kampfPanel.add(zuschlagen);
        kampfPanel.add(held);
        kampfPanel.add(monster);
        kampfPanel.add(fluechten);
        kampfPanel.add(ausgabeFeld);
        kampfFrame.add(kampfPanel);
        kampfFrame.pack();
        kampfFrame.setVisible(true);
        angriff();
    }
    public void actionPerformed(ActionEvent e){
      if(e.getSource() == this.fluechten)
      {
          kampfFrame.dispose();
      }
      else if(e.getSource() == this.zuschlagen)
      {
          heldSchlaegt();
          monsterSchlaegt();
          //eine Runde
      }
    }
    public String intToString(int pInt){
       Integer obj = new Integer(pInt);
       return obj.toString();
    }
    public void aktualisiereKampfFrame(){
        monsterLebenAkt.setText(intToString(aktMonster.getAktLeben()));
        heldLebenAkt.setText(intToString(aktHeld.getAktLeben()));
    }
    public void angriff(){
        if(random.nextInt(2) == 0)
        {
            monsterSchlaegt();
        }
        else
        {
            heldSchlaegt();
        }
        aktualisiereKampfFrame();
    }
    public void heldSchlaegt()
    {
            int ausgabe=0;
            if(random.nextInt(5)!=0)
            {
                if(aktMonster.getAktLeben()>=aktHeld.getStaerke()){    
                    aktMonster.setAktLeben(aktMonster.getAktLeben()-aktHeld.getStaerke());
                    ausgabeFeld.append("Du hast das Monster getroffen.");
                }
                else{
                    aktHeld.setStaerke(aktHeld.getStaerke()+aktMonster.getStaerke());
                    JOptionPane.showMessageDialog(null,"Du hast das Monster besiegt und erhälst "+aktMonster.getStaerke()+" Erfahrungspunkte.", "Niederlage",
                    JOptionPane.INFORMATION_MESSAGE, schwerter);
                    kampfFrame.dispose();
                }
            }
            else
            {
                ausgabeFeld.append("Du hast das Monster nicht getroffen.");
            }
            aktualisiereKampfFrame();
        }
        public void monsterSchlaegt(){
            if(random.nextInt(5)!=0)
            {
                if(aktHeld.getAktLeben()>=aktMonster.getStaerke()){    
                    aktHeld.setAktLeben(aktHeld.getAktLeben()-aktMonster.getStaerke());
                    ausgabeFeld.append("Das Monster hat dich getroffen.");
                }
                else{
                    JOptionPane.showMessageDialog(null,"Das Monster hat dich besiegt.", "Niederlage", JOptionPane.INFORMATION_MESSAGE, schwerter);
                    kampfFrame.dispose();
                } 
            }
            else
            {
                ausgabeFeld.append("Du bist dem Monster ausgewichen.");
            }
            aktualisiereKampfFrame();
    }
}
