package _02_More_Algorithms;

import static org.junit.Assert.*;
import  org.junit.Test;
import static org.junit.Assert.assertTrue;

/**
 * Uncomment each test and then write the method to make it pass.
 * **/

public class _00_MoreAndMoreTests {

	@Test
	  public void MultTest() {

	    assertEquals("10 * 0 = 0", Mult.Mult(10, 0));
	    assertEquals("10 * 10 = 100", Mult.Mult(10, 10));
	    assertEquals("8 * 11 = 88", Mult.Mult(8, 11));
	  }

	@Test
	  public void PrimeTest() {

	    assertTrue(Prime.Prime(3));
	    assertTrue(Prime.Prime(5));
	    assertTrue(Prime.Prime(541));
	    assertFalse(Prime.Prime(4));
	    assertFalse(Prime.Prime(12));
	    assertFalse(Prime.Prime(527));


	  }

	@Test
	  public void SquareTest() {

	    assertTrue(Square.isSquare(4));
	    assertTrue(Square.isSquare(144));
	    assertTrue(Square.isSquare(64));
	    assertTrue(Square.isSquare(10201));
	    assertFalse(Square.isSquare(3));
	    assertFalse(Square.isSquare(22));
	    assertFalse(Square.isSquare(143));
	    assertTrue(Square.isSquare(1));


	  }

	@Test
	  public void CubeTest() {

	    assertTrue(Cube.isCubed(27));
	    assertTrue(Cube.isCubed(216));
	    assertTrue(Cube.isCubed(729));
	    assertTrue(Cube.isCubed(1));
	    assertFalse(Cube.isCubed(3));
	    assertFalse(Cube.isCubed(22));

	  }



}
