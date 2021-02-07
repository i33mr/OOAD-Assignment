import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JPanel;
// import com.jgoodies.forms.layout.FormLayout;
// import com.jgoodies.forms.layout.ColumnSpec;
// import com.jgoodies.forms.layout.RowSpec;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JScrollPane;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.Vector;

import javax.swing.JList;
import javax.swing.AbstractListModel;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.LineBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;

public class testDropDownMenuHome extends JFrame{
	private JPanel slideMenu;
	private JLabel menuIcon;
	private JLabel closeMenu;
	private JScrollPane mainScrollPane;
	private JPanel header;
	private JComboBox<String> propertTypeComboBox;
	private JLabel minPriceLabel;
	private JLabel maxPriceLabel;
	private JComboBox<String> minPriceComboBox;
	private JComboBox<String> maxPriceComboBox;
	private JLabel maxSizeLabel;
	private JLabel minSizeLabel;
	private JComboBox<String> minSizeCombobox;
	private JComboBox<String> maxSizeCombobox;
	private JComboBox<String> projectsCombobox;
	private JComboBox<String> furnishingCombobox;
	private JLabel maxBedLabel;
	private JLabel minBedLabel;
	private JComboBox<String> minBedCombobox;
	private JComboBox<String> maxBedCombobox;
	private JButton searchButton;
	private JButton resetButton;
	private JPanel panelInsideScrollPane;
	private JLabel logoIcon;
	private ArrayList<JButton> propertiesViewDetailsButtons = new ArrayList<>();
	private ArrayList<Property> propertyList = new ArrayList<>();
	private JLabel logOutLabel;
	private JButton moreFiltersButton;
	private JPanel moreFiltersPanel;
	private JComboBox<String> furnishingCombobox_1;
	private JLabel minBedLabel_1;
	private JLabel maxBedLabel_1;
	private JComboBox<String> maxBedCombobox_1;
	private JComboBox<String> minBedCombobox_1;
	private JLabel facilitiesCheckBoxLabel;
	private JCheckBox gymCheckbox;
	private JCheckBox playgroundCheckbox;
	private JCheckBox poolCheckbox;
	private JLabel featuresChaeckBoxLabel;
	private JCheckBox sportCheckbox;
	private JCheckBox conditionerCheckbox;
	private JCheckBox gardenCheckbox;
	private JCheckBox garageCheckbox;
	private JCheckBox kitchenCheckbox;
//	private propertyViewDetailsButton
		
