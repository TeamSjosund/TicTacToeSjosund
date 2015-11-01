package is.sjosund.TicTacToeSjosund;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BoardTest {
	public static void main (String args[]) {
		org.junit.runner.JUnitCore.main("is.sjosund.TicTacToeSjosund.BoardTest");
	}

	@Test
	public void testMakeBoard() {
		char[][] board = { {'-', '-', '-'}, {'-', '-', '-'}, {'-', '-', '-'} };
		assertEquals(board, TicTacToe.makeBoard(3));
	}
	
	@Test
	public void testMakeBoardTooSmall() {
		try {
			TicTacToe.makeBoard(-1);
		}
		catch(Exception ex)
		{
			assertEquals("Size too small", ex.getMessage());
		}
	}

}