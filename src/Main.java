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
import java.awt.event.ActionEvent;

public class Main {

	private JFrame frmHangman;
	private JPasswordField textfield_searchWord;
	private JButton btnNeu;

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
				System.out.println("Das Wort lautet: " + new String(textfield_searchWord.getPassword()) );
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
				btnNeu.setVisible(false);
			}
		});
		btnNeu.setBounds(10, 11, 145, 23);
		frmHangman.getContentPane().add(btnNeu);
		
		JButton btnA = new JButton("A");
		btnA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnA.setBounds(26, 307, 42, 42);
		frmHangman.getContentPane().add(btnA);
		
		JButton btnB = new JButton("B");
		btnB.setBounds(67, 307, 42, 42);
		frmHangman.getContentPane().add(btnB);
		
		JButton btnC = new JButton("C");
		btnC.setBounds(108, 307, 42, 42);
		frmHangman.getContentPane().add(btnC);
		
		JButton btnD = new JButton("D");
		btnD.setBounds(149, 307, 42, 42);
		frmHangman.getContentPane().add(btnD);
		
		JButton btnE = new JButton("E");
		btnE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnE.setBounds(190, 307, 42, 42);
		frmHangman.getContentPane().add(btnE);
		
		JButton btnF = new JButton("F");
		btnF.setBounds(231, 307, 42, 42);
		frmHangman.getContentPane().add(btnF);
		
		JButton btnG = new JButton("G");
		btnG.setBounds(272, 307, 42, 42);
		frmHangman.getContentPane().add(btnG);
		
		JButton btnH = new JButton("H");
		btnH.setBounds(313, 307, 42, 42);
		frmHangman.getContentPane().add(btnH);
		
		JButton btnI = new JButton("I");
		btnI.setBounds(354, 307, 42, 42);
		frmHangman.getContentPane().add(btnI);
		
		JButton btnJ = new JButton("J");
		btnJ.setBounds(395, 307, 42, 42);
		frmHangman.getContentPane().add(btnJ);
		
		JButton btnK = new JButton("K");
		btnK.setBounds(26, 349, 42, 42);
		frmHangman.getContentPane().add(btnK);
		
		JButton btnL = new JButton("L");
		btnL.setBounds(108, 349, 42, 42);
		frmHangman.getContentPane().add(btnL);
		
		JButton btnM = new JButton("M");
		btnM.setBounds(67, 349, 42, 42);
		frmHangman.getContentPane().add(btnM);
		
		JButton btnN = new JButton("N");
		btnN.setBounds(313, 349, 42, 42);
		frmHangman.getContentPane().add(btnN);
		
		JButton btnO = new JButton("O");
		btnO.setBounds(354, 349, 42, 42);
		frmHangman.getContentPane().add(btnO);
		
		JButton btnP = new JButton("P");
		btnP.setBounds(395, 349, 42, 42);
		frmHangman.getContentPane().add(btnP);
		
		JButton btnQ = new JButton("Q");
		btnQ.setBounds(149, 390, 42, 42);
		frmHangman.getContentPane().add(btnQ);
		
		JButton btnR = new JButton("R");
		btnR.setBounds(26, 390, 42, 42);
		frmHangman.getContentPane().add(btnR);
		
		JButton btnS = new JButton("S");
		btnS.setBounds(108, 390, 42, 42);
		frmHangman.getContentPane().add(btnS);
		
		JButton btnT = new JButton("T");
		btnT.setBounds(67, 390, 42, 42);
		frmHangman.getContentPane().add(btnT);
		
		JButton btnU = new JButton("U");
		btnU.setBounds(190, 390, 42, 42);
		frmHangman.getContentPane().add(btnU);
		
		JButton btnV = new JButton("V");
		btnV.setBounds(231, 390, 42, 42);
		frmHangman.getContentPane().add(btnV);
		
		JButton btnW = new JButton("W");
		btnW.setBounds(313, 390, 42, 42);
		frmHangman.getContentPane().add(btnW);
		
		JButton btnX = new JButton("X");
		btnX.setBounds(272, 390, 42, 42);
		frmHangman.getContentPane().add(btnX);
		
		JButton btnY = new JButton("Y");
		btnY.setBounds(354, 390, 42, 42);
		frmHangman.getContentPane().add(btnY);
		
		JButton btnZ = new JButton("Z");
		btnZ.setBounds(395, 390, 42, 42);
		frmHangman.getContentPane().add(btnZ);
	}
}
