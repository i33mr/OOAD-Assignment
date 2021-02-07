// package admin;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Scanner;
public class Property {
	private static int lastID;
    private int propertyID;
	private String titileName;
	private double price;
	private int size;
	private String[] propertyPicturePath;
	private Address propertyAddress;
	private int bedRoomsNum;
	private int bathRoomsNum;
	private String propertyType;
    private String furnishing;
	private String propertyActivationStatus;
	private String propertyApprovalStatus;
	private String[] availableFacilities;
	private String[] availableFeatures;
	private String description;
	private String tenantName;
	private String agentName;
	
	
	public Property(int propertyID,String titileName,double price,int size, String[] propertyPicturePath,Address propertyAddress, 
					int bedRoomsNum, int bathRoomsNum, String propertyType, String furnishing,   String propertyActivationStatus,
                                        String propertyApprovalStatus, String[] availableFacilities, String[] availableFeatures,
                                        String description, String tenantName, String agentName) {
											
        this.propertyID = propertyID;
		this.titileName = titileName;
        this.size = size;
		this.price = price;
		this.propertyPicturePath = propertyPicturePath;
        this.propertyAddress = propertyAddress;
		this.bathRoomsNum= bathRoomsNum;
		this.bedRoomsNum = bedRoomsNum;
		this.propertyType = propertyType;
        this.furnishing = furnishing;
        this.propertyActivationStatus = propertyActivationStatus;
        this.propertyApprovalStatus = propertyApprovalStatus;
        this.availableFacilities = availableFacilities;
        this.availableFeatures = availableFeatures;
        this.description = description;
        this.tenantName = tenantName;
        this.agentName = agentName;
	}
		
//	public Property(int propertyID, String titileName, double price, int size, String[] propertyPicturePath, Address propertyAddress, 
//			int bedRoomsNum, int bathRoomsNum, String propertyType, String furnishing) {
//		// TODO Auto-generated constructor stub
//		 	this.propertyID = propertyID;
//			this.titileName = titileName;
//	        this.size = size;
//			this.price = price;
//			this.propertyPicturePath = propertyPicturePath;
//	        this.propertyAddress = propertyAddress;
//			this.bathRoomsNum= bathRoomsNum;
//			this.bedRoomsNum = bedRoomsNum;
//			this.propertyType = propertyType;
//	        this.furnishing = furnishing;
//	}
	
	public Property(String titileName,double price,int size, Address propertyAddress, 
			int bedRoomsNum, int bathRoomsNum, String propertyType, String furnishing,   String propertyActivationStatus,
                                String propertyApprovalStatus, String[] availableFacilities, String[] availableFeatures,
                                String description, String tenantName, String agentName) {

		this.titileName = titileName;
		this.size = size;
		this.price = price;
//		this.propertyPicturePath = propertyPicturePath;
		this.propertyAddress = propertyAddress;
		this.bathRoomsNum= bathRoomsNum;
		this.bedRoomsNum = bedRoomsNum;
		this.propertyType = propertyType;
		this.furnishing = furnishing;
		this.propertyActivationStatus = propertyActivationStatus;
		this.propertyApprovalStatus = propertyApprovalStatus;
		this.availableFacilities = availableFacilities;
		this.availableFeatures = availableFeatures;
		this.description = description;
		this.tenantName = tenantName;
		this.agentName = agentName;
		
		try {
			lastID = readPropertyLastID();
			this.propertyID = ++lastID;
			sendPropertyLastID(lastID);
	        this.savePropertyFile();
	    } catch (IOException ex) {
	       System.out.println(ex.getMessage());
	    }
}

	private int readPropertyLastID() throws FileNotFoundException {
		File lastIDFile = new File("src/System/Property Manager/PropertyLastID.txt");
		if(lastIDFile.exists()) {
			Scanner lastIDScanner = new Scanner(lastIDFile);
			int lastIDread =lastIDScanner.nextInt();
			lastIDScanner.close();
			return lastIDread;
		}
		else
			return 0;
		
	}

	private void sendPropertyLastID(int lastID){ // set the lastID file to the new one.
		try{
			FileWriter LastIDFile = new FileWriter("src/System/Property Manager/PropertyLastID.txt"); 
			PrintWriter outputNames =  new PrintWriter(LastIDFile);	
			outputNames.println(lastID);
			outputNames.close();
		}
		catch(IOException ex){
			System.out.println(ex.getMessage());
		}	
	}

