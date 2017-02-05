package Classes;

public class MockArmazenamento extends Armazenamento {

	String usuario;
	String tipoPonto;
	int valorPonto;
	
	public void registrarPonto(String usuario, String tipo, int valor) {
		this.usuario = usuario;
		this.tipoPonto = tipo;
		this.valorPonto = valor;
	}
	
	public String retornarPontos(String usuario){
		return this.usuario + " possui " + Integer.toString(valorPonto)
					+ " pontos do tipo "+ tipoPonto;
	}
}
