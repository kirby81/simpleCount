package simpleCount;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Num extends JPanel{
	private Btn tab_num[] = new Btn[12];
	private Window refWin;
	
	public Num(Window win){
		this.refWin = win;
		this.setPreferredSize(new Dimension(300, 400));
		this.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		this.tab_num[0] = new Btn("7");
		this.tab_num[1] = new Btn("8");
		this.tab_num[2] = new Btn("9");
		this.tab_num[3] = new Btn("4");
		this.tab_num[4] = new Btn("5");
		this.tab_num[5] = new Btn("6");
		this.tab_num[6] = new Btn("1");
		this.tab_num[7] = new Btn("2");
		this.tab_num[8] = new Btn("3");
		this.tab_num[9] = new Btn("0");
		this.tab_num[10] = new Btn(".");
		this.tab_num[11] = new Btn("=");
		
		for (int i = 0; i < 11; i++){
			this.tab_num[i].addActionListener(new NumListener());
		}
		
		this.tab_num[11].addActionListener(new equalListener());
		
		//Layout def
		GridLayout grid = new GridLayout(4, 3, 5, 5);
		this.setLayout(grid);
		
		for (int i = 0; i < tab_num.length; i++){
			this.add(this.tab_num[i]);
		}
	}
	
	class NumListener implements ActionListener {
		public void actionPerformed(ActionEvent e){
			if (((Btn)e.getSource()).getText() == "."){
				if (refWin.getNum1() == null){
					if (!refWin.getDot1()){
						refWin.setTxt(refWin.getTxt() + ((Btn)e.getSource()).getText());
						refWin.setDot1(true);
					}
				}
				else if (refWin.getNum2() == null){
					if (!refWin.getDot2()){
						refWin.setTxt(refWin.getTxt() + ((Btn)e.getSource()).getText());
						refWin.setDot2(true);
					}
				}
				refWin.setErase(false);
			}
			else {
				if (refWin.getErase()){
					refWin.setTxt(((Btn)e.getSource()).getText());
					refWin.setErase(false);
				}
				else
					refWin.setTxt(refWin.getTxt() + ((Btn)e.getSource()).getText());
			}
		}
	}
	
	class equalListener implements ActionListener {
		public void actionPerformed(ActionEvent e){
			if (refWin.canCalc()){
				refWin.setNum2(refWin.getTxt());
				refWin.calcul();
			}
		}
	}
	
}
