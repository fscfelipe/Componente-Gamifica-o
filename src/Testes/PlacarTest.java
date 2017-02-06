package Testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Classes.MockArmazenamento;
import Classes.Placar;

public class PlacarTest {
	
	Placar placar;
	MockArmazenamento mock;
	

	@Before
	public void setUP(){
		mock = new MockArmazenamento();
		placar = new Placar(mock);
		
	}
	
	@Test
	public void testRegistrar1TipoDePonto(){
		placar.registrarPonto("Felipe","estrela", 10);
		
		assertEquals("Felipe possui 10 pontos do tipo estrela", placar.retornarPonto("Felipe"));
	}
	
	@Test
	public void testRegistrar2TipoDePonto(){
		placar.registrarPonto("Felipe", "estrela", 50);
		placar.registrarPonto("Felipe", "moeda", 30);
		
		assertEquals("Felipe possui 30 pontos do tipo moeda e 50 pontos do tipo estrela"
					, placar.retornarPonto("Felipe"));
	}
	
	@Test
	public void testRegistrar1Ponto2Usuarios(){
	}
	
	@Test
	public void testRetornarPontos(){
		placar.registrarPonto("Felipe", "estrela", 44);
		placar.registrarPonto("Jonas", "moeda", 67);
		placar.registrarPonto("Jonas", "estrela", 55);
		
		assertEquals("Jonas possui 67 pontos do tipo moeda e 55 pontos do tipo estrela"
				, placar.retornarPonto("Jonas"));
	}
	
	@Test
	public void testRetornarRank(){
	}

}
