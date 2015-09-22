package assignment1.chessview;

import org.eclipse.jdt.annotation.*;

import assignment1.chessview.moves.Move;

/**
 * A round consists of a move by white, and will normally also have a move by
 * black. The latter may not happen in the case that White wins the game.
 * 
 * @author djp
 * 
 */
public class Round {
	private @NonNull Move white;
	private @Nullable Move black;
	
	/**
	 * Create a round from a white move, and an optional black move.
	 * 
	 * @param white - whites move; cannot be null;
	 * @param black - blacks move; may be null.
	 */
	public Round(@NonNull Move white,@Nullable Move black) {
		if(white == null) {
			throw new IllegalArgumentException("A round must always consist of a move by white");
		}
		this.white = white;
		this.black = black;
	}
	
	public @NonNull Move white() {
		return white;
	}
	
	public @Nullable Move black() {
		return black;
	}
	
	public @NonNull String toString() {
		String r = white.toString();
		if(black != null) {
			Move blackMove = black;
			assert(blackMove != null);
			r += " " + blackMove.toString();
		}
		assert(r != null);
		return r;
	}
}
