
public class Game {
	
	private char[] searchWord;
	
	Game (char[] searchWord) {
		this.searchWord = searchWord;
	}
	
	String getSearchWord() {
		return new String(searchWord); 
	}
	
	int checkLetter(char letter) {
		return 1;
	}
}
