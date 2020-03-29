package application.model;

import java.util.ArrayList;

public class CrossPuzzle {
	private String name;
	private ArrayList<Entry> entries;
	//public static CrossPuzzle currentPuzzle;

	
	public CrossPuzzle(String name) {
		this.name = name;
		setEntries(new ArrayList<Entry>());
		String board = blankBoard();
	}
	public CrossPuzzle() {
		name = "";
		setEntries(new ArrayList<Entry>());
		String board = blankBoard();
	}
	public void addEntry(Entry entry){
		this.getEntries().add(entry);
	}
	public void removeEntry(Entry entry) {
		this .getEntries().remove(entry);
	}
//	public void addEntryToCurrentPuzzle(String Word, String Hint) {
//		Entry entry = new Entry(Word,Hint);
//		currentPuzzle.addEntry(entry);
//	}
	public void createPuzzle() {
		CrossPuzzle currentPuzzle = CurrentPuzzle.getInstance().getPuzzle();
		String first = currentPuzzle.entries.get(0).getWord();
		String second = currentPuzzle.entries.get(1).getWord();
		String[] arr = first.split("");
		int firstIndex = 0;
		for  (String ch : arr) {
			int index = second.indexOf(ch);
			if (index != -1) {
				break;	
			}
			firstIndex++;
		}
			
	}
	public void addToBoard(String word, int x, int y, boolean orientation) {
		
	}
	public String blankBoard() {
		String board = "";
		for(int x=0;x>=8;x++) {
			for(int y=0;y>=8;y++) {
				board += "0";
			}
			board += "\n";
		}
		System.out.print(board);
		return board;
	}
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "CrossPuzzle [name=" + name + ", entries=" + entries + "]";
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Entry> getEntries() {
		return entries;
	}
	public void setEntries(ArrayList<Entry> entries) {
		this.entries = entries;
	}
	
}