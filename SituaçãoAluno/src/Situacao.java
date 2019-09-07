import javax.swing.JOptionPane;

public class Situacao {
	
	public String nome;
	public double n1;
	public double n2;
	public double n3;
	public double n4;
	public double mediaFinal;
	public double notaRecuperacao;
	public String situacaoAluno;
	
	public Situacao() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getN1() {
		return n1;
	}

	public void setN1(double n1) {
		this.n1 = n1;
	}

	public double getN2() {
		return n2;
	}

	public void setN2(double n2) {
		this.n2 = n2;
	}

	public double getN3() {
		return n3;
	}

	public void setN3(double n3) {
		this.n3 = n3;
	}

	public double getN4() {
		return n4;
	}

	public void setN4(double n4) {
		this.n4 = n4;
	}

	public double getMediaFinal() {
		return mediaFinal;
	}

	public void setMediaFinal(double mediaFinal) {
		this.mediaFinal = mediaFinal;
	}

	public double getNotaRecuperacao() {
		return notaRecuperacao;
	}

	public void setNotaRecuperacao(double notaRecuperacao) {
		this.notaRecuperacao = notaRecuperacao;
	}

	public String getSituacaoAluno() {
		return situacaoAluno;
	}

	public void setSituacaoAluno(String situacaoAluno) {
		this.situacaoAluno = situacaoAluno;
	}
	
	//Métodos
	public void cadastraAluno() {
		this.nome = JOptionPane.showInputDialog("Digite o nome do aluno:");
		this.n1 = 0.0;
		this.n2 = 0.0;
		this.n3 = 0.0;
		this.n4 = 0.0;
		this.situacaoAluno = "Ativo";
	}
	
	public void cadastraNota() {
		if ((this.getSituacaoAluno() =="Ativo") || (this.getSituacaoAluno() == "ativo")) {
			
			this.n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota: "));
			this.n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota: "));
			this.n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota: "));
			this.n4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a quarta nota: "));
			this.mediaFinal = ((this.n1 + this.n2 + this.n3 + this.n4)/4);
			
			if(this.getMediaFinal() >=7) {
				this.situacaoAluno = "Aprovado";
			}else if (this.getMediaFinal() >=3 && this.getMediaFinal() <7) {
				this.situacaoAluno = "Fazer prova de recuperação";
			}else if (this.getMediaFinal() <3) {
				this.situacaoAluno = "Reprovado";
			}
		}else  {
			JOptionPane.showMessageDialog(null, "As notas só podem ser digitadas para alunos com a situação ATIVA");
		}
	}
	
	public void cadastraRecuperacao() {
		if (this.getSituacaoAluno() == "Fazer prova de recuperação") {
			this.notaRecuperacao = Double.parseDouble( JOptionPane.showInputDialog("Digite a nota de recuperação"));
			double s = (this.getMediaFinal() + this.getNotaRecuperacao()) /2;
			if ((s >=7)|| (s > 6.4)){
				this.situacaoAluno = "Aprovado";
			}else {
				this.situacaoAluno = "Reprovado";
				JOptionPane.showMessageDialog(null, "O aluno não pode realizar a prova");
			}
		}
	}
	
}
