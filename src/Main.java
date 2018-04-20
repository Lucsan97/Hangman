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
		
		JButton btnNewButton = new JButton("A");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(26, 307, 42, 42);
		frmHangman.getContentPane().add(btnNewButton);
	}
}