	public static void main(String[] args) {
		try {
			new testDropDownMenuHome(ProjectManagerDriver.readPropertiesFromFiles());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public testDropDownMenuHome() {
		initializeHeader();
		initializeSideMenu();
		initialize();
//		setPropertiesPanels();
	}
	
	public testDropDownMenuHome(ArrayList<Property> propertyList) {
		this.propertyList = propertyList; 
		initializeHeader();
		initializeSideMenu();
		initialize();
		setPropertiesPanels();
	}
	
	public void setNewProperties(ArrayList<Property> propertyList) {
		this.propertyList = propertyList;
//		initialize();
//		panelInsideScrollPane = new JPanel();
		setPropertiesPanels();
	}
	
	private void initializeHeader() {
		header = new JPanel();
		header.setBackground(new Color(29, 27, 27));
		header.setBounds(0, 0, 1008, 134);
		header.setLayout(null);
		getContentPane().add(header);
        
        
        menuIcon = new JLabel();
        menuIcon.setBounds(10, 98, 25, 25);
        menuIcon.setIcon(loadImage("Images/menu.png", 25, 25));
        header.add(menuIcon);
        
        
        propertTypeComboBox = new JComboBox();
        propertTypeComboBox.setBounds(50, 23, 166, 22);
        propertTypeComboBox.setModel(new DefaultComboBoxModel(new String[] {"All Resedential", "Apartment", "Flat", "Condominium", "Serviced Residence", "Link House", "Cluster House", "Bungalow", "Semi Detached House", "Villa", "Residential Land"}));
		propertTypeComboBox.setBackground(new Color(236, 77, 55));
		header.add(propertTypeComboBox);
		
		
		minPriceLabel = new JLabel("Min. Price");
		minPriceLabel.setForeground(UIManager.getColor("Button.background"));
		minPriceLabel.setHorizontalAlignment(SwingConstants.CENTER);
		minPriceLabel.setBounds(50, 56, 78, 14);
		header.add(minPriceLabel);
		
		maxPriceLabel  = new JLabel("Max. Price");
		maxPriceLabel.setForeground(UIManager.getColor("Button.background"));
		maxPriceLabel.setHorizontalAlignment(SwingConstants.CENTER);
		maxPriceLabel.setBounds(137, 56, 79, 14);
		header.add(maxPriceLabel);
		
		
		
		minPriceComboBox = new JComboBox();
		minPriceComboBox.setModel(new DefaultComboBoxModel(new String[] {"200", "400", "600", "800", "1000", "1500", "2000", "3000", "4000", "5000", "6000", "8000", "10000", "20000", "30000", "40000", "50000"}));
		
		minPriceComboBox.setBounds(50, 81, 78, 22);
		minPriceComboBox.setBackground(new Color(236, 77, 55));
		header.add(minPriceComboBox);
		
		
		
		maxPriceComboBox = new JComboBox();
		maxPriceComboBox.setModel(new DefaultComboBoxModel(new String[] {"200", "400", "600", "800", "1000", "1500", "2000", "3000", "4000", "5000", "6000", "8000", "10000", "20000", "30000", "40000", "50000"}));
		maxPriceComboBox.setSelectedIndex(maxPriceComboBox.getModel().getSize()-1);
		maxPriceComboBox.setBounds(138, 81, 78, 22);
		maxPriceComboBox.setBackground(new Color(236, 77, 55));
		header.add(maxPriceComboBox);
		
		
		
		maxSizeLabel = new JLabel("Max. Size sq. ft.");
		maxSizeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		maxSizeLabel.setForeground(SystemColor.menu);
		maxSizeLabel.setBounds(351, 56, 100, 14);
		header.add(maxSizeLabel);
		
		minSizeLabel = new JLabel("Min. Size sq. ft.");
		minSizeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		minSizeLabel.setForeground(SystemColor.menu);
		minSizeLabel.setBounds(250, 56, 100, 14);
		header.add(minSizeLabel);
		
		minSizeCombobox = new JComboBox();
		minSizeCombobox.setModel(new DefaultComboBoxModel(new String[] {"0", "250", "500", "750", "1000", "1250", "1500", "2000", "2500", "3000", "4000", "5000", "6000", "8000", "10000", "20000", "50000", "100000"}));
		minSizeCombobox.setBounds(260, 81, 78, 22);
		minSizeCombobox.setBackground(new Color(236, 77, 55));
		header.add(minSizeCombobox);
		
		maxSizeCombobox = new JComboBox();
		maxSizeCombobox.setModel(new DefaultComboBoxModel(new String[] {"0", "250", "500", "750", "1000", "1250", "1500", "2000", "2500", "3000", "4000", "5000", "6000", "8000", "10000", "20000", "50000", "100000"}));
		maxSizeCombobox.setBounds(361, 81, 78, 22);
		maxSizeCombobox.setSelectedIndex(maxSizeCombobox.getModel().getSize()-1);
		maxSizeCombobox.setBackground(new Color(236, 77, 55));
		header.add(maxSizeCombobox);
		
		projectsCombobox = new JComboBox();
		projectsCombobox.setModel(new DefaultComboBoxModel(new String[] {"All Projects"}));
		projectsCombobox.setBounds(250, 23, 200, 22);
		projectsCombobox.setBackground(new Color(236, 77, 55));
		header.add(projectsCombobox);
		
		furnishingCombobox = new JComboBox();
		furnishingCombobox.setModel(new DefaultComboBoxModel(new String[] {"All Furnishing", "Fully Furnished", "Partially Furnished", "Unfurnished"}));
		furnishingCombobox.setBounds(482, 23, 200, 22);
		furnishingCombobox.setBackground(new Color(236, 77, 55));
		header.add(furnishingCombobox);
		
		maxBedLabel = new JLabel("Max. Bedrooms");
		maxBedLabel.setHorizontalAlignment(SwingConstants.CENTER);
		maxBedLabel.setForeground(SystemColor.menu);
		maxBedLabel.setBounds(582, 56, 100, 14);
		header.add(maxBedLabel);
		
		minBedLabel = new JLabel("Min. Bedrooms");
		minBedLabel.setHorizontalAlignment(SwingConstants.CENTER);
		minBedLabel.setForeground(SystemColor.menu);
		minBedLabel.setBounds(482, 56, 100, 14);
		header.add(minBedLabel);
		
		minBedCombobox = new JComboBox();
		minBedCombobox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		minBedCombobox.setBounds(492, 81, 78, 22);
		minBedCombobox.setBackground(new Color(236, 77, 55));
		header.add(minBedCombobox);
		
		maxBedCombobox = new JComboBox();
		maxBedCombobox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		maxBedCombobox.setSelectedIndex(maxBedCombobox.getModel().getSize()-1);
		maxBedCombobox .setBounds(592, 81, 78, 22);
		maxBedCombobox.setBackground(new Color(236, 77, 55));
		header.add(maxBedCombobox);
		
		searchButton = new JButton("Search");
		searchButton.setBounds(698, 11, 120, 47);
		header.add(searchButton);
		
		resetButton = new JButton("Reset");
		resetButton.setBounds(698, 69, 120, 23);
		header.add(resetButton);
		
		logoIcon = new JLabel();
        logoIcon.setBounds(868, 0, 118, 134);
        logoIcon.setIcon(loadImage("Images/propertyIcon3.png", 118, 134));
		header.add(logoIcon);
		
		moreFiltersButton = new JButton("More Filters");
		moreFiltersButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		moreFiltersButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(moreFiltersButton.getText().equals("More Filters")) {
					mainScrollPane.setLocation(0, 268);
					mainScrollPane.setSize(1008, 393);
					moreFiltersButton.setText("Less Filters");
					menuIcon.setEnabled(false);
				}
				else {
					mainScrollPane.setLocation(0, 134);
					mainScrollPane.setSize(1008, 527);
					moreFiltersButton.setText("More Filters");
					menuIcon.setEnabled(true);
				}
			}
		});
		moreFiltersButton.setBounds(698, 103, 120, 23);
		header.add(moreFiltersButton);
	}
	
	private void initializeSideMenu() {
		slideMenu = new JPanel();
		slideMenu.setBackground(new Color(236, 77, 55));
		slideMenu.setBounds(0, 134, 242, 527);
		slideMenu.setLayout(null);
		slideMenu.setVisible(false);
		
		closeMenu = new JLabel();
		closeMenu.setBounds(207, 11, 25, 25);
		closeMenu.setIcon(loadImage("close.png",25,25));
		closeMenu.setVisible(false);
		slideMenu.add(closeMenu);
		
		getContentPane().add(slideMenu);
		
		logOutLabel = new JLabel("Log Out");
		
		logOutLabel.setForeground(Color.WHITE);
		logOutLabel.setFont(new Font("Source Serif Pro", Font.PLAIN, 25));
		logOutLabel.setHorizontalAlignment(SwingConstants.CENTER);
		logOutLabel.setBounds(46, 420, 150, 30);
		slideMenu.add(logOutLabel);
	}

	public void setPropertiesPanels() {
		panelInsideScrollPane.removeAll();
		propertiesViewDetailsButtons.clear();
		for(int i = 0; i < propertyList.size(); i++){
			JPanel panel = new JPanel();
			getContentPane().add(panel);
			panel.setBackground(Color.WHITE);
			panel.setPreferredSize(new Dimension(800,400));
			panel.setLayout(null);
			
			JLabel priceHolder = new JLabel("Price");
			priceHolder.setFont(new Font("Source Serif Pro Black", Font.BOLD, 23));
			priceHolder.setBounds(430, 11, 160, 24);
			panel.add(priceHolder);
			
			JLabel priceLabel = new JLabel("RM " + Double.toString(propertyList.get(i).getPrice()));
			priceLabel.setFont(new Font("Source Serif Pro Black", Font.BOLD, 23));
			priceLabel.setBounds(590, 11, 160, 24);
			panel.add(priceLabel);
			
			JLabel propertyTitleLabel = new JLabel();
			propertyTitleLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
			propertyTitleLabel.setBounds(430, 46, 320, 21);
			panel.add(propertyTitleLabel);
			if(propertyList.get(i).getPropertyAddress().getProject().equals(null))
				propertyTitleLabel.setText(propertyList.get(i).getTitileName());
			else
				propertyTitleLabel.setText(propertyList.get(i).getPropertyAddress().getProject());
			
			JLabel propertyTypeLabel = new JLabel(propertyList.get(i).getPropertyType());
			propertyTypeLabel.setBounds(430, 76, 300, 24);
			panel.add(propertyTypeLabel);
			
			JLabel rentRateLabel = new JLabel("RM " + Double.toString(propertyList.get(i).getRentalRate()) + " per sq. ft.");
			rentRateLabel.setBounds(580, 76, 300, 24);
			panel.add(rentRateLabel);
			
			JLabel propertySizeLabel = new JLabel("Size: " + Double.toString(propertyList.get(i).getSize()) + " sq. ft.");
			propertySizeLabel.setBounds(430, 102, 150, 24);
			panel.add(propertySizeLabel);
			
			JLabel propertyFurnishLabel = new JLabel(propertyList.get(i).getFurnishing());
			propertyFurnishLabel.setBounds(580, 102, 150, 24);
			panel.add(propertyFurnishLabel);
			
			JLabel bedIconLabel = new JLabel();
			bedIconLabel.setIcon(loadImage("Images/bed.png", 50, 50));
			bedIconLabel.setBounds(430, 148, 50, 50);
			panel.add(bedIconLabel);
			
			JLabel bedNumLabel = new JLabel(Integer.toString(propertyList.get(i).getBedRoomsNum()));
			bedNumLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
			bedNumLabel.setBounds(500, 148, 50, 50);
			panel.add(bedNumLabel);
			
			JLabel bathIconLabel = new JLabel();
			bathIconLabel.setIcon(loadImage("Images/bath.png", 50, 50));
			bathIconLabel.setBounds(600, 148, 50, 50);
			panel.add(bathIconLabel);
			
			JLabel bathNumLabel = new JLabel(Integer.toString(propertyList.get(i).getBathRoomsNum()));
			bathNumLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
			bathNumLabel.setBounds(670, 148, 50, 50);
			panel.add(bathNumLabel);
			
			JButton propertyViewDetailsButton = new JButton("View Details");
			propertyViewDetailsButton.setBounds(565, 329, 165, 40);
			panel.add(propertyViewDetailsButton);
			propertiesViewDetailsButtons.add(propertyViewDetailsButton);
//			propertyViewDetailsButton.addMouseListener(new MouseAdapter() {
//				public void mouseClicked(MouseEvent e) {
////    				setContentPane(new SpecificPropertyView());
////    				new SpecificPropertyView();
////					JFrame parent = (JFrame) getThisJPanel().getParent().getParent().getParent(); // Getting the JFrame class 
////					parent.setContentPane(new SpecificPropertyView()); // setting the JPanel for the JFrame to the desired JPanel
//				}
//			});
			
			JLabel propertyPicLabel = new JLabel("");
			propertyPicLabel.setBounds(0, 0, 400, 400);
			panel.add(propertyPicLabel);
			propertyPicLabel.setIcon(loadImage(propertyList.get(i).getPropertyPicturePath()[0], 400, 400));
		//        	JPanel property = new JPanel();
		//        	property.add(new JButton());
		//    		panel.setBackground(Color.WHITE);
		//    		panel.setPreferredSize(new Dimension(800,400));
			panelInsideScrollPane.setPreferredSize(new Dimension(800,400 * (i+1)));
			panelInsideScrollPane.add(panel);
		}
	}
	private void initialize() {
		getContentPane().setLayout(null);
		
		closeMenu.addMouseListener(new MouseAdapter(){
		    @Override
		    public void mouseClicked(MouseEvent e){
				slideMenu.setVisible(false);
				closeMenu.setVisible(false);
				menuIcon.setVisible(true);
				mainScrollPane.setLocation(0, 134);
				mainScrollPane.setSize(1008, 527);
				setPanelEnabled((JPanel)getContentPane(),true);
//				setPanelEnabled((JPanel)getThisJPanel(),true);				
			}			
		});
		
				
        menuIcon.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
            	if(moreFiltersButton.getText().equals("More Filters")) {
            		slideMenu.setVisible(true);
    				closeMenu.setVisible(true);
    				menuIcon.setVisible(false);
    				mainScrollPane.setLocation(242, 134);
    				mainScrollPane.setSize(766, 527);
//    		    	header.setLocation(242, 0);
//    		    	header.setSize(766, 134);
    				setPanelEnabled((JPanel)getContentPane(),false);
//    		    	setPanelEnabled((JPanel)getThisJPanel(),false);
//    					mainPanel.
    				// TODO Auto-generated method stub
            	}				
			}			
		});
		
        
        
		panelInsideScrollPane = new JPanel();
		panelInsideScrollPane.setPreferredSize(new Dimension(800,400));
