package e;

public class Ques5 {
	public static void main(String[] args) {

		UserRegistration registration=new UserRegistration();
		
		try {
			registration.registerUser("raj", "usa");
		} catch (InvalidCountryException e) {
			System.out.println(e.getMessage());
		}
	}

}
