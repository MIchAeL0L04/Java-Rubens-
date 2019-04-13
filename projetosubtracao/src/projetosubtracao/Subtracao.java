package projetosubtracao;

import javax.swing.JOptionPane;

public class Subtracao {
	private int num1;
	private int num2;
	
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	public void Subtracao() {
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número"));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número"));
		System.out.println("A subtração de " + num1 + " e " + num2 + " é " + (num1 - num2));
	}
}
