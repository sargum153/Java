package String;

public class StringMethod {
	public static void main(String[] args) {
		//String name = "Java Programming";
		
		//System.out.println(name.length());
		
		//System.out.println(name.toUpperCase());
		//System.out.println(name.toLowerCase());
		//System.out.println(name.charAt(2));
		//System.out.println(name.substring(5,10));
		//System.out.println(name.contains("Pro"));
		
		String name1 = "Hello, ";
		String name2 = "Welcome to Java";
		
		System.out.println(name1.concat(name2));
		System.out.println(name1.equals(name2));

		String name3 = "Hello";
		String name4 = "hello";
		
		System.out.println(name3.equalsIgnoreCase(name4));
		
		//trim :- it will be working on Starting and ending space.
		String name5 = "     Hi      Sargum    ";
		System.out.println(name5.trim());
		
		
	}
}
