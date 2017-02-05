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
	public void testRegistrarPonto(){
		placar.registrarPonto("felipe","estrela", 10);
		
		assertEquals("felipe possui 10 pontos do tipo estrela", placar.retornarPontos("felipe"));
		
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
