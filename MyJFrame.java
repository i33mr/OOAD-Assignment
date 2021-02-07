import java.awt.Container;
import java.awt.EventQueue;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

public class MyJFrame extends JFrame{
//		private static MyJFrame myJFrame = new MyJFrame();
		private PropertyManagerHomePage homePage = new PropertyManagerHomePage();
		private SpecificPropertyView currentProperty;
		private LoginPage loginPage = new LoginPage();
		private SignupPage signupPage = new SignupPage();
		private RentRequestsPage requestsPage = new RentRequestsPage();
		private NewPropertyPage newPropertyPage = new NewPropertyPage();
		private ManagePropertiesPage managePropertiesPage = new ManagePropertiesPage();
		private SpecificManagerPropertyView SpecificManagerPropertyView;
		private EditPage editPage = new EditPage();

		
	public MyJFrame() {
//		homePage = new propertyManagerHomePage();
//		setContentPane(homePage);
		this.setSize(1024,700);
		this.setVisible(true);
		this.setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	}

//	public MyJFrame(ArrayList<Property> propertyList) {
//		// homePage = new propertyManagerHomePage(propertyList);
//		this.setSize(1024,700);
//		this.setVisible(true);
//		this.setResizable(false);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
//	}
	
	// Singleton
//	private MyJFrame() {
////		homePage = new propertyManagerHomePage();
////		setContentPane(homePage);
//		this.setSize(1024,700);
//		this.setVisible(true);
//		this.setResizable(false);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
//	}
//	public static MyJFrame getMyJFrame(){  
//		  return myJFrame;  
//	}  

	/**
	 * Initialize the contents of the frame.
	 */
//	public void initialize() {
//		
////		File propertyPics = new File("src/propertyImages/");
////		File[] propertyPictureFiles = propertyPics.listFiles();
////		String[] propertyPicturePath = propertyPics.list();
////		for(int i = 0; i < propertyPicturePath.length; ++i) {
////			StringBuilder path = new StringBuilder("propertyImages/");
////			propertyPicturePath[i] = path + propertyPicturePath[i];
////		}
////		Property property = new Property(1, new Address("Solstice", "Cyberjaya Selengor 62000"), 850, 10000,propertyPicturePath, 3,5, "condo");
////
////		setPanelToProperty(property);
//		 // JFrame class, startPoint(JPanel homepage)
////		setPanelToHomeAndSearch();
//		this.setSize(1024,700);
//		this.setVisible(true);
//		this.setResizable(false);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
//	}
	public void setPanelToLogin() {
		setContentPane(loginPage);
	}
	
	public void setPanelToSignup() {
		setContentPane(signupPage);
	}
	public LoginPage getLoginPage() {
		return loginPage;
	}
	
	public PropertyManagerHomePage getPropertyManagerHomePage() {
		return homePage;
	}
//	public JButton getLoginButton() {
//		return loginPage.getLoginButton();
//	}
//	public JTextField getUsernameField() {
//		return loginPage.getUsernameField();
//	}
//	
//	public JPasswordField getPasswordField() {
//		return loginPage.getPasswordField();
//	}
//	public JLabel getErrorLabel() {
//		return loginPage.getErrorLabel();
//	}
	
//	public boolean validateLogin(String username, String password) throws FileNotFoundException {
//		return loginPage.validateLogin(username, password);
//	}
	
	
	