//		propertyList = new ArrayList<>();
////        for(int i = 0; i < 10; i++){
//        	File propertyPics = new File("src/propertyImages/");
////    		File[] propertyPictureFiles = propertyPics.listFiles();
//    		String[] propertyPicturePath = propertyPics.list();
//    		for(int j = 0; j < propertyPicturePath.length; ++j) {
//    			StringBuilder path = new StringBuilder("propertyImages/");
//    			propertyPicturePath[j] = path + propertyPicturePath[j];
//    		}
//    		
//    		for(int j = 0; j < 3; ++j) {
//    			propertyList.add(new Property(1, new Address("Solstice", "Cyberjaya Selengor 62000"), 850, 10000,propertyPicturePath, 3,5, "condo"));
//    		}
    		
    		
//    		JPanel panel = new JPanel();
//    		panel.setBounds(84, 92, 800, 400);
//    		getContentPane().add(panel);
//    		add(panel);
//    		panel.setBackground(Color.WHITE);
//    		panel.setPreferredSize(new Dimension(800,400));
//    		panel.setLayout(null);
//    		
//    		JLabel priceLabel = new JLabel("Price");
//    		priceLabel.setFont(new Font("Source Serif Pro Black", Font.BOLD, 23));
//    		priceLabel.setBounds(430, 11, 320, 24);
//    		panel.add(priceLabel);
//    		
//    		JLabel propertyTitleLabel = new JLabel("Property / project name");
//    		propertyTitleLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
//    		propertyTitleLabel.setBounds(430, 46, 320, 21);
//    		panel.add(propertyTitleLabel);
//    		
//    		JLabel propertyTypeLabel = new JLabel("Type");
//    		propertyTypeLabel.setBounds(430, 76, 300, 24);
//    		panel.add(propertyTypeLabel);
//    		
//    		JLabel PropertySizeLabel = new JLabel("Size");
//    		PropertySizeLabel.setBounds(430, 102, 150, 24);
//    		panel.add(PropertySizeLabel);
//    		
//    		JLabel PropertyFurnishLabel = new JLabel("furnishing");
//    		PropertyFurnishLabel.setBounds(580, 102, 150, 24);
//    		panel.add(PropertyFurnishLabel);
//    		
//    		JLabel bedIconLabel = new JLabel("bed icon");
//    		bedIconLabel.setBounds(430, 148, 46, 14);
//    		panel.add(bedIconLabel);
//    		
//    		JLabel bedNumLabel = new JLabel("bednum");
//    		bedNumLabel.setBounds(488, 148, 46, 14);
//    		panel.add(bedNumLabel);
//    		
//    		JLabel bathIconLabel = new JLabel("bath icon");
//    		bathIconLabel.setBounds(554, 148, 46, 14);
//    		panel.add(bathIconLabel);
//    		
//    		JLabel bathNumLabel = new JLabel("bathnum");
//    		bathNumLabel.setBounds(612, 148, 46, 14);
//    		panel.add(bathNumLabel);
//    		
//    		JButton btnNewButton_2 = new JButton("View Details");
//    		btnNewButton_2.setBounds(565, 329, 165, 40);
//    		panel.add(btnNewButton_2);
//    		btnNewButton_2.addMouseListener(new MouseAdapter() {
//    			public void mouseClicked(MouseEvent e) {
////    				setContentPane(new SpecificPropertyView());
////    				new SpecificPropertyView();
//    				JFrame parent = (JFrame) getThisJPanel().getParent().getParent().getParent(); // Getting the JFrame class 
//    				parent.setContentPane(new SpecificPropertyView()); // setting the JPanel for the JFrame to the desired JPanel
//    			}
//    		});
//    		
//    		JLabel propertyPicLabel = new JLabel("");
//    		propertyPicLabel.setBounds(0, 0, 400, 400);
//    		panel.add(propertyPicLabel);
//    		propertyPicLabel.setIcon(loadImage(property.getPropertyPicturePath()[1], 400, 400));
////        	JPanel property = new JPanel();
////        	property.add(new JButton());
////    		panel.setBackground(Color.WHITE);
////    		panel.setPreferredSize(new Dimension(800,400));
//    		panelInsideScrollPane.setPreferredSize(new Dimension(800,450 * i));
//    		panelInsideScrollPane.add(panel);
//        }
//        setPropertiesPanels();
        
        mainScrollPane = new JScrollPane(panelInsideScrollPane,
                 JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                 JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        mainScrollPane.getVerticalScrollBar().setUnitIncrement(16);
        if(!slideMenu.isVisible()) {
        	mainScrollPane.setLocation(0, 134);
        	mainScrollPane.setSize(1008, 527);
        }
        	
        	
        mainScrollPane.setPreferredSize(new Dimension(800,400));
        getContentPane().add(mainScrollPane);
        
        moreFiltersPanel = new JPanel();
        moreFiltersPanel.setBackground(new Color(29, 27, 27));
        moreFiltersPanel.setBounds(0, 134, 1008, 134);
        getContentPane().add(moreFiltersPanel);
        moreFiltersPanel.setLayout(null);
        
        furnishingCombobox_1 = new JComboBox();
        furnishingCombobox_1.setBackground(new Color(236, 77, 55));
        furnishingCombobox_1.setBounds(50, 23, 200, 22);
        moreFiltersPanel.add(furnishingCombobox_1);
        
        minBedLabel_1 = new JLabel("Min Rental Rate");
        minBedLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        minBedLabel_1.setForeground(SystemColor.menu);
        minBedLabel_1.setBounds(41, 56, 100, 14);
        moreFiltersPanel.add(minBedLabel_1);
        
        maxBedLabel_1 = new JLabel("Max Rental Rate");
        maxBedLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        maxBedLabel_1.setForeground(SystemColor.menu);
        maxBedLabel_1.setBounds(163, 56, 100, 14);
        moreFiltersPanel.add(maxBedLabel_1);
        
        maxBedCombobox_1 = new JComboBox();
        maxBedCombobox_1.setBackground(new Color(236, 77, 55));
        maxBedCombobox_1.setBounds(172, 81, 78, 22);
        moreFiltersPanel.add(maxBedCombobox_1);
        
        minBedCombobox_1 = new JComboBox();
        minBedCombobox_1.setBackground(new Color(236, 77, 55));
        minBedCombobox_1.setBounds(50, 82, 78, 22);
        moreFiltersPanel.add(minBedCombobox_1);
        
        facilitiesCheckBoxLabel = new JLabel("Facilities: ");
        facilitiesCheckBoxLabel.setFont(new Font("Source Serif Pro Black", Font.PLAIN, 22));
        facilitiesCheckBoxLabel.setForeground(Color.WHITE);
        facilitiesCheckBoxLabel.setBounds(269, 15, 200, 22);
        moreFiltersPanel.add(facilitiesCheckBoxLabel);
        
        JCheckBox securityCheckbox = new JCheckBox("24-Hour Security");
        securityCheckbox.setForeground(Color.WHITE);
        securityCheckbox.setBackground(new Color(29, 27, 27));
        securityCheckbox.setBounds(269, 44, 129, 23);
        moreFiltersPanel.add(securityCheckbox);
        
        JCheckBox parkingCheckbox = new JCheckBox("Parking");
        parkingCheckbox.setForeground(Color.WHITE);
        parkingCheckbox.setBackground(new Color(29, 27, 27));
        parkingCheckbox.setBounds(269, 74, 129, 23);
        moreFiltersPanel.add(parkingCheckbox);
        
        JCheckBox supermarketCheckbox = new JCheckBox("Supermarket");
        supermarketCheckbox.setForeground(Color.WHITE);
        supermarketCheckbox.setBackground(new Color(29, 27, 27));
        supermarketCheckbox.setBounds(269, 104, 129, 23);
        moreFiltersPanel.add(supermarketCheckbox);
        
        gymCheckbox = new JCheckBox("Gym");
        gymCheckbox.setForeground(Color.WHITE);
        gymCheckbox.setBackground(new Color(29, 27, 27));
        gymCheckbox.setBounds(406, 44, 129, 23);
        moreFiltersPanel.add(gymCheckbox);
        
        playgroundCheckbox = new JCheckBox("Playground");
        playgroundCheckbox.setForeground(Color.WHITE);
        playgroundCheckbox.setBackground(new Color(29, 27, 27));
        playgroundCheckbox.setBounds(406, 74, 129, 23);
        moreFiltersPanel.add(playgroundCheckbox);
        
        poolCheckbox = new JCheckBox("Swimming Pool");
        poolCheckbox.setForeground(Color.WHITE);
        poolCheckbox.setBackground(new Color(29, 27, 27));
        poolCheckbox.setBounds(406, 104, 129, 23);
        moreFiltersPanel.add(poolCheckbox);
        
        featuresChaeckBoxLabel = new JLabel("Features:");
        featuresChaeckBoxLabel.setForeground(Color.WHITE);
        featuresChaeckBoxLabel.setFont(new Font("Source Serif Pro Black", Font.PLAIN, 22));
        featuresChaeckBoxLabel.setBounds(704, 15, 200, 22);
        moreFiltersPanel.add(featuresChaeckBoxLabel);
        
        sportCheckbox = new JCheckBox("Sport Court");
        sportCheckbox.setForeground(Color.WHITE);
        sportCheckbox.setBackground(new Color(29, 27, 27));
        sportCheckbox.setBounds(543, 44, 129, 23);
        moreFiltersPanel.add(sportCheckbox);
        
        conditionerCheckbox = new JCheckBox("Air Conditioner");
        conditionerCheckbox.setForeground(Color.WHITE);
        conditionerCheckbox.setBackground(new Color(29, 27, 27));
        conditionerCheckbox.setBounds(704, 44, 129, 23);
        moreFiltersPanel.add(conditionerCheckbox);
        
        gardenCheckbox = new JCheckBox("Garden");
        gardenCheckbox.setForeground(Color.WHITE);
        gardenCheckbox.setBackground(new Color(29, 27, 27));
        gardenCheckbox.setBounds(841, 44, 129, 23);
        moreFiltersPanel.add(gardenCheckbox);
        
        garageCheckbox = new JCheckBox("Garage");
        garageCheckbox.setForeground(Color.WHITE);
        garageCheckbox.setBackground(new Color(29, 27, 27));
        garageCheckbox.setBounds(704, 104, 129, 23);
        moreFiltersPanel.add(garageCheckbox);
        
        kitchenCheckbox = new JCheckBox("Kitchen Cabinet");
        kitchenCheckbox.setForeground(Color.WHITE);
        kitchenCheckbox.setBackground(new Color(29, 27, 27));
        kitchenCheckbox.setBounds(704, 74, 129, 23);
        moreFiltersPanel.add(kitchenCheckbox);
       
       
		this.setSize(1024,700);
		this.setVisible(true); 
	}
	private ImageIcon loadImage(String path, int x, int y){
        Image image = new ImageIcon(this.getClass().getResource(path)).getImage();
        Image scaledImage = image.getScaledInstance(x, y, java.awt.Image.SCALE_SMOOTH);
        return new ImageIcon(scaledImage);
	} 
	private void setPanelEnabled(JComponent panel, boolean isEnabled) { // gray out main panel when side bar is open
		 panel.setEnabled(isEnabled);
		 Component[] components = panel.getComponents();

		    for(int i = 0; i < components.length; i++) {
		        if((components[i].getClass().getName() == "javax.swing.JPanel" || components[i].getClass().getName() == "javax.swing.JScrollPane") && (!components[i].equals(slideMenu))) {
		            setPanelEnabled((JComponent)components[i], isEnabled);
				}
				else if(components[i].getClass().getName() == "javax.swing.JViewport"){
					setPanelEnabled((JComponent)components[i], isEnabled);
				}
		        
		        if(components[i].getClass().getName() != "")
		        components[i].setEnabled(isEnabled);
		    }
		 
	 }
	public ArrayList<JButton> getPropertiesViewDetailsButtons() {
		return propertiesViewDetailsButtons;
	}
	
	public JButton getSearchButton() {
		return searchButton;
	}
	
