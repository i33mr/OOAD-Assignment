import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Agent extends PropertyManager{
    private int licenseNum;

    public Agent(String userName, String password, String fullName, String contact, String email, String role, String status, int licenseNum) {
    	super(userName, password, fullName, contact, email, role, status);
		this.licenseNum = licenseNum;
		try {
			sendLicenseIDToFile();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

    
    public int getLicenseNum() {
        return licenseNum;
    }
    public void setLicenseNum(int licenseNum) {
        this.licenseNum = licenseNum;
    }
    
    public void sendLicenseIDToFile() throws FileNotFoundException {
    	File licenseID = new File(getPropertyManagerDir() + "/licenseID.txt"); // make a text file to store the restaurant information
		PrintWriter outputLicenseID =  new PrintWriter(licenseID); 
		outputLicenseID.println(licenseNum);
		outputLicenseID.close();
    }
    
}
