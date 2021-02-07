import java.awt.EventQueue;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JSplitPane;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Component;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

public class SideBarView extends JFrame{

	private JPanel slideMenu;
	private JLabel menuIcon;
	private JLabel closeMenu;
	private JPanel mainPanel;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	
	public SideBarView() {
		initialize();
	}
	
	public static void main(String[] args) {
		new SideBarView();
	}
	
	
	private void initialize() {

		this.getContentPane().setBackground(Color.WHITE);
		this.setBounds(100, 100, 908, 557);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(null);
		
		slideMenu = new JPanel();
		slideMenu.setBackground(Color.BLUE);
		slideMenu.setBounds(0, 0, 277, 518);
		slideMenu.setLayout(null);
		slideMenu.setVisible(false);
		getContentPane().add(slideMenu);
		
		btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(83, 173, 89, 23);
		slideMenu.add(btnNewButton_1);
		
		menuIcon = new JLabel();
		menuIcon.setBounds(10, 11, 25, 25);
		menuIcon.setIcon(loadImage("menu.png"));
		this.getContentPane().add(menuIcon);
		menuIcon.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
				slideMenu.setVisible(true);
				closeMenu.setVisible(true);
				setPanelEnabled(mainPanel,false);
//				mainPanel.
				// TODO Auto-generated method stub
				
			}			
		});
		
		
		closeMenu = new JLabel();
		closeMenu.setBounds(280, 11, 25, 25);
		closeMenu.setIcon(loadImage("close.png"));
		closeMenu.setVisible(false);
		this.getContentPane().add(closeMenu);		
		
		mainPanel= new JPanel();
		mainPanel.setBackground(Color.WHITE);
		mainPanel.setBounds(280, 0, 619, 518);
		getContentPane().add(mainPanel);
		mainPanel.setLayout(null);
		
		btnNewButton = new JButton("New button");
		btnNewButton.setBounds(238, 202, 89, 23);
		mainPanel.add(btnNewButton);
		closeMenu.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
				slideMenu.setVisible(false);
				closeMenu.setVisible(false);
				setPanelEnabled(mainPanel,true);
				// TODO Auto-generated method stub
				
			}			
		});
		
		this.setVisible(true);
	}
	
	 private ImageIcon loadImage(String path){
	        Image image = new ImageIcon(this.getClass().getResource(path)).getImage();
	        Image scaledImage = image.getScaledInstance(25, 25, java.awt.Image.SCALE_SMOOTH);
	        return new ImageIcon(scaledImage);
	 } 
	 
	 
	 private void setPanelEnabled(JPanel panel, boolean isEnabled) { // gray out main panel when side bar is open
		 panel.setEnabled(isEnabled);
		 Component[] components = panel.getComponents();

		    for(int i = 0; i < components.length; i++) {
		        if(components[i].getClass().getName() == "javax.swing.JPanel") {
		            setPanelEnabled((JPanel) components[i], isEnabled);
		        }

		        components[i].setEnabled(isEnabled);
		    }
		 
	 }
}
