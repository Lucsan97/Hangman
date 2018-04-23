import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JDesktopPane;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPasswordField;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Main {

	private JFrame frmHangman;
	private JPasswordField textfield_searchWord;
	private JButton btnNeu;
	private Game game;
	private ArrayList<JButton> allButtons = new ArrayList<JButton>();


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frmHangman.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}
	
	void buttonAction(JButton button, char letter) {
		if(game != null) {
			game.checkLetter(letter);
			button.setVisible(false);
		}
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHangman = new JFrame();
		frmHangman.setTitle("Galgenraten");
		frmHangman.setBounds(100, 100, 986, 556);
		frmHangman.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHangman.getContentPane().setLayout(null);
		
		
		
		JPanel panel_start = new JPanel();
		panel_start.setBounds(712, 252, 248, 254);
		panel_start.setBackground(Color.LIGHT_GRAY);
		frmHangman.getContentPane().add(panel_start);
		panel_start.setLayout(null);
		
		JLabel lblHerzlichWillkommen = new JLabel("Herzlich Willkommen");
		lblHerzlichWillkommen.setBounds(48, 11, 154, 21);
		lblHerzlichWillkommen.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel_start.add(lblHerzlichWillkommen);
		
		JLabel lblGibDasZu = new JLabel("Gib das zu ratende Wort ein!");
		lblGibDasZu.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblGibDasZu.setBounds(38, 121, 174, 14);
		panel_start.add(lblGibDasZu);
		
		textfield_searchWord = new JPasswordField();
		textfield_searchWord.setBounds(48, 147, 147, 21);
		panel_start.add(textfield_searchWord);
		
		JButton btnStart = new JButton("Start");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				game = new Game(textfield_searchWord.getPassword());
				System.out.print(game.getSearchWord());
				for(int i = 0; i < allButtons.size(); i ++) {
					allButtons.get(i).setVisible(true);
				}
				panel_start.setVisible(false);
				btnNeu.setVisible(true);
				
			}
		});
		btnStart.setBounds(79, 193, 89, 23);
		panel_start.add(btnStart);
		
		btnNeu = new JButton("Neues Spiel");
		btnNeu.setVisible(false);
		btnNeu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textfield_searchWord.setText("");
				textfield_searchWord.grabFocus();
				panel_start.setVisible(true);
				for(int i = 0; i < allButtons.size(); i ++) {
					allButtons.get(i).setVisible(false);
				}
				btnNeu.setVisible(false);
			}
		});
		btnNeu.setBounds(10, 11, 145, 23);
		frmHangman.getContentPane().add(btnNeu);
		
		JButton btnA = new JButton("A");
		allButtons.add(btnA);
		btnA.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				buttonAction(btnA, 'A');
			}
		});
		btnA.setBounds(26, 307, 42, 42);
		frmHangman.getContentPane().add(btnA);
		
		JButton btnB = new JButton("B");
		allButtons.add(btnB);
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonAction(btnB, 'B');
			}
		});
		btnB.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnB.setBounds(67, 307, 42, 42);
		frmHangman.getContentPane().add(btnB);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnC.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnC.setBounds(108, 307, 42, 42);
		frmHangman.getContentPane().add(btnC);
		
		JButton btnD = new JButton("D");
		btnD.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnD.setBounds(149, 307, 42, 42);
		frmHangman.getContentPane().add(btnD);
		
		JButton btnE = new JButton("E");
		btnE.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnE.setBounds(190, 307, 42, 42);
		frmHangman.getContentPane().add(btnE);
		
		JButton btnF = new JButton("F");
		btnF.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnF.setBounds(231, 307, 42, 42);
		frmHangman.getContentPane().add(btnF);
		
		JButton btnG = new JButton("G");
		btnG.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnG.setBounds(272, 307, 42, 42);
		frmHangman.getContentPane().add(btnG);
		
		JButton btnH = new JButton("H");
		btnH.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnH.setBounds(313, 307, 42, 42);
		frmHangman.getContentPane().add(btnH);
		
		JButton btnI = new JButton("I");
		btnI.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnI.setBounds(354, 307, 42, 42);
		frmHangman.getContentPane().add(btnI);
		
		JButton btnJ = new JButton("J");
		btnJ.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnJ.setBounds(395, 307, 42, 42);
		frmHangman.getContentPane().add(btnJ);
		
		JButton btnK = new JButton("K");
		btnK.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnK.setBounds(26, 349, 42, 42);
		frmHangman.getContentPane().add(btnK);
		
		JButton btnL = new JButton("L");
		btnL.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnL.setBounds(67, 349, 42, 42);
		frmHangman.getContentPane().add(btnL);
		
		JButton btnM = new JButton("M");
		btnM.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnM.setBounds(108, 349, 42, 42);
		frmHangman.getContentPane().add(btnM);
		
		JButton btnN = new JButton("N");
		btnN.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnN.setBounds(313, 349, 42, 42);
		frmHangman.getContentPane().add(btnN);
		
		JButton btnO = new JButton("O");
		btnO.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnO.setBounds(354, 349, 42, 42);
		frmHangman.getContentPane().add(btnO);
		
		JButton btnP = new JButton("P");
		btnP.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnP.setBounds(395, 349, 42, 42);
		frmHangman.getContentPane().add(btnP);
		
		JButton btnQ = new JButton("Q");
		btnQ.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnQ.setBounds(26, 390, 42, 42);
		frmHangman.getContentPane().add(btnQ);
		
		JButton btnR = new JButton("R");
		btnR.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnR.setBounds(67, 390, 42, 42);
		frmHangman.getContentPane().add(btnR);
		
		JButton btnS = new JButton("S");
		btnS.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnS.setBounds(108, 390, 42, 42);
		frmHangman.getContentPane().add(btnS);
		
		JButton btnT = new JButton("T");
		btnT.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnT.setBounds(149, 390, 42, 42);
		frmHangman.getContentPane().add(btnT);
		
		JButton btnU = new JButton("U");
		btnU.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnU.setBounds(190, 390, 42, 42);
		frmHangman.getContentPane().add(btnU);
		
		JButton btnV = new JButton("V");
		btnV.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnV.setBounds(231, 390, 42, 42);
		frmHangman.getContentPane().add(btnV);
		
		JButton btnW = new JButton("W");
		btnW.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnW.setBounds(272, 390, 42, 42);
		frmHangman.getContentPane().add(btnW);
		
		JButton btnX = new JButton("X");
		btnX.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnX.setBounds(313, 390, 42, 42);
		frmHangman.getContentPane().add(btnX);
		
		JButton btnY = new JButton("Y");
		btnY.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnY.setBounds(354, 390, 42, 42);
		frmHangman.getContentPane().add(btnY);
		
		JButton btnZ = new JButton("Z");
		btnZ.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnZ.setBounds(395, 390, 42, 42);
		frmHangman.getContentPane().add(btnZ);
		
		JLabel lblNewLabel = new JLabel("E _ _ _ A _ T");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 49));
		lblNewLabel.setBounds(26, 140, 635, 105);
		frmHangman.getContentPane().add(lblNewLabel);
	}
}
