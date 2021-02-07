import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class testNewProperty extends JFrame{
	public testNewProperty() {
		initialize();
	}
	
	public static void main(String[] args) {
		testNewProperty window = new testNewProperty();		
	}

	/**
	 * Create the application.
	 */
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setSize(1024,700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
//		setContentPane(new NewPropertyPage());
		setContentPane(new RentRequestsPage());
		
		this.setVisible(true);
	}
}
