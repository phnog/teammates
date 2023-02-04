public class EmailVerification {
    
}
package emailValidation;

public class EmailValidation {
 
	private String email;

	
	
	
	
	public static String getEmailValido(String email) {
		
		String aux = email.substring(email.length() - 1);
		
		
		if(email.contains(",") && email.contains("!") && email.contains("#") && email.contains("$") && email.contains("¨") 
				&& email.contains("&") && email.contains("*") && email.contains("(") && email.contains(")") && email.contains("´") 
				&& email.contains("`") && email.contains("/") && email.contains("?") && email.contains("}") && email.contains("{") 
				&& email.contains("'\'")) return "não valido";
	
		if(email.contains("@") && email.contains(".") && (aux.equals(".") == false))
			return "possui";
		
		return "não possui";
	}
	
	
	
	
	