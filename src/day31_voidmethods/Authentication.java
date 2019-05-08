package day31_voidmethods;

public class Authentication {
	public static void main(String[] args) {
		login("mentroing@cybertekschool.com", "mentor001");
	}

	public static void login(String username, String password) {
		String validUsername = "mentroing@cybertekschool.com";
		String validPassword = "mentor001";
		if(username.equalsIgnoreCase(validUsername) && password.equalsIgnoreCase(validPassword)) {
			System.out.println("Login succesful");
		}else {
			System.out.println("Sign in failed");
		}
	}
}
