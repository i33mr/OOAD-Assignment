import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Owner extends PropertyManager{
    private ArrayList<String> grants = new ArrayList<>();

    public Owner(String userName, String password, String fullName, String contact, String email, String role, String status) {
    	super(userName, password, fullName, contact, email, role, status);
    	
    }
    public ArrayList<String> getGrants() {
        return grants;
    }
    public void setGrants(ArrayList<String> grants) {
        this.grants = grants;
    }
    public void addToGrantList(String newGrant) {
        this.grants.add(newGrant);
        try {
			sendGrantsToFile(newGrant);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    public void sendGrantsToFile(String grant) throws IOException {
    	FileWriter grantsFile = new FileWriter(getPropertyManagerDir() + "/grants.txt", true); // make a text file to store the restaurant information
		PrintWriter outputLicenseID =  new PrintWriter(grantsFile); 
		outputLicenseID.println(grant);
		outputLicenseID.close();
    }
}
