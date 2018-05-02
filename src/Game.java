import javax.swing.JLabel;

public class Game {
	
	private char[] searchWord;
	private JLabel foundChars;
	private char[] found;
	
	Game (char[] searchWord,JLabel foundChars) {							//	E _ E _ _ N T          5 % 1  = 0  3 % 2 = 1  2 % 2 = 0    75min  75 % 60 = 15  75/60 = 1h 15min
		this.searchWord = searchWord;
		this.foundChars = foundChars;											//L U C A S
		this.found = new char[(this.searchWord.length * 2) -1];
		
		for(int i = 0; i < this.found.length; i+=2) {
			System.out.println(i/2);//ELEFANT
			if(i == 0) {																			//E L E F A N T  0 ist 0  3 ist 1 = -2  5 ist 2 = -3  7 ist 3 = -4  9 ist 4 = -5
				this.found[i] = Character.toUpperCase(this.searchWord[i/2]);
			}else {
				if (this.searchWord[i/2] == this.searchWord[0]) {
					this.found[i] = Character.toUpperCase(this.searchWord[i/2]);
				}else {
					this.found[i] = '_';
				}
			}
		}
		
		for(int i = 1; i < this.found.length; i+=2) {
			this.found[i] = ' ';
		}
		
		foundChars.setText(String.valueOf(this.found));
	}
	
	String getSearchWord() {
		return new String(searchWord); 
	}
	
	int checkLetter(char letter) {
		return 1;
	}
}
