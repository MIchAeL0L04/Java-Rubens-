import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		Situacao situacao = new Situacao();
		int s = invocarmenu();
		
		while (s != 6) {
			if (s == 1) {
				situacao.cadastraAluno();
				s = invocarmenu();
			}
			else if (s == 2) {
				situacao.cadastraNota();
				s = invocarmenu();
			}
			else if (s == 3) {
				situacao.cadastraRecuperacao();
				s = invocarmenu();
			}
			else if (s == 4) {
				JOptionPane.showMessageDialog(null, "Aluno: " + situacao.getNome() + "\n Nota 1: " + situacao.getN1() + "\n Nota 2: " + situacao.getN2() + "\n Nota 3: " + situacao.getN3() + "\n Nota 4: " + situacao.getN4() + "\nNota de recuperação: " + situacao.getNotaRecuperacao() + "\n Nota Atual: " + ((situacao.getMediaFinal() + situacao.getNotaRecuperacao())/2) );
				s = invocarmenu();
			}
			else if (s == 5) {
				JOptionPane.showMessageDialog(null, "Aluno: " + situacao.getSituacaoAluno());
				s = invocarmenu();
			}
		}
		
		if (s ==6) {
			JOptionPane.showMessageDialog(null, "Obrigado por usar o programa.");
			System.exit(1);
		}
		
		
	}
	
	public static int invocarmenu() {
		int s = Integer.parseInt(JOptionPane.showInputDialog("1 - Cadastra Aluno. \n 2 - Cadastra Notas. \n 3 - Cadastra nota Recuperação. \n 4 - Exibe informação do Aluno. \n 5 - Exibe situação Aluno. \n 6 - Sair"));
		return s;	
	}
}
