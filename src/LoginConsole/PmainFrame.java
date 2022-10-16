package LoginConsole;

public class PmainFrame {
	
	private PLogin pLogin;
	
	public PmainFrame() {
		this.pLogin=new PLogin(); 
	}
	
	public void run() {
		VAccount vAccount = this.pLogin.login(); 
		
}
}
