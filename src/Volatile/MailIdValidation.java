package Volatile;

import org.apache.commons.validator.routines.EmailValidator;


class MailIdValidation {

	public static void main(String args[]) {
		String st = "sudeep@gmail.com";
		String st1 = "sudeep@gmail.com.com";
		String st2 = "sudeep@gmail.co.in";

		System.out.println(isValidEmailAddress(st));
		System.out.println(isValidEmailAddress(st1));
		System.out.println(isValidEmailAddress(st2));
	}

	public static boolean isValidEmailAddress(String email) {

		 String ePattern ="^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
		 java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
		 java.util.regex.Matcher m = p.matcher(email);
		 return m.matches();

		//boolean valid = EmailValidator.getInstance().isValid(email);

		//return valid;
	}
}
