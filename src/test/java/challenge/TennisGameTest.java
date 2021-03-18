package challenge;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.novatronic.challenge.Jugador;
import com.novatronic.challenge.Puntaje;
import com.novatronic.challenge.TennisGame;

public class TennisGameTest{

	private TennisGame tennisGame;
	
	@Before
	public void setUp() {
		tennisGame = new TennisGame(new Jugador("Jean Martinez"), new Jugador("Vicente Mori"));
	}

	@Test
	public void inicializado() {
		assertEquals(Puntaje.LOVE, tennisGame.getJugador1().getNombrePuntaje());
		assertEquals(Puntaje.LOVE, tennisGame.getJugador2().getNombrePuntaje());
	}
	
	@Test
	public void validarSinPuntosMayorATres() {
		tennisGame.getJugador2().anotar();
		tennisGame.getJugador1().anotar();
		tennisGame.getJugador1().anotar();
		tennisGame.score();
		assertEquals(Puntaje.THIRTY, tennisGame.getJugador1().getNombrePuntaje());
		assertEquals(Puntaje.FIFTEEN, tennisGame.getJugador2().getNombrePuntaje());
	}
	
	@Test
	public void validarConPuntosIgualATres() {
		tennisGame.getJugador2().anotar();
		tennisGame.getJugador2().anotar();
		tennisGame.getJugador2().anotar();
		tennisGame.getJugador1().anotar();
		tennisGame.getJugador1().anotar();
		tennisGame.getJugador1().anotar();
		tennisGame.score();
		assertEquals(Puntaje.DEUCE, tennisGame.getJugador1().getNombrePuntaje());
		assertEquals(Puntaje.DEUCE, tennisGame.getJugador2().getNombrePuntaje());
	}
	
	@Test
	public void validarConPuntosIguales() {
		tennisGame.getJugador2().anotar();
		tennisGame.getJugador2().anotar();
		tennisGame.getJugador2().anotar();
		tennisGame.getJugador2().anotar();
		tennisGame.getJugador1().anotar();
		tennisGame.getJugador1().anotar();
		tennisGame.getJugador1().anotar();
		tennisGame.getJugador1().anotar();
		tennisGame.score();
		assertEquals(Puntaje.DEUCE, tennisGame.getJugador1().getNombrePuntaje());
		assertEquals(Puntaje.DEUCE, tennisGame.getJugador2().getNombrePuntaje());
	}
	
	@Test
	public void validarConJugadorWinnerSinDeuce() {
		tennisGame.getJugador2().anotar();
		tennisGame.getJugador2().anotar();
		tennisGame.getJugador1().anotar();
		tennisGame.getJugador1().anotar();
		tennisGame.getJugador1().anotar();
		tennisGame.getJugador1().anotar();
		tennisGame.score();
		assertEquals(Puntaje.WINNER, tennisGame.getJugador1().getNombrePuntaje());
		assertEquals(Puntaje.THIRTY, tennisGame.getJugador2().getNombrePuntaje());
	}
	
	@Test
	public void validarConJugadorWinnerConDeuce() {
		tennisGame.getJugador2().anotar();
		tennisGame.getJugador2().anotar();
		tennisGame.getJugador2().anotar();
		tennisGame.getJugador1().anotar();
		tennisGame.getJugador1().anotar();
		tennisGame.getJugador1().anotar();
		tennisGame.getJugador1().anotar();
		tennisGame.getJugador1().anotar();
		tennisGame.score();
		assertEquals(Puntaje.WINNER, tennisGame.getJugador1().getNombrePuntaje());
		assertEquals(Puntaje.DEUCE, tennisGame.getJugador2().getNombrePuntaje());
	}
	
	@Test
	public void validarConJugadorAdvantageConDeuce() {
		tennisGame.getJugador2().anotar();
		tennisGame.getJugador2().anotar();
		tennisGame.getJugador2().anotar();
		tennisGame.getJugador1().anotar();
		tennisGame.getJugador1().anotar();
		tennisGame.getJugador1().anotar();
		tennisGame.getJugador1().anotar();
		tennisGame.score();
		assertEquals(Puntaje.ADVANTAGE, tennisGame.getJugador1().getNombrePuntaje());
		assertEquals(Puntaje.DEUCE, tennisGame.getJugador2().getNombrePuntaje());
	}
}
