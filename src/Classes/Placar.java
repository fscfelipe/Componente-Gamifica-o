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

	public String retornarPontos(String usuario) {
		return armazenamento.retornarPontos(usuario);
	}

	public String retornarRankPonto(String string) {
		return null;
	}

	public void setArmazenamento(Armazenamento arm){
		this.armazenamento = arm;
		
	}

}
