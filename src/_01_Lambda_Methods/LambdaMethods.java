package _01_Lambda_Methods;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
	
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		
		printCustomMessage((s)->{
			String backwards = "";
			for(int i = s.length() - 1; i >= 0 ; i--) {
				backwards += s.charAt(i);
			}
			System.out.println(backwards);
		}, "repeat");

		
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		
		printCustomMessage((s)->{
			String newString = "";
			for(int i = 0; i < s.length() ; i++) {
				if(i % 2 == 0) {
					newString += s.substring(i, i+1).toUpperCase();
				}else {
					newString += s.substring(i, i+1);
				}
				
			}
			System.out.println(newString);
		}, "repeat");
		
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		
		printCustomMessage((s)->{
			String newString = "";
			for(int i = 0; i < s.length() ; i++) {
				newString += s.charAt(i) + ".";
				
			}
			System.out.println(newString.substring(0, newString.length() - 1));
		}, "repeat");
		
		
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
		
		printCustomMessage((s)->{
			String newString = "";
			String[] vowels = {"a","e","i","o","u"};
			
			for(int i = 0; i < s.length(); i++) {
				boolean isVowel = false;
				
				for(int v = 0; v < vowels.length; v++) {
					if(s.substring(i, i+1).equalsIgnoreCase(vowels[v])) {
						isVowel = true;
						break;
					}
				}
				
				if(!isVowel) {
					newString += s.charAt(i);
				}
				
				
			}
			System.out.println(newString);
		}, "repeat");
	
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	
