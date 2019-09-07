import javax.swing.JOptionPane;

public class Autoriza {
	
	public String nome;
	public double salarioBruto;
	public int numDependentes;
	public double limiteCredito;
	
	public Autoriza() {
		super();
	}

	//Getter and Setters
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalarioBruto() {
		return salarioBruto;
	}

	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}

	public int getNumDependentes() {
		return numDependentes;
	}

	public void setNumDependentes(int numDependentes) {
		this.numDependentes = numDependentes;
	}

	public double getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}
	
	public void cadastraCliente() {
		this.nome = JOptionPane.showInputDialog("Digite o nome do Cliente: ");
		this.numDependentes = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de dependentes: "));
		this.salarioBruto = Double.parseDouble(JOptionPane.showInputDialog("Digite seu salario bruto:"));
		
		if (this.salarioBruto <=1499.15) {
			this.limiteCredito = ((((this.getSalarioBruto() - (this.getSalarioBruto() * ((this.getSalarioBruto() * 9) /100)) - (this.getNumDependentes() * 150.69 )) * 0)) - 112.43 ) * (0.2);
		}
		
		
		
		//
	}
	
	public void verificaPossibilidade() {
		
	}
	
	
	
}
