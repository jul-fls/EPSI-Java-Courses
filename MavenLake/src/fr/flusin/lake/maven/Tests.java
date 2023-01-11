package fr.flusin.lake.maven;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class Tests {
	
	@Test
	public void test() {
		assertTrue(true);
	}
	
	@Test
	public void test2() {
		assertFalse(false);
	}
	
	@Test
	public void test3() {
		assertEquals("TEST","LOL");
	}
}
