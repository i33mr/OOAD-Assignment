import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

public class testNoResultsFound extends JFrame{

	
	public static void main(String[] args) {
		testNoResultsFound window = new testNoResultsFound();		
	}

	/**
	 * Create the application.
	 */
	public testNoResultsFound() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setSize(1008,527);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JPanel resultNotFoundPanel = new JPanel();
		resultNotFoundPanel.setBackground(Color.WHITE);
		resultNotFoundPanel.setBounds(0, 0, 992, 488);
		getContentPane().add(resultNotFoundPanel);
		resultNotFoundPanel.setLayout(null);
		
		JLabel noResultsIconLabel = new JLabel("");
		noResultsIconLabel.setIcon(loadImage("Images/noResultsIcon.png", 200,200));
		noResultsIconLabel.setBounds(396, 54, 200, 200);
		resultNotFoundPanel.add(noResultsIconLabel);
		
		JLabel noResultsLabel = new JLabel("No results found");
		noResultsLabel.setFont(new Font("Source Sans Pro Black", Font.PLAIN, 25));
		noResultsLabel.setBounds(396, 285, 200, 34);
		resultNotFoundPanel.add(noResultsLabel);
		
		JLabel noResultsDescLabel = new JLabel("Sorry, that filter combination has no results.");
		noResultsDescLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		noResultsDescLabel.setBounds(296, 334, 400, 25);
		resultNotFoundPanel.add(noResultsDescLabel);
		
		JLabel noResultsDescLabel2 = new JLabel("Please try different criteria");
		noResultsDescLabel2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		noResultsDescLabel2.setBounds(375, 370, 242, 25);
		resultNotFoundPanel.add(noResultsDescLabel2);
		
		this.setVisible(true);
	}
	
	private ImageIcon loadImage(String path, int x, int y){
        Image image = new ImageIcon(this.getClass().getResource(path)).getImage();
        Image scaledImage = image.getScaledInstance(x, y, java.awt.Image.SCALE_SMOOTH);
        return new ImageIcon(scaledImage);
	}

}
