import javax.swing.JLabel;
import javax.swing.JPanel;

public class Game {
	
	private char[] searchWord;
	private JLabel foundChars;
	private char[] found;
	
	Game (char[] searchWord,JLabel foundChars, JPanel panel_win ) {							//	E _ E _ _ N T          5 % 1  = 0  3 % 2 = 1  2 % 2 = 0    75min  75 % 60 = 15  75/60 = 1h 15min
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
		
		for(int i = 1; i < this.found.length; i+=2) {													//  E L E F A N T       E _ _ _ E _ F _ A _ N _ T
			this.found[i] = ' ';
									
		}
		
		foundChars.setText(String.valueOf(this.found));
	}
	
	String getSearchWord() {
		return new String(searchWord); 
	}
	
	void checkLetter(char letter) {
		for(int i = 2; i < this.found.length; i+= 2) {
			if (Character.toUpperCase(this.searchWord[i/2]) == Character.toUpperCase(letter)  ) {
				this.found[i] = Character.toUpperCase(letter);
			}
		}
		foundChars.setText(String.valueOf(this.found));
		this.checkWin();
	}
	
	void checkWin() {
		System.out.println("hallo");
		for(int i = 0; i < 10; i++ ) {
			
				
		}			  
	}
	
}
	
