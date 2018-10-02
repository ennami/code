package com.tdd.zero.paire.impaire.positif.negatif;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NumberTest {

	private final static String MESSAGE_ZERO = "Le nombre est zéro (et il est pair)";

	private final static String MESSAGE_POSITIF_PAIR = "Le nombre est positif et pair.";
	private final static String MESSAGE_POSITIF_IMPAIR = "Le nombre est positif et impair.";

	private final static String MESSAGE_NEGATIF_PAIR = "Le nombre est negatif et pair.";
	private final static String MESSAGE_NEGATIF_IMPAIR = "Le nombre est negatif et impair.";
	private Number number;

	@Before
	public void setUp() {

		number = new Number();

	}

	@Test
	public void testInstanceOfNumber() {
		assertTrue(number instanceof Number);
	}

	@Test
	public void testIfNumberIsZero() {
		number.setNumber(0);
		assertTrue(number.isZero());
	}

	@Test
	public void testIfNumberIsNotZero() {
		number.setNumber(5);
		assertFalse(number.isZero());
	}

	@Test
	public void testMessageIsZero() {
		number.setNumber(0);
		assertEquals(MESSAGE_ZERO, number.getMessage());
	}

	@Test
	public void testMessageIsNotZero() {
		number.setNumber(8);
		assertNotEquals(MESSAGE_ZERO, number.getMessage());
	}

	@Test
	public void testIfNumberIsPaire() {
		number.setNumber(8);
		assertTrue(number.isPaire());
	}

	@Test
	public void testIfNumberIsImpaire() {
		number.setNumber(7);
		assertFalse(number.isPaire());
	}

	@Test
	public void testIfNumberIsPositif() {
		number.setNumber(6);
		assertTrue(number.isPositif());
	}

	@Test
	public void testIfNumberIsNegatif() {
		number.setNumber(-12);
		assertFalse(number.isPositif());
	}

	@Test
	public void testMessageZero() {
		number.setNumber(0);
		assertEquals(MESSAGE_ZERO, number.getMessage());
	}
	
	@Test
	public void testMessagePositif_Paire() {
		number.setNumber(8);
		assertEquals(MESSAGE_POSITIF_PAIR, number.getMessage());
	}
	
	@Test
	public void testMessagePositif_Impaire() {
		number.setNumber(5);
		assertEquals(MESSAGE_POSITIF_IMPAIR, number.getMessage());
	}
	
	@Test
	public void testMessageNegatif_Paire() {
		number.setNumber(-12);
		assertEquals(MESSAGE_NEGATIF_PAIR, number.getMessage());
	}
	
	@Test
	public void testMessageNegatif_Impaire() {
		number.setNumber(-29);
		assertEquals(MESSAGE_NEGATIF_IMPAIR, number.getMessage());
	}
	
	

}
