package com.novatronic.challenge;

public class Jugador {

	private String nombres;
	private Puntaje nombrePuntaje;
	private Integer puntos;

	public Jugador(String nombres) {
		this.nombres = nombres;
		this.nombrePuntaje = Puntaje.LOVE;
		this.puntos = 0;
	}

	public void anotar() {
		this.puntos = this.puntos + 1;
		switch (String.valueOf(puntos)) {
		case "1":
			nombrePuntaje = Puntaje.FIFTEEN;
			break;
		case "2":
			nombrePuntaje = Puntaje.THIRTY;
			break;
		case "3":
			nombrePuntaje = Puntaje.FORTY;
			break;
		}
		System.out.println(this.nombres + " --- ANOTÓ");
	}

	public Integer getPuntos() {
		return puntos;
	}

	public void setPuntos(Integer puntos) {
		this.puntos = puntos;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public Puntaje getNombrePuntaje() {
		return nombrePuntaje;
	}

	public void setNombrePuntaje(Puntaje nombrePuntaje) {
		this.nombrePuntaje = nombrePuntaje;
	}
}
