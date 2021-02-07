import java.awt.EventQueue;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JSplitPane;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import javax.swing.JSeparator;

public class layredPanelTest extends JFrame{

	private JPanel slideMenu;
	private JLabel menuIcon;
	private JLabel closeMenu;
	private JPanel mainPanel;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	int currentPicIndex = 0;
	
	public layredPanelTest() {
		getContentPane().setLayout(null);
		
		
		initialize();
	}
	
	public static void main(String[] args) {
		new layredPanelTest();
	}
	
	
	private void initialize() {
		File propertyPics = new File("src/propertyImages/");
		File[] propertyPictureFiles = propertyPics.listFiles();
		String[] propertyPicturePath = propertyPics.list();
		for(int i = 0; i < propertyPicturePath.length; ++i) {
			StringBuilder path = new StringBuilder("propertyImages/");
			propertyPicturePath[i] = path + propertyPicturePath[i];
		}
		// Property property = new Property("Mutiara Ville", 850, propertyPicturePath, 3, 5, "condo");
		
		JPanel panel = new JPanel();
		panel.setBounds(84, 92, 800, 400);
		getContentPane().add(panel);
		panel.setBackground(Color.WHITE);
		panel.setPreferredSize(new Dimension(800,400));
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(0, 0, 800, 238);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel leftArrow = new JLabel("");
		leftArrow.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		leftArrow.setIcon(loadImage("Images/leftArrow.png",30,50));
		leftArrow.setBounds(0, 112, 50, 50);
		panel_1.add(leftArrow);
		
		JLabel rightArrow = new JLabel("");
		rightArrow.setIcon(loadImage("Images/rightArrow.png",30,50));
		rightArrow.setBounds(750, 112, 50, 50);
		panel_1.add(rightArrow);
		
		JLabel shownPictureLabel = new JLabel("");
		shownPictureLabel.setBounds(200, 0, 400, 238);
		// shownPictureLabel.setIcon(loadImage(property.getPropertyPicturePath()[0],400,238));
		panel_1.add(shownPictureLabel);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBounds(0, 236, 800, 2);
		panel_1.add(separator);
		
		JLabel lblNewLabel_3 = new JLabel("Price");
		lblNewLabel_3.setFont(new Font("Source Serif Pro Black", Font.BOLD, 23));
		lblNewLabel_3.setBounds(10, 249, 320, 24);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Property / project name");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_4.setBounds(10, 284, 320, 21);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Type");
		lblNewLabel_5.setBounds(10, 334, 167, 24);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_1 = new JLabel("Size");
		lblNewLabel_5_1.setBounds(187, 334, 167, 24);
		panel.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_5_1_1 = new JLabel("furnishing");
		lblNewLabel_5_1_1.setBounds(356, 334, 167, 24);
		panel.add(lblNewLabel_5_1_1);
		
		JLabel lblNewLabel_6 = new JLabel("bed icon");
		lblNewLabel_6.setBounds(20, 375, 46, 14);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_6_1 = new JLabel("bednum");
		lblNewLabel_6_1.setBounds(78, 375, 46, 14);
		panel.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_6_2 = new JLabel("bath icon");
		lblNewLabel_6_2.setBounds(144, 375, 46, 14);
		panel.add(lblNewLabel_6_2);
		
		JLabel lblNewLabel_6_1_1 = new JLabel("bathnum");
		lblNewLabel_6_1_1.setBounds(202, 375, 46, 14);
		panel.add(lblNewLabel_6_1_1);
		this.setVisible(true);
		this.setSize(1024,700);
		
		
		rightArrow.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(rightArrow.isEnabled())
					// shownPictureLabel.setIcon(loadImage(property.getPropertyPicturePath()[++currentPicIndex],400,238));
				// if(currentPicIndex == property.getPropertyPicturePath().length -1)
					rightArrow.setEnabled(false);
			}
		});
	 }
	private ImageIcon loadImage(String path, int x, int y){
        Image image = new ImageIcon(this.getClass().getResource(path)).getImage();
        Image scaledImage = image.getScaledInstance(x, y, java.awt.Image.SCALE_SMOOTH);
        return new ImageIcon(scaledImage);
	} 
}
