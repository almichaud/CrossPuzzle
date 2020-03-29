package application.model;

public class CurrentPuzzle {
	private static CurrentPuzzle instance = null;
	private CrossPuzzle puzzle;
	
	private CurrentPuzzle() {
		puzzle = new CrossPuzzle();
	}
	
	public static CurrentPuzzle getInstance() {
		if(instance == null)
			instance = new CurrentPuzzle();
		return instance;
	}
	
	public CrossPuzzle getPuzzle() {
		return puzzle;
	}
}
