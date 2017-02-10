package Classes;

public class Placar {

	Armazenamento armazenamento;

	public Placar() {
		//Construtor sem argumentos
	}

	public Placar(Armazenamento arm) {
		this.armazenamento = arm;
	}
	
	public void registrarPonto(String usuario, String tipo, int valor) {
		armazenamento.registrarPonto(usuario, tipo, valor);
	}

	public String retornarPonto(String usuario) {
		return armazenamento.retornarPonto(usuario);
	}

	public String retornarRankPonto(String string) {
		return armazenamento.retornarRank(string);
	}

	public void setArmazenamento(Armazenamento arm){
		this.armazenamento = arm;
		
	}

}
