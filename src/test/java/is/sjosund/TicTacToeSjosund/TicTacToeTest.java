package is.sjosund.TicTacToeSjosund;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TicTacToeTest {
	public static void main (String args[]) {
		org.junit.runner.JUnitCore.main("is.sjosund.TicTacToeSjosund.TicTacToeTest");
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

	@Test
	public void testMakeLegalMove() {
		char[][] board = { {'-', '-', '-'}, {'-', '-', '-'}, {'-', '-', '-'} };
		char[][] board2 = { {'x', '-', '-'}, {'-', '-', '-'}, {'-', '-', '-'} };
		assertEquals(board2, TicTacToe.makeMove(0, 0, board, 'x'));
	}

	@Test
	public void testMakeOutOfBoardMove() {
		char[][] board = { {'-', '-', '-'}, {'-', '-', '-'}, {'-', '-', '-'} };
		try {
			TicTacToe.makeMove(0, 3, board, 'x');
		}
		catch(Exception ex)
		{
			assertEquals("Move out of bounds", ex.getMessage());
		}
	}

	@Test
	public void testMoveAlreadyPlayed() {
		char[][] board = { {'o', '-', '-'}, {'-', '-', '-'}, {'-', '-', '-'} };
		try {
			TicTacToe.makeMove(0, 0, board, 'x');
		}
		catch(Exception ex)
		{
			assertEquals("Move already made", ex.getMessage());
		}
	}
}
