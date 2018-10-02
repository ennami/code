package com.tdd.zero.paire.impaire.positif.negatif;

public class Number {

	private int number;
	private String message;

	public Number() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Number(int number, String message) {
		super();
		this.number = number;
		this.message = message;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public boolean isZero() {
		return (number == 0) ? true : false;
	}

	public boolean isPaire() {
		return (number % 2) == 0 ? true : false;
	}

	public boolean isPositif() {
		return (number > 0) ? true : false;
	}

	public String getMessage() {
		if (isZero()) {
			message = "Le nombre est zéro (et il est pair)";
			return message;
		} else {
			if (isPositif()) {
				message = "Le nombre est positif ";
				setPaireImpaire();
			} else {
				message = "Le nombre est negatif ";
				setPaireImpaire();
			}
		}

		return message;
	}

	private void setPaireImpaire() {
		if (isPaire()) {
			message += "et pair.";
		} else {
			message += "et impair.";
		}
	}
}
