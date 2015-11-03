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
		assertEquals(board, Board.makeBoard(3));
	}
	
	@Test
	public void testMakeBoardTooSmall() {
		try {
			Board.makeBoard(-1);
		}
		catch(Exception ex)
		{
			assertEquals("Size too small", ex.getMessage());
		}
	}
	
	@Test
	public void testInvalidFieldCheckBoard() {
		char[][] board = { {'-', '-', '-'}, {'-', '-', '-'}, {'-', '-', '-'} };
		try {
			Board.checkBoard(-1, 0, board);
		}
		catch(Exception ex) {
			assertEquals("Not a valid field", ex.getMessage());
		}
	}
	
	@Test
	public void testLegalInputCheckBoard() {
		char[][] board = { {'-', '-', '-'}, {'-', '-', '-'}, {'-', '-', '-'} };
		assertEquals(true, Board.checkBoard(0, 0, board));
	}
	
	@Test
	public void testFieldAlreadyTakenCheckBoard() {
		char[][] board = { {'x', '-', '-'}, {'-', '-', '-'}, {'-', '-', '-'} };
		assertEquals(false, Board.checkBoard(0, 0, board));
	}
	
	@Test
	public void testMakeLegalMove() {
		char[][] board = { {'-', '-', '-'}, {'-', '-', '-'}, {'-', '-', '-'} };
		char[][] board2 = { {'x', '-', '-'}, {'-', '-', '-'}, {'-', '-', '-'} };
		assertEquals(board2, Board.makeMove(0, 0, board, 'x'));
	}

	@Test
	public void testMakeOutOfBoardMove() {
		char[][] board = { {'-', '-', '-'}, {'-', '-', '-'}, {'-', '-', '-'} };
		try {
			Board.makeMove(0, 3, board, 'x');
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
			Board.makeMove(0, 0, board, 'x');
		}
		catch(Exception ex)
		{
			assertEquals("Move already made", ex.getMessage());
		}
	}
	
	@Test
	public void testHorizontalWinner() {
		char[][] board = { {'o', 'o', 'o'}, {'-', '-', '-'}, {'-', '-', '-'} };
		assertEquals('o', Board.winner(board));
	}
	
	@Test
	public void testVerticalWinner() {
		char[][] board = { {'x', '-', '-'}, {'x', '-', '-'}, {'x', '-', '-'} };
		assertEquals('x', Board.winner(board));
	}
	
	@Test
	public void testDiagonalWinner() {
		char[][] board = { {'x', '-', '-'}, {'-', 'x', '-'}, {'-', '-', 'x'} };
		assertEquals('x', Board.winner(board));
	}
	
	@Test
	public void testDiagonalWinner2() {
		char[][] board = { {'-', '-', 'x'}, {'-', 'x', '-'}, {'x', '-', '-'} };
		assertEquals('x', Board.winner(board));
	}
	
	@Test
	public void testIfFull() {
		char[][] board = { {'o', 'o', 'x'}, {'x', 'x', 'o'}, {'o', 'x', 'x'} };
		assertEquals(true, Board.checkIfFull(board));
	}
}