		public final void savePropertyFile() throws IOException{
//		    String agentUsername = "testAgent"; //TODO REMOVE THIS
			new File("src\\System\\Property Manager\\" + agentName + "\\Properties\\"+ propertyID + "\\propertyPics\\").mkdirs();                                              // code for making order file in restaurant directory
		    File propertyInfo = new File("src\\System\\Property Manager\\" + agentName + "\\Properties\\" + propertyID + "\\propertyInfo.txt"); //Adds order filename to names.txt file. Used to fetch order file names later.
		    FileWriter propertyFileWriter = new FileWriter(propertyInfo, false);
		    PrintWriter propertyPrintWriter = new PrintWriter(propertyFileWriter);
		
		    propertyPrintWriter.println(propertyID);
		    propertyPrintWriter.println(titileName);
		    propertyPrintWriter.println(price);
		    propertyPrintWriter.println(size);
		    propertyPrintWriter.println(propertyAddress.getProject());
		    propertyPrintWriter.println(propertyAddress.getFullAddress());
		    propertyPrintWriter.println(bedRoomsNum);
		    propertyPrintWriter.println(bathRoomsNum);
		    propertyPrintWriter.println(propertyType);
		    propertyPrintWriter.println(furnishing);
		    propertyPrintWriter.println(propertyActivationStatus);
		    propertyPrintWriter.println(propertyApprovalStatus);
		    
		    for (String s : getAvailableFacilities()){
		            propertyPrintWriter.print(s + "|");
		    }
		    propertyPrintWriter.print("\n");
		    
		    for (String s : getAvailableFeatures()){
		            propertyPrintWriter.print(s + "|");
		    }
		    propertyPrintWriter.print("\n");
		    
		    propertyPrintWriter.println(description);
		    propertyPrintWriter.println(tenantName);
		    propertyPrintWriter.println(agentName);      
		
		    propertyPrintWriter.close();
		            propertyFileWriter.close();

		}

	public String getTitileName() {
		return titileName;
	}
	public void setTitileName(String titileName) {
		this.titileName = titileName;
	}
	public int getPropertyID() {
		return propertyID;
	}
	public void setPropertyID(int propertyID) {
		this.propertyID = propertyID;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
        public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String[] getPropertyPicturePath() {
		return propertyPicturePath;
	}
	public void setPropertyPicturePath(String[] propertyPicturePath) {
		this.propertyPicturePath = propertyPicturePath;
	}
	public Address getPropertyAddress() {
		return propertyAddress;
	}
	public void setPropertyAddress(Address propertyAddress) {
		this.propertyAddress = propertyAddress;
	}
	public int getBedRoomsNum() {
		return bedRoomsNum;
	}
	public void setBedRoomsNum(int bedRoomsNum) {
		this.bedRoomsNum = bedRoomsNum;
	}
	public int getBathRoomsNum() {
		return bathRoomsNum;
	}
	public void setBathRoomsNum(int bathRoomsNum) {
		this.bathRoomsNum = bathRoomsNum;
	}
	public String getPropertyType() {
		return propertyType;
	}
	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
	}
        public String getFurnishing() {
		return furnishing;
	}
	public void setFurnishing(String furnishing) {
		this.furnishing = furnishing;
	}
	public String getPropertyActivationStatus() {
		return propertyActivationStatus;
	}
	public void setPropertyActivationStatus(String propertyActivationStatus) {
		this.propertyActivationStatus = propertyActivationStatus;
	}
	public String[] getAvailableFacilities() {
		return availableFacilities;
	}
	public void setAvailableFacilities(String[] availableFacilities) {
		this.availableFacilities = availableFacilities;
	}
	public String getPropertyApprovalStatus() {
		return propertyApprovalStatus;
	}
	public void setPropertyApprovalStatus(String propertyApprovalStatus) {
		this.propertyApprovalStatus = propertyApprovalStatus;
	}
	public String[] getAvailableFeatures() {
		return availableFeatures;
	}
	public void setAvailableFeatures(String[] availableFeatures) {
		this.availableFeatures = availableFeatures;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTenantName() {
		return tenantName;
	}
	public void setTenantName(String tenantName) {
		this.tenantName = tenantName;
	}
	public String getAgentName() {
		return agentName;
	}
	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}
	
	public double getRentalRate() {
		double rentalRate = price/ size;
//		rentalRate = (int)(rentalRate * 100);
//		rentalRate = rentalRate / 100.0;
//		return rentalRate;
		BigDecimal bd = new BigDecimal(rentalRate).setScale(2, RoundingMode.HALF_UP);
		return bd.doubleValue();
	}
	
}
