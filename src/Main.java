import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JDesktopPane;
import java.awt.BorderLayout;
import javax.swing.JPanel;

public class Main {

	private JFrame frmHangman;

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
		
		JPanel panel_start = new JPanel();
		frmHangman.getContentPane().add(panel_start, BorderLayout.CENTER);
	}

}
