package Classes;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Armazenamento {

	// site para suporte:
	// https://www.caveofprogramming.com/java/java-file-reading-and-writing-files-in-java.html

	String fileName;
	File file;

	public Armazenamento() {
	}

	public Armazenamento(String nome) throws IOException {
		fileName = nome;
		file = new File(nome + ".txt");
		file.createNewFile();
	}

	public void registrarPonto(String usuario, String tipo, int valor) {

		try (FileWriter fw = new FileWriter(fileName+".txt", true);
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter out = new PrintWriter(bw)) {
			out.print(usuario);
			out.print(" "+tipo);
			out.println(" "+Integer.toString(valor));
		} catch (IOException e) {
		}

	}

	public String retornarPonto(String usuario) {
		return usuario;

	}

	public String retornarRank(String tipoPonto) {
		return tipoPonto;

	}

}
