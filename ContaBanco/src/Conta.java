import javax.swing.JOptionPane;

public class Conta {

	public String nome;
	public int idade;
	public String tipo;
	public double quantia;
	public double poupado;
	public double t;
	
	
	//Construtor
	public Conta() {
		
	}

	//Getters and Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getQuantia() {
		return quantia;
	}

	public void setQuantia(double quantia) {
		this.quantia = quantia;
	}
	
	public double getPoupado() {
		return poupado;
	}

	public void setPoupado(double poupado) {
		this.poupado = poupado;
	}
	
	public double getT() {
		return t;
	}
	
	public void criarConta() {
		this.nome = JOptionPane.showInputDialog("Digite o seu nome:");
		this.idade = Integer.parseInt( JOptionPane.showInputDialog("Digite sua idade:"));
		this.tipo = JOptionPane.showInputDialog("Digite o tipo de sua conta. Poupança ou Corrente:");
		if ((this.getNome()) != "" && (this.getIdade() >=18)) {
			JOptionPane.showMessageDialog(null, "Parabens. Conta criada com sucesso");
			
		}else {
			JOptionPane.showMessageDialog(null, "Você precisa digitar um nome e ter uma idade valida para criar sua conta");
			
		}
	}
	
	
	
	
	
	public void depositar() {
		
		if ((this.getNome() != "") && (this.getIdade()>= 18)) {
		
		t = Double.parseDouble( JOptionPane.showInputDialog("Quanto deseja depositar em sua conta?"));
		
			JOptionPane.showMessageDialog(null, "Voce acabou de depositar " + this.quantia + "em sua conta" + this.tipo);
		
		
		}else {
			JOptionPane.showMessageDialog(null, "Voce precisa criar uma conta primeiro");
		}
	}
	
	public void sacar() {
		
		if ((this.getNome() != "") && (this.getIdade()>= 18)) {
		
		this.quantia = Double.parseDouble( JOptionPane.showInputDialog("Quanto deseja sacar de sua conta?"));
		if (this.t <= this.getPoupado() ) {
			JOptionPane.showMessageDialog(null, "Você acabou de sacar " + this.getQuantia() + "da sua conta" + this.getTipo());
			this.poupado = this.getT() - this.getPoupado();
		}else {
			JOptionPane.showMessageDialog(null, "Voce nao tem saldo sufisciente");
		}
		}else {
			JOptionPane.showMessageDialog(null, "Você preicsa criar uma conta primeiro");
		}
	}
	
	
	
	
	
	
}
