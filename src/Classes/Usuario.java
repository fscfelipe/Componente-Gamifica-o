package Classes;

import java.util.HashMap;
import java.util.Map;

public class Usuario {

	private String nome;
	private String valores = "";
	private Map<String, Integer> pontos = new HashMap<>();
	
	public Usuario(String nome){
		this.nome = nome;
	}

	public void adicionarPontos(String tipo, int valor) {
		if(pontos.containsKey(tipo))
			pontos.put(tipo, pontos.get(tipo) + valor);
		else
			pontos.put(tipo, valor);
	}

	public String getNome() {
		return nome;
	}
	
	public String getPontos(){
		for(Map.Entry<String, Integer> entry: pontos.entrySet()){
			valores = valores + Integer.toString(entry.getValue()) + " do tipo " + entry.getKey();
		}
		
		return valores;
	}
	
	

}
