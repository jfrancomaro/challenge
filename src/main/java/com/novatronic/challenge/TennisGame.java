package com.novatronic.challenge;

public class TennisGame {

	private Jugador jugador1;
	private Jugador jugador2;

	public TennisGame(Jugador jugador1, Jugador jugador2) {
		this.jugador1 = jugador1;
		this.jugador2 = jugador2;
	}

	public void validar() {

		Integer puntajeJugador1 = this.jugador1.getPuntos();
		Integer puntajeJugador2 = this.jugador2.getPuntos();

		if (puntajeJugador1 >= 3 && puntajeJugador2 >= 3) {
			this.jugador1.setNombrePuntaje(Puntaje.DEUCE);
			this.jugador2.setNombrePuntaje(Puntaje.DEUCE);

			if (puntajeJugador1 - puntajeJugador2 == 1) {
				this.jugador1.setNombrePuntaje(Puntaje.ADVANTAGE);
			} else if (puntajeJugador2 - puntajeJugador1 == 1) {
				this.jugador2.setNombrePuntaje(Puntaje.ADVANTAGE);
			}

			if (puntajeJugador1 == puntajeJugador2) {
				this.jugador1.setNombrePuntaje(Puntaje.DEUCE);
				this.jugador2.setNombrePuntaje(Puntaje.DEUCE);
			}
		}

		if (puntajeJugador1 >= 4 && puntajeJugador1 - puntajeJugador2 >= 2) {
			this.jugador1.setNombrePuntaje(Puntaje.WINNER);
		} else if (puntajeJugador2 >= 4 && puntajeJugador2 - puntajeJugador1 >= 2) {
			this.jugador2.setNombrePuntaje(Puntaje.WINNER);
		}
	}

	public void score() {
		validar();
		System.out.println("-------------------- SCORE --------------------");
		System.out.println(this.jugador1.getNombres() + " ---------- " + this.jugador1.getNombrePuntaje());
		System.out.println(this.jugador2.getNombres() + " ---------- " + this.jugador2.getNombrePuntaje());

		if (this.jugador1.getNombrePuntaje() == Puntaje.WINNER) {
			System.out.println("-----------------------------------------------");
			System.out.println(this.jugador1.getNombres() + " WINS !!!");
		}
		
		System.out.println("---------------------------------------");
	}

	public Jugador getJugador1() {
		return jugador1;
	}

	public void setJugador1(Jugador jugador1) {
		this.jugador1 = jugador1;
	}

	public Jugador getJugador2() {
		return jugador2;
	}

	public void setJugador2(Jugador jugador2) {
		this.jugador2 = jugador2;
	}
}
