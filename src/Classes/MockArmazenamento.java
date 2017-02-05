package Classes;

import java.util.HashMap;
import java.util.Map;

public class MockArmazenamento extends Armazenamento {
	
	Map<String, Map<String, Integer>> lista = new HashMap<>();
	
	public void registrarPonto(String usuario, String tipo, int valor) {
		for(Map mapa: lista){
			if(mapa.get(usuario) == usuario){
				lista.put(key, value)
			}
		}
	}
	
	public String retornarPontos(String usuario){
		return usuario;
		
	}
}
