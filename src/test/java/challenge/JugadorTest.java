package challenge;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.novatronic.challenge.Jugador;
import com.novatronic.challenge.Puntaje;

public class JugadorTest  {
	
	private Jugador jugador;
	
	@Before
	public void setUp() {
		jugador = new Jugador("Jean Martinez");
	}

	@Test
	public void inicializado() {
		assertEquals(Puntaje.LOVE, jugador.getNombrePuntaje());
	}
	
	@Test
	public void anotarUnPunto() {
		jugador.anotar();
		assertEquals(Puntaje.FIFTEEN, jugador.getNombrePuntaje());
	}
	
	@Test
	public void anotarDosPunto() {
		jugador.anotar();
		jugador.anotar();
		assertEquals(Puntaje.THIRTY, jugador.getNombrePuntaje());
	}
	
	@Test
	public void anotarTresPunto() {
		jugador.anotar();
		jugador.anotar();
		jugador.anotar();
		assertEquals(Puntaje.FORTY, jugador.getNombrePuntaje());
	}
}
