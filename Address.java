
public class Address {
	private String project;
	private String fullAddress;

	public Address(String project, String fullAddress) {
		this.project = project;
		this.fullAddress = fullAddress;

	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	public String getFullAddress() {
		return fullAddress;
	}
	public void setFullAddress(String fullAddress) {
		this.fullAddress = fullAddress;
	}
}
