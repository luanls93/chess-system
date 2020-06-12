package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessPiece extends Piece {

	private Color colocar;

	public ChessPiece(Board board, Color colocar) {
		super(board);
		this.colocar = colocar;
	}

	public Color getColocar() {
		return colocar;
	}

	
	
	
}