	public void setPanelToProperty(Property property) {
		currentProperty = new SpecificPropertyView(property);
		setContentPane(currentProperty);
	}
	public void setPanelToHomeAndSearch(ArrayList<Property> propertyList) {
		Collections.sort(propertyList, new propertyComparatorByActive()); // sort by active first
		homePage.setNewProperties(propertyList);
		setContentPane(homePage);
	}
//	public ArrayList<JButton> getPropertiesViewDetailsButtons() {
//		return homePage.getPropertiesViewDetailsButtons();
//	}
//	
//	public JButton getSearchButton() {
//		return homePage.getSearchButton();
//	}
//	public JComboBox<String> getPropertTypeComboBox(){
//		return homePage.getPropertTypeComboBox();
//	}
//	
//	public JComboBox<String> getMinPriceComboBox(){
//		return homePage.getMinPriceComboBox();
//	}
//	
//	public JComboBox<String> getMaxPriceComboBox(){
//		return homePage.getMaxPriceComboBox();
//	}
//	
//	public JComboBox<String> getMinSizeComboBox(){
//		return homePage.getMinSizeComboBox();
//	}
//	
//	public JComboBox<String> getMaxSizeComboBox(){
//		return homePage.getMaxSizeComboBox();
//	}
//	
//	public JComboBox<String> getFurnishingCombobox(){
//		return homePage.getFurnishingCombobox();
//	}
//	
//	public JComboBox<String> getMinBedCombobox(){
//		return homePage.getMinBedCombobox();
//	}
//	
//	public JComboBox<String> getMaxBedCombobox(){
//		return homePage.getMaxBedCombobox();
//	}
//	
//	public JComboBox<String> getProjectsCombobox(){
//		return homePage.getProjectsCombobox();
//	}
//	
//	public JLabel getlogOutLabel() {
//		return homePage.getlogOutLabel();
//	}
	
	public JLabel getBackIconLabel() {
		return currentProperty.getBackIconLabel();
	}
	public SpecificPropertyView getCurrentPropertyView() {
		return currentProperty;
	}
	
//	public JButton getResetButton() {
//		return homePage.getResetButton();
//	}
	
	public void logOut() {
		loginPage = new LoginPage();
		homePage = new PropertyManagerHomePage();
		signupPage = new SignupPage();
		requestsPage = new RentRequestsPage();
		newPropertyPage = new NewPropertyPage();
		managePropertiesPage = new ManagePropertiesPage();
		SpecificManagerPropertyView = new SpecificManagerPropertyView();
		editPage = new EditPage();
		setPanelToLogin();

	}
	
//	public JLabel getCloseMenu() {
//		return homePage.getCloseMenu();
//	}
//	
//	public JComboBox<String> getActivationStatusCombobox(){
//		return homePage.getActivationStatusCombobox();
//	}
//	
//	public JComboBox<String> getMinRentalRateCombobox(){
//		return homePage.getMinRentalRateCombobox();
//	}
//	
//	public JComboBox<String> getMaxRentalRateCombobox(){
//		return homePage.getMaxRentalRateCombobox();
//	}
//	
//	public JCheckBox[] getFacilitiesCheckboxList() {
//		return homePage.getFacilitiesCheckboxList();
//	}
//	
//	public JCheckBox[] getFeaturesCheckboxList() {
//		return homePage.getFeaturesCheckboxList();
//	}
	
//	public JLabel getCreateNewAccountLabel() {
//		return loginPage.getCreateNewAccountLabel();
//	}
	
	
	
	public SignupPage getSignupPage() {
		return signupPage;
	}
	
//	public RentRequestsPage getPanelToRequestsPage() {
//		return requestsPage;
//	}
	
/////////////////////////////////////////////////////////////////////////////////////////////
//abdo's part

	public RentRequestsPage getRequestsPage()  {
		return requestsPage;
	}
	public void setPanelToRequestsPage()  {
		setContentPane(requestsPage);
	}
	
	public NewPropertyPage getNewPropertyPage()  {
		return newPropertyPage;
	}
	public void setPanelToNewPropertyPage()  {
		setContentPane(newPropertyPage);
	}
	
	public ManagePropertiesPage getManagePropertiesPage()  {
		return managePropertiesPage;
	}
	public void setPanelToManagePropertiesPage() {
		setContentPane(managePropertiesPage);
	}
	
	public SpecificManagerPropertyView getSpecificManagerPropertyView()  {
		return SpecificManagerPropertyView;
	}
	public void setPanelToSpecificManagerPropertyView(Property p)  {
		SpecificManagerPropertyView = new SpecificManagerPropertyView(p);
		setContentPane(SpecificManagerPropertyView);
	}
	
	public EditPage getEditPage() {
		return editPage;
	}
	public void setPanelToEditPage() {
		setContentPane(editPage);
	}
	
	
}
