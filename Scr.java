package simpleCount;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Scr extends JPanel{
	private Font police = new Font("Arial", Font.BOLD, 40);
	private Dimension dim = new Dimension(400, 100);
	private JLabel screen;

	public Scr(){
		this.setPreferredSize(dim);
		
		screen = new JLabel("0");
		screen.setPreferredSize(new Dimension(380, 90));
		screen.setFont(police);
		screen.setHorizontalAlignment(JLabel.RIGHT);
		this.add(screen);
	}
	
	public void setTxt(String str){
		screen.setText(str);
	}
	
	public String getTxt(){
		return (screen.getText());
	}
}