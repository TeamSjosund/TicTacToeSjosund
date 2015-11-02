package is.sjosund.TicTacToeSjosund;

public class TicTacToe {
    public static void main(String[] args) {
	Board board = new Board(3);
    Player player1 = new Player('x');
    Player player2 = new Player('o');
    char winner = '-';
    boolean player1Turn = true;
    while (!board.checkIfFull(board.BOARD) && winner == '-') {
        board.printBoard();
        if (player1Turn == true)
        {
        	int p1x;
        	int p1y;
        	do {
	            p1x = player1.humanXMove();
	            p1y = player1.humanYMove();
            } while (!board.checkBoard(p1x, p1y, board.BOARD));
            board.makeMove(p1x, p1y, board.BOARD, player1.playerChar());
            player1Turn = false;
        }
        else
        {
        	int p2x;
        	int p2y;
        	do {
	            p2x = player2.humanXMove();
	            p2y = player2.humanYMove();
	        } while (!board.checkBoard(p2x, p2y, board.BOARD));
            board.makeMove(p2x, p2y, board.BOARD, player2.playerChar());
            player1Turn = true;
        }
        winner = board.winner(board.BOARD);
    }
    board.printBoard();
    System.out.println("Winner: " + winner);
}

    
}
