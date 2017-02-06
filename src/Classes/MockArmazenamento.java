package Classes;

import java.util.HashMap;
import java.util.Map;

public class MockArmazenamento extends Armazenamento {

	Map<String, HashMap<String, Integer>> lista = new HashMap<String, HashMap<String, Integer>>();

	public void registrarPonto(String usuario, String tipo, int valor) {

		if (lista.containsKey(usuario)) {
			if (lista.get(usuario).containsKey(tipo)) {
				int valorAux = lista.get(usuario).get(tipo);
				lista.get(usuario).put(tipo, valorAux + valor);
			} else {
				lista.get(usuario).put(tipo, valor);
			}
		} else {
			lista.put(usuario, new HashMap<String, Integer>());
			lista.get(usuario).put(tipo, valor);
		}
	}

	public String retornarPonto(String usuario) {
		String output = usuario + " possui ";
		int count = 1;

		if (lista.containsKey(usuario)) {

			Map<String, Integer> outer = new HashMap<String, Integer>();
			outer = lista.get(usuario);

			for (Map.Entry<String, Integer> inner : outer.entrySet()) {
				if (lista.get(usuario).size() == count) {
					output = output + Integer.toString(inner.getValue()) + " pontos do tipo " + inner.getKey();
				} else {
					output = output + Integer.toString(inner.getValue()) + " pontos do tipo " + inner.getKey() + " e ";
					count++;
				}
			}

			return output;

		} else {
			return "Usuário inexistente!";
		}
	}

}
