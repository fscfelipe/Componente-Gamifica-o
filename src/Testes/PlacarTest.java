package Testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Classes.MockArmazenamento;
import Classes.Placar;
import Classes.Usuario;

public class PlacarTest {
	
	Placar placar;
	MockArmazenamento mock;
	Usuario user1;
	

	@Before
	public void setUP(){
		mock = new MockArmazenamento();
		placar = new Placar(mock);
		
	}
	
	@Test
	public void testRegistrar1TipoDePonto(){
		placar.registrarPonto("Felipe","estrela", 10);
		
		assertEquals("felipe possui 10 pontos do tipo estrela", placar.retornarPontos("felipe"));
	}
	
	@Test
	public void testRegistrar2TipoDePonto(){
		placar.registrarPonto("felipe", "moeda", 50);
		placar.registrarPonto("felipe", "estrela", 30);
		
		assertEquals("felipe possui 50 pontos do tipo moeda e 30 pontos do tipo estrela"
					, placar.retornarPontos("felipe"));
	}
	
	@Test
	public void testRetornarPontos(){
		String pontos = placar.retornarPontos("felipe");
	}
	
	@Test
	public void testRetornarRank(){
		String rankPontos = placar.retornarRankPonto("estrela");
	}

}
