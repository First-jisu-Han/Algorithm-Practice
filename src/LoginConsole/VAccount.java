package LoginConsole;

// DTO 역할
public class VAccount {
	
	private String password; 
	private String id;
	private String name; 
	
	public VAccount() {	
	}
	
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password=password;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id=id; 
	}
	public String getName() {
		return name; 
	}
	public void setName(String name) {
		this.name=name; 
	}
	

}
