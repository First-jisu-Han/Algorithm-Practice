package LoginConsole;

import java.util.Scanner;

public class PLogin {
	
	private SLogin sLogin; 
	
	public PLogin() {
		this.sLogin=new SLogin(); 
	}
	
	
	public VAccount login(){
		
		while (true) {
			System.out.print("아이디를 입력하세요: ");
			Scanner scanner = new Scanner(System.in);
			String id = scanner.next();

			System.out.print("비밀번호를 입력하세요: ");
			String password = scanner.next();

			VAccount vAccount = this.sLogin.login(id);
			if (vAccount == null) {
				print("존재하지 않는 아이디입니다.");
				continue;
			} else if (isSuccess(id, password) == true) {
				return vAccount;
			} else {
				continue;
			}
		}

		// 로그인 성공시 break문 빠져나가면서 vAccount 객체 반환, 성공이 아닐시 계속 while 루프를 돈다.

	}
	
	
	// 로그인 성공 / 실패 판단 메서드 
	public boolean isSuccess(String id, String password) {
		// 아이디로 해당 데이터 모두 vAccount로 던지기
		VAccount vAccount = this.sLogin.login(id);

		// 비밀번호 확인 맞으면 true, 틀리면 false
		if (vAccount.getPassword().equals(password)) {
			print("로그인 성공");
			return true;
		} else {
			print("아이디와 비밀번호를 확인하세요");
			return false;
		}
	}
	
	public void print(String message) {
		System.out.println(message);
	}
	
	
}
