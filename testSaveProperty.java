
public class testSaveProperty {
	public static void main(String[] args) {
        try {
        String [] featureList = {"Gym", "Swimming Pool","Kitchen Cabinet","Supermarket"};
        String [] facilityList = {"Facility 1", "Facility 2", "Facility 3","Facility 4"};
        Property test = new Property(1, "Solstice 1", 500.0, 100, null, new Address("Solstice", "ST1-23489"), 4, 3, "Bungalow" , "Furnished", "Active", "Approved", facilityList, featureList, "This place is real cool yo", "I'm tenant", "i'm agent");
        test.savePropertyFile();
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
