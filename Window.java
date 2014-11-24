package simpleCount;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window extends JFrame {
	private Scr scr;
	private String num1 = null;
	private String num2 = null;
	private String opp = null;
	private boolean toErase = true;
	private boolean isDot1 = false;
	private boolean isDot2 = false;
	
	public Window() {
		//Initialisation de la fenêtre
		this.setTitle("SimpleCount");
		this.setSize(400, 500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		
		//Initialisation des differentes parties
		JPanel opp = new Opp(this);		
		JPanel num = new Num(this);
		this.scr = new Scr();

		
		//Layout def
		this.setLayout(new BorderLayout());
		
		//Positions JPanel
		this.getContentPane().add(scr, BorderLayout.NORTH);
		this.getContentPane().add(num, BorderLayout.WEST);
		this.getContentPane().add(opp, BorderLayout.EAST);
		
		this.setVisible(true);
	}
	
	public void calcul(){
		Double res1;
		Double res2;
		Double res;
		
		res1 = Double.valueOf(this.num1).doubleValue();
		res2 = Double.valueOf(this.num2).doubleValue();
		
		if (this.opp == "+"){
			res = res1 + res2;
			this.setTxt(String.valueOf(res));
		}
		else if (this.opp == "-") {
			res = res1 - res2;
			this.setTxt(String.valueOf(res));
		}
		else if (this.opp == "*") {
			res = res1 * res2;
			this.setTxt(String.valueOf(res));
		}
		else if (this.opp == "/") {
			if (res2 != 0){
				res = res1 / res2;
				this.setTxt(String.valueOf(res));
			}
			else{
				this.setTxt("Math Error !");
			}
		}
		if (getTxt() == "Math Error !")
			this.num1 = null;
		else
			this.num1 = getTxt();
		this.opp = null;
		this.num1 = null;
		this.num2 = null;
		this.isDot2 = false;
		this.isDot1 = false;
		this.toErase = true;
	}
	
	public void setTxt(String str){
		this.scr.setTxt(str);
	}
	
	public String getTxt(){
		return (this.scr.getTxt());
	}
	
	public String getNum1() {
		return (this.num1);
	}
	
	public String getNum2() {
		return (this.num2);
	}
	
	public String getOpp() {
		return (this.opp);
	}
	
	public boolean getErase() {
		return (this.toErase);
	}
	
	public boolean getDot1(){
		return (this.isDot1);
	}
	
	public boolean getDot2(){
		return (this.isDot2);
	}
	
	public void setNum1(String str){
		this.num1 = str;
	}
	
	public void setNum2(String str){
		this.num2 = str;
	}
	
	public void setOpp(String str){
		this.opp = str;
	}
	
	public void setErase(boolean b){
		this.toErase = b;
	}
	
	public void setDot1(boolean b){
		this.isDot1 = b;
	}
	
	public void setDot2(boolean b){
		this.isDot2 = b;
	}
	
	public boolean canCalc(){
		if (this.num1 != null && this.opp != null)
			return (true);
		return (false);
	}
}
