package Testes;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import Classes.Armazenamento;
import Classes.Placar;

public class ArmazenamentoTest {

	Placar placar;
	Armazenamento arm;

	@Before
	public void setUP() {

		try {
			arm = new Armazenamento("Placar");
		} catch (IOException e) {
			System.out.println("Não foi possível criar o arquivo!");
		}
		placar = new Placar(arm);
	}

	@Test
	public void testRegistrarPonto() {
		placar.registrarPonto("Felipe", "moeda", 100);
		placar.registrarPonto("Felipe", "estrela", 50);
	}

}