//	private JPanel getThisJPanel() {
//		return this;
//	}
	
	public JComboBox<String> getPropertTypeComboBox(){
		return propertTypeComboBox;
	}
	
	public JComboBox<String> getMinPriceComboBox(){
		return minPriceComboBox;
	}
	
	public JComboBox<String> getMaxPriceComboBox(){
		return maxPriceComboBox;
	}
	
	public JComboBox<String> getMinSizeComboBox(){
		return minSizeCombobox;
	}
	
	public JComboBox<String> getMaxSizeComboBox(){
		return maxSizeCombobox;
	}
	
	public JComboBox<String> getFurnishingCombobox(){
		return furnishingCombobox;
	}
	
	public JComboBox<String> getMinBedCombobox(){
		return minBedCombobox;
	}
	
	public JComboBox<String> getMaxBedCombobox(){
		return maxBedCombobox;
	}
	
	public JComboBox<String> getProjectsCombobox(){
		return projectsCombobox;
	}
	
	public void setPropertyList(ArrayList<Property> propertyList) {
		this.propertyList = propertyList;
		setPropertiesPanels();
	}
	
	public JButton getResetButton() {
		return resetButton;
	}
	
	public JLabel getlogOutLabel() {
		return logOutLabel;
	}
	
	public JLabel getCloseMenu() {
		return closeMenu;
	}
}
