package LoginConsole;

public class SLogin {
	
	// 의존성 주입 
	private EAccount eAccount;
	
	public SLogin() {
		this.eAccount = new EAccount(); 
	}
	
	public VAccount login(String id) {
		VAccount vAccount=eAccount.getAccount(id); 
		return vAccount; 
	}

}
