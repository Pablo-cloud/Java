// Wir haben schon alles Noetige importiert
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;

public class TiereGUI{

int width;
int buttonblock;
JLabel label;
;

  public static void main(String[] args) {
    TiereGUI tiereGUI = new TiereGUI();
    tiereGUI.los();
  }

  public void los() {
    JFrame frame = new JFrame("Tiere im Zoo");
	label = new JLabel("Bitte etwas anklicken!");
    // Hier den Rest der Benutzeroberflaeche bauen
	JPanel panelA = new JPanel();
	JPanel panelB = new JPanel();
	JPanel panelC = new JPanel();
	JPanel panelD = new JPanel();

	ImageIcon gorilla = new ImageIcon("affe.jpg","Hallo");
	//gorilla.setMargin(new Insets(0,0,0,0));
	ImageIcon baer = new ImageIcon("baer.jpg","Hallo");
	ImageIcon loewe = new ImageIcon("loewe.jpg","Hallo");
	ImageIcon hase = new ImageIcon("hase.jpg","Hallo");

	JButton button1 = new JButton(gorilla);
	JButton button2 = new JButton(baer);
	JButton button3 = new JButton(loewe);
	JButton button4 = new JButton(hase);
	
	
		
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
	frame.setSize(600,600);
	
	frame.add(panelD);
	frame.add(panelA);
	
	frame.getContentPane().add(BorderLayout.NORTH, panelD);
	frame.getContentPane().add(BorderLayout.CENTER, panelA);
	
	panelA.add(panelB);
	panelA.add(panelC);
	
	panelB.add(button1);
	panelB.add(button2);
	
	panelC.add(button3);
	panelC.add(button4);
	
	panelD.add(label);
	
	panelB.setLayout(new BoxLayout(panelB,BoxLayout.Y_AXIS));
	panelC.setLayout(new BoxLayout(panelC,BoxLayout.Y_AXIS));
	
	int width = frame.getWidth();
	int buttonblock = 4*panelB.getWidth();
	
	button1.addActionListener(new GorillaListener());
	button2.addActionListener(new LoeweListener());
	button3.addActionListener(new BaerListener());
	button4.addActionListener(new HaseListener());
	
	
	
	
	
	
	/*panelA.addActionListener(new BlockListener());
	
	class BlockListener implements ActionListener{
		if(width<buttonblock){
	public void actionPerformed(ActionEvent event){
		panelA.setLayout(new BoxLayout(panelA,BoxLayout.Y_AXIS));
		
	}
		}*/
	}
  
  class GorillaListener implements ActionListener{
		
	public void actionPerformed(ActionEvent event){
	label.setText("Ich bin ein Gorilla!");
}
	}
	class LoeweListener implements ActionListener{
		
	public void actionPerformed(ActionEvent event){
	label.setText("Ich bin ein Loewe!");
}
	}
	class BaerListener implements ActionListener{
		
	public void actionPerformed(ActionEvent event){
	label.setText("Ich bin ein Baer!");
}
	}
	class HaseListener implements ActionListener{
		
	public void actionPerformed(ActionEvent event){
	label.setText("Ich bin ein Hase!");
}
	}
  
  }
