package simpleCount;

import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Btn extends JButton{
	private String name;
	private Font police = new Font("Arial", Font.BOLD, 20);

	
	public Btn (String str){
		super(str);
		this.name = str;
		this.setFont(police);
	}
	
	//public void paintComponent(Graphics g) {
		//System.out.println("Executé !");
	//}
}
