package LoginConsole;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EAccount {

	private String id; 
	private String password; 
	private String name; 

	
	public EAccount() {
	}
	
	// id 일치 여부 
	private boolean read(String id) { 
		boolean flag=false; 
		try {
			File file = new File("data/account"); 
			Scanner scanner = new Scanner(file);
			
			// 루프돌며 일치하는 Id 값 찾기 
			while (scanner.hasNext() && flag!=true ) {
				
				this.id = scanner.next();
				this.password = scanner.next();
				this.name = scanner.next();
				
				
				// 일치하는 아이디 값 있다면 flag true 
				if(this.id.compareTo(id)== 0) {
					flag=true; 
				}
				}
				
			scanner.close();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		return flag; 
	}
	
	public VAccount getAccount(String id) {
		VAccount vAccount = null ;  // 디폴트 값 
		
		boolean flag =this.read(id);
		
		// id 존재할때 
		if(flag) {
			vAccount= new VAccount();
			vAccount.setId(this.id);
			vAccount.setPassword(this.password);
			vAccount.setName(this.name); 
		} 
		return vAccount;
		
	}



}
