//develop aprogram to take character and return, type of character.

package Method;

public class CharacterType {
	public static void checkCharacterType(char ch) {
		if(Character.isLowerCase(ch)) {
			System.out.println(ch + " ia a lower case character.");
		} else if(Character.isUpperCase(ch)) {
			System.out.println(ch + " ia a uppper case character.");
		} else if(Character.isDigit(ch)) {
			System.out.println(ch + " ia a Digit.");
		} else {
			System.out.println(ch + " ia a Special Character.");
		}
	}
	
	public static void main(String[] args) {
		checkCharacterType('@');
		checkCharacterType('#');
		checkCharacterType('a');
		checkCharacterType('A');
		checkCharacterType('8');
	}
	

}
