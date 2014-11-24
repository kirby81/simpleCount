package simpleCount;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import simpleCount.Num.NumListener;

public class Opp extends JPanel{
	private Btn tab_opp[] = new Btn[5];
	private Window refWin;
	
	public Opp(Window win){
		this.refWin = win;
		this.setPreferredSize(new Dimension(100, 400));
		this.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		this.tab_opp[0] = new Btn("C");
		this.tab_opp[1] = new Btn("/");
		this.tab_opp[2] = new Btn("*");
		this.tab_opp[3] = new Btn("-");
		this.tab_opp[4] = new Btn("+");
		
		this.tab_opp[0].addActionListener(new resetListener());
		this.tab_opp[1].addActionListener(new divListener());
		this.tab_opp[2].addActionListener(new mulListener());
		this.tab_opp[3].addActionListener(new subListener());
		this.tab_opp[4].addActionListener(new addListener());
		
		//Layout def
		GridLayout grid = new GridLayout(5, 1, 5, 5);
		this.setLayout(grid);
		
		for (int i = 0; i < tab_opp.length; i++){
			this.add(this.tab_opp[i]);
		}
	}
	
	class resetListener implements ActionListener {
		public void actionPerformed(ActionEvent e){
			refWin.setNum1(null);
			refWin.setNum2(null);
			refWin.setOpp(null);
			refWin.setTxt("0");
			refWin.setErase(true);
			refWin.setDot1(false);
			refWin.setDot2(false);
		}
	}
	
	class divListener implements ActionListener {
		public void actionPerformed(ActionEvent e){
			//String tmp;
			if (refWin.getOpp() != null) {
				refWin.setNum2(refWin.getTxt());
				refWin.calcul();
			}
			else {
				refWin.setNum1(refWin.getTxt());
			}
			refWin.setTxt("0");
			refWin.setOpp("/");
			refWin.setErase(true);
		}
	}
	
	class mulListener implements ActionListener {
		public void actionPerformed(ActionEvent e){
			//String tmp;
			if (refWin.getOpp() != null) {
				refWin.setNum2(refWin.getTxt());
				refWin.calcul();
			}
			else {
				refWin.setNum1(refWin.getTxt());
			}
			refWin.setTxt("0");
			refWin.setOpp("*");
			refWin.setErase(true);
		}
	}
	
	class subListener implements ActionListener {
		public void actionPerformed(ActionEvent e){
			//String tmp;
			if (refWin.getOpp() != null) {
				refWin.setNum2(refWin.getTxt());
				refWin.calcul();
			}
			else {
				refWin.setNum1(refWin.getTxt());
			}
			refWin.setTxt("0");
			refWin.setOpp("-");
			refWin.setErase(true);
		}
	}
	
	class addListener implements ActionListener {
		public void actionPerformed(ActionEvent e){
			//String tmp;
			if (refWin.getOpp() != null) {
				refWin.setNum2(refWin.getTxt());
				refWin.calcul();
			}
			else {
				refWin.setNum1(refWin.getTxt());
			}
			refWin.setTxt("0");
			refWin.setOpp("+");
			refWin.setErase(true);
		}
	}
